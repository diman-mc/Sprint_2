package service;

import model.Food;

//Работа с корзиной для продуктов
public class ShoppingCart {
    private Food[] element; //массив продуктов
    public ShoppingCart(Food[] element) { //
        this.element = element;
    }
    //1 метод - получить общую сумму товаров в корзине без скидки
    public double getTotalPriceWithoutDiscount() {
        double total = 0.0;
        for (int i = 0; i < element.length; i++) {
            //К переменной total добавить результат умножения количества на цену текущего продукта
            total = total + element[i].getAmount() * element[i].getPrice();
        }
        return total;
    }
    //2 метод - получить общую сумму товаров в корзине со скидкой
    public double getTotalPriceWithDiscount() {
        double total = 0.0;
        for (int i = 0; i < element.length; i++) {
            double result = element[i].getAmount() * element[i].getPrice();
            double discountPercent = element[i].getDiscount(); // скидка
            result = result - (result * (discountPercent / 100.0));
            total = total + result;
        }
        return total;
    }
    //3 метод - получить общую сумму всех вегетарианских продуктов в корзине без скидки.
    public double getTotalVegPriceWithoutDiscount() {
        double total = 0.0;
        for (int i = 0; i < element.length; i++) {
            if (element[i].isVegetarian()) { //вегетарианское
                total = total + element[i].getAmount() * element[i].getPrice();
            }
        }
        return total;
    }
}