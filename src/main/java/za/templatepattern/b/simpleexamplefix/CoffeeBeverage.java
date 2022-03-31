package za.templatepattern.b.simpleexamplefix;

/**
 * Created by shivam.si on 31/03/22 11:14 am
 */

public abstract class CoffeeBeverage {
    final void prepare() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected abstract void brew();

    protected abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling Water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

}
