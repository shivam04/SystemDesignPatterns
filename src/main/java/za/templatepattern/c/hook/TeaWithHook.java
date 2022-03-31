package za.templatepattern.c.hook;

/**
 * Created by shivam.si on 31/03/22 11:17 am
 */

public class TeaWithHook extends CoffeeBeverageWithHook {
    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
