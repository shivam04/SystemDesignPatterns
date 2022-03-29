package k.multiplefactorypattern;

/**
 * Created by shivam.si on 29/03/22 3:17 pm
 */

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NyPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Shivam Ordered a " + pizza.getName() + "\n");
        pizza = chicagoPizzaStore.orderPizza("cheese");
        System.out.println("Shubham Ordered a " + pizza.getName() + "\n");
    }
}
