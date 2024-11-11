package main.java;

public interface ITotalOrder {
    //добавляем коробку в заказ
    public void addBox(IBox box);

    // реализуем возможность удалить коробку из заказа
    boolean removeBox(IBox box);

    // считаем общую стоимость заказа
    double calculateTotalPrice();
}

