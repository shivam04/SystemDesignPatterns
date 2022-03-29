package l.multiplefactorypattern.expand;

/**
 * Created by shivam.si on 29/03/22 4:57 pm
 */

public class NYPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        if(type.equalsIgnoreCase("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if(type.equalsIgnoreCase("veggie")) {
            pizza = new ViggePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if(type.equalsIgnoreCase("clams")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("New York Style Clams Pizza");
        } else {
            pizza = new PepperoniPizza(pizzaIngredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        return pizza;
    }
}
