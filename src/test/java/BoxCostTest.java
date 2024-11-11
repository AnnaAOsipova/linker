import main.java.BoxCost;
import main.java.IBox;
import main.java.IProduct;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoxCostTest {

    static Stream<Double> prices() {
        return Stream.of(10.0, 20.5, 5.0, 0.0);
    }

    @ParameterizedTest
    @MethodSource("prices")
    public void testCalculateTotalPrice(double expectedPrice) {
        IBox box = new BoxCost();
        IProduct product = new ProductStub(expectedPrice) {
            @Override
            public void addToBox(IBox box) {
            }

            @Override
            public boolean removeFromBox(IBox box) {
                return false;
            }
        }; // Стеб для IProduct
        box.addProduct(product);

        assertEquals(expectedPrice, box.calculateTotalPrice());
    }
}
