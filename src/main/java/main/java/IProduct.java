package main.java;
//для каждого товара определяем стоимость
public interface IProduct {
        double getPrice();
        void addToBox(IBox box);
        boolean removeFromBox(IBox box);
    }