package za.templatepattern.a.simpleExample;

/**
 * Created by shivam.si on 31/03/22 11:08 am
 */

public class Coffee {
    void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    private void addSugarAndMilk() {
        System.out.println("Adding Sugar and Milk");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    private void brewCoffeeGrinds() {
        System.out.println("Dripping Coffee through filters.");
    }

    private void boilWater() {
        System.out.println("Boiling Water");
    }

}
