import main.java.IProduct;

public abstract class ProductStub implements IProduct {
    public ProductStub(double expectedPrice) {
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
