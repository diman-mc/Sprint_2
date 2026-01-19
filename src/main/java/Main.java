public class Main {
    public static void main(String[] args) {
        //Объекты
        // Мясо: 5 кг по 100 руб
        model.Meat meat = new model.Meat(5, 100.0);
        // красные яблоки: 10 кг по 50 руб
        model.Apple redApple = new model.Apple(10, 50.0, model.constants.Colour.RED);
        // зелёные яблоки: 8 кг по 60 руб
        model.Apple greenApple = new model.Apple(8, 60.0, model.constants.Colour.GREEN);

        // Создание массива продуктов
        model.Food[] product = {meat, redApple, greenApple};

        // Создание корзины
        service.ShoppingCart cart = new service.ShoppingCart(product);

        // Вывод результатов
        System.out.println("Общая сумма без скидки: " + cart.getTotalPriceWithoutDiscount());
        System.out.println("Общая сумма со скидкой: " + cart.getTotalPriceWithDiscount());
        System.out.println("Сумма вегетарианских продуктов без скидки: " + cart.getTotalVegPriceWithoutDiscount());
    }
}
