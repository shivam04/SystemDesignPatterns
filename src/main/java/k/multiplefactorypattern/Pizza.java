package k.multiplefactorypattern;

import java.util.ArrayList;

/**
 * Created by shivam.si on 29/03/22 2:49 pm
 */

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();
    public void prepare() {
        System.out.println("Preparing: " + name);
        System.out.println("Tossing Dough: " + dough);
        System.out.println("Adding Sauce: " + sauce);
        System.out.println("Adding Toppings: ");
        for(String topping: toppings) {
            System.out.println("  " + topping);
        }
    }
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
}
