package main.java;

import java.util.ArrayList;
import java.util.List;

public class BoxCost implements IBox {
    List<IProduct> products = new ArrayList<>();

    @Override
    public void createBox(IProduct product) {

    }

    @Override   // добавляем продукты в список продуктов в рамках коробки
    public void addProduct(IProduct product) {
        products.add(product);
    }

    @Override
    public boolean removeProduct(IProduct product) {
        boolean result = false;
        if (products.contains(product)) {
            products.remove(product);
            result = true;
        }
        return result;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (IProduct product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}
