package main.java;

public interface TotalPrice {
    // добавляем коробки в общий заказ
    void addBox(IBox box);

    //удаляем коробки из заказа
    boolean removeBox(IBox box);

    //считаем стоимость всего заказа
    double calculateTotalPrice();
}
