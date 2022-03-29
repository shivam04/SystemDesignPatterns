package k.multiplefactorypattern;

/**
 * Created by shivam.si on 29/03/22 2:58 pm
 */

public class NyPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equalsIgnoreCase("vigge")) {
            pizza = new NyVeggiePizza();
        } else if(type.equalsIgnoreCase("clam")) {
            pizza = new NyClamPizza();
        } else if(type.equalsIgnoreCase("cheese")) {
            pizza = new NyCheesePizza();
        } else {
            pizza = new NyPepperoniPizza();
        }
        return pizza;
    }
}
