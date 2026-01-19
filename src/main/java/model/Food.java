package model;

public abstract class Food implements Discountable {
    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    public Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    //Метод для получения количество продукта в килограммах
    public int getAmount() {
        return amount;
    }

    //Метод для получения цены
    public double getPrice() {
        return price;
    }

    //Метод - Вегетарианский продукт или нет
    public boolean isVegetarian() {
        return isVegetarian;
    }

    @Override
    public double getDiscount() {
        return 0.0;
    }
}
