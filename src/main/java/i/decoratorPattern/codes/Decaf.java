package i.decoratorPattern.codes;

/**
 * Created by shivam.si on 29/03/22 1:22 pm
 */

public class Decaf extends Beverage{

    public Decaf() {
        description = "Decaf";
    }


    @Override
    public double cost() {
        if(this.getSize() == Size.TALL) {
            return 1.05;
        } else if(this.getSize() == Size.GRANDE) {
            return 1.30;
        } else {
            return 1.55;
        }
    }
}
