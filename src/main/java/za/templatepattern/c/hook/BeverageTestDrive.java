package za.templatepattern.c.hook;

/**
 * Created by shivam.si on 31/03/22 11:34 am
 */

public class BeverageTestDrive {
    public static void main(String[] args) {
        TeaWithHook tea = new TeaWithHook();
        System.out.println("Making Tea!!");
        tea.prepare();

        CoffeeWithHook coffee = new CoffeeWithHook();
        System.out.println("\n\nMaking Coffee!!");
        coffee.prepare();
    }
}
