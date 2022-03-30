package n.examplesingleton;

/**
 * Created by shivam.si on 30/03/22 6:31 am
 */

public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {}

    public static Singleton getInstance() {
        if(uniqueInstance == null)
            uniqueInstance = new Singleton(); //Lazy instantiation
        return uniqueInstance;
    }

    //other useful methods
}
