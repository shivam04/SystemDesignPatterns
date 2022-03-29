package i.decoratorPattern.codes;

/**
 * Created by shivam.si on 29/03/22 1:21 pm
 */

public class Espresso extends Beverage{

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        if(this.getSize() == Size.TALL) {
            return 1.99;
        } else if(this.getSize() == Size.GRANDE) {
            return 2.24;
        } else {
            return 2.49;
        }
    }
}
