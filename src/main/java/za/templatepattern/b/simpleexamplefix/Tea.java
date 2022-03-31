package za.templatepattern.b.simpleexamplefix;

/**
 * Created by shivam.si on 31/03/22 11:17 am
 */

public class Tea extends CoffeeBeverage{
    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
