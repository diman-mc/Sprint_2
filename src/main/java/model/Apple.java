package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food {
    //у яблока есть поля, яблоко имеет метод getDiscount()
    private String colour;

    public Apple(int amount, double price, String colour) { //вход, принимает параметры
        super(amount, price, true); // Яблоки
        this.colour = colour;
    }

    //цвет яблока
    public String getColour() {
        return colour;
    }

    @Override //переопределение
    public double getDiscount() {
        if (Colour.RED.equals(colour)) { //если красное
            return Discount.APPLE_RED_DISC; //то скидка
        }
        return 0.0;
    }
}
