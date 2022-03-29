package h.instanceBasedDesign;

/**
 * Created by shivam.si on 29/03/22 12:24 pm
 */

public class Beverage {
    protected String description;
    protected boolean milk;
    protected boolean soy;
    protected boolean mocha;
    protected boolean whip;

    public void cost() {
        //it will compute the cost of all extra condiments
        // and sub-class cost(overridden) will add the cost of individual beverage type.
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean isSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean isMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public boolean isWhip() {
        return whip;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }
}
