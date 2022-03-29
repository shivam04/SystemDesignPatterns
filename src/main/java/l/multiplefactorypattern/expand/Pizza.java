package l.multiplefactorypattern.expand;

/**
 * Created by shivam.si on 29/03/22 4:50 pm
 */

public abstract class Pizza {
    String name;

    Dough dough;
    Cheese cheese;
    Veggie[] veggies;
    Sauce sauce;
    Pepperoni pepperoni;
    Clams clams;

    abstract void prepare();

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }
    public void box() {
        System.out.println("Place pizza in a box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
