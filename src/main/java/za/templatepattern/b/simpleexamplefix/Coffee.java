package za.templatepattern.b.simpleexamplefix;

/**
 * Created by shivam.si on 31/03/22 11:16 am
 */

public class Coffee extends CoffeeBeverage{
    @Override
    protected void brew() {
        System.out.println("Dripping Coffee through filters.");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
