package za.templatepattern.c.hook;

/**
 * Created by shivam.si on 31/03/22 11:14 am
 */

public abstract class CoffeeBeverageWithHook {
    final void prepare() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantCondiments()) {
            addCondiments();
        }
    }

    protected abstract void brew();

    protected abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling Water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    boolean customerWantCondiments() {
        return true;
    }

}
