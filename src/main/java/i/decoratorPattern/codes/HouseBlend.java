package i.decoratorPattern.codes;

/**
 * Created by shivam.si on 29/03/22 1:21 pm
 */

public class HouseBlend extends Beverage{

    public HouseBlend() {
        description = "House Blend";
    }

    @Override
    public double cost() {
        if(this.getSize() == Size.TALL) {
            return .89;
        } else if(this.getSize() == Size.GRANDE) {
            return 1.14;
        } else {
            return 1.39;
        }
    }
}
