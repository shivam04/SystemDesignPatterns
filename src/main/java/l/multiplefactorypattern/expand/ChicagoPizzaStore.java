package l.multiplefactorypattern.expand;

/**
 * Created by shivam.si on 29/03/22 4:59 pm
 */

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
        if(type.equalsIgnoreCase("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if(type.equalsIgnoreCase("veggie")) {
            pizza = new ViggePizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        } else if(type.equalsIgnoreCase("clams")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Clams Pizza");
        } else {
            pizza = new PepperoniPizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }
        return pizza;
    }
}
