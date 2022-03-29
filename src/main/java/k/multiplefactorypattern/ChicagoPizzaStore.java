package k.multiplefactorypattern;

/**
 * Created by shivam.si on 29/03/22 2:58 pm
 */

public class ChicagoPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equalsIgnoreCase("vigge")) {
            pizza = new ChicagoVeggiePizza();
        } else if(type.equalsIgnoreCase("clam")) {
            pizza = new ChicagoClamPizza();
        } else if(type.equalsIgnoreCase("cheese")) {
            pizza = new ChicagoCheesePizza();
        } else {
            pizza = new ChicagoPepperoniPizza();
        }
        return pizza;
    }
}
