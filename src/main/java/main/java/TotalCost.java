package main.java;

import java.util.ArrayList;
import java.util.List;

class TotalCost implements TotalPrice {
    List<IBox> boxes = new ArrayList<>();

    @Override
    public void addBox(IBox box) {
        boxes.add(box);
    }

    @Override
    public boolean removeBox(IBox box) {
        boolean result = false;
        if (boxes.contains(box)) {
            boxes.remove(box);
            result = true;
        }
        return result;
    }

    @Override   // считаем общую стоимость всех коробок/продуктов в заказе
    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (IBox box : boxes) {
            totalPrice += box.getPrice();
        }
        return totalPrice;
    }
}