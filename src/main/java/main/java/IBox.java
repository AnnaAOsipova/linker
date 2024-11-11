package main.java;
// собираем коробки из товаров для доставки, определяем общую стоимость коробки

public interface IBox {
    public void createBox(IProduct product);

    public void addProduct(IProduct product);

    // реализуем возможность удалить продукт из коробки
    boolean removeProduct(IProduct product);

    // считаем общую стоимость коробки
    double getPrice();

    // считаем общую стоимость всех продуктов в коробке
    default double calculateTotalPrice() {
        return 0;
    }
}


