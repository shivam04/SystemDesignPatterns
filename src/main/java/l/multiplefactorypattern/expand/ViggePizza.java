package l.multiplefactorypattern.expand;

/**
 * Created by shivam.si on 29/03/22 4:54 pm
 */

public class ViggePizza extends Pizza{
    PizzaIngredientFactory pizzaIngredientFactory;

    public ViggePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing: " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        veggies = pizzaIngredientFactory.createVeggies();
    }
}
