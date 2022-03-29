package i.decoratorPattern.codes;

/**
 * Created by shivam.si on 29/03/22 1:23 pm
 */

public class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if(this.getSize() == Size.TALL) {
            return cost + .20;
        } else if(this.getSize() == Size.GRANDE) {
            return cost + .25;
        } else {
            return cost + .30;
        }
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
