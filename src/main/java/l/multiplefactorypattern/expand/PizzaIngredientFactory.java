package l.multiplefactorypattern.expand;

/**
 * Created by shivam.si on 29/03/22 4:36 pm
 */

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggie[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClams();
}
