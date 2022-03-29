package j.simpleFactoryPattern;

/**
 * Created by shivam.si on 29/03/22 2:51 pm
 */

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equalsIgnoreCase("vigge")) {
            pizza = new VeggiePizza();
        } else if(type.equalsIgnoreCase("clam")) {
            pizza = new ClamPizza();
        } else if(type.equalsIgnoreCase("cheese")) {
            pizza = new CheesePizza();
        } else {
            pizza = new PepperoniPizza();
        }
        return pizza;
    }
}
