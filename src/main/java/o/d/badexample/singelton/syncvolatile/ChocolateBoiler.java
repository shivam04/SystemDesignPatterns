package o.d.badexample.singelton.syncvolatile;

/**
 * Created by shivam.si on 30/03/22 6:58 am
 */

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private volatile static ChocolateBoiler chocolateBoiler;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static synchronized ChocolateBoiler getInstance() {
        if(chocolateBoiler == null) {
            synchronized (ChocolateBoiler.class) {
                if(chocolateBoiler == null) {
                    chocolateBoiler = new ChocolateBoiler();
                }
            }
        }
        return chocolateBoiler;
    }

    //use of volatile keyword ensures that multiple threads handle the chocolateBoiler instance correctly when it being initialized to the singleton instance.

    public void fill() {
        if(isEmpty()) {
            empty = false;
            boiled = false;
            //fill the boiler with milk and chocolate
        }
    }

    public void drain() {
        if(!isEmpty() && isBoiled()) {
            //drain the boiled milk and chocolate
            empty = true;
        }
    }

    public void boil() {
        if(!isEmpty() && !isBoiled()) {
            //bring the contents to boil
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
