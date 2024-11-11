import main.java.BoxCost;
import main.java.IBox;
import main.java.IProduct;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class BoxCostNegativeTest {

    @Test
    public void testRemoveNonExistentProduct() {
        IBox box = new BoxCost();
        IProduct product = new ProductStub(10.0) {
            @Override
            public void addToBox(IBox box) {

            }

            @Override
            public boolean removeFromBox(IBox box) {
                return false;
            }
        }; // Стеб для IProduct
        assertFalse(box.removeProduct(product)); // Продукт не добавлен, поэтому удаление должно вернуть false
    }

    @Test
    public void testCalculateTotalPriceWithNoProducts() {
        IBox box = new BoxCost();
        assertEquals(0.0, box.calculateTotalPrice(), "Total price of an empty box should be zero.");
    }
}

