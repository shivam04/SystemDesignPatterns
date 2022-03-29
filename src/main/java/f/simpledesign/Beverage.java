package f.simpledesign;

/**
 * Created by shivam.si on 29/03/22 12:24 pm
 */

public abstract class Beverage {
    protected String description;

    public String getDescription() {
        return description;
    }
    public abstract void cost();
}
