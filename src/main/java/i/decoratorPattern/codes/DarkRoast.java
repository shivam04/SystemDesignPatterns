package i.decoratorPattern.codes;

/**
 * Created by shivam.si on 29/03/22 1:23 pm
 */

public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        if(this.getSize() == Size.TALL) {
            return .99;
        } else if(this.getSize() == Size.GRANDE) {
            return 1.24;
        } else {
            return 1.49;
        }
    }
}
