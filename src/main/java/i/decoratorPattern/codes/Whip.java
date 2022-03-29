package i.decoratorPattern.codes;

/**
 * Created by shivam.si on 29/03/22 1:26 pm
 */

public class Whip extends CondimentDecorator{

    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if(this.getSize() == Size.TALL) {
            return cost + .10;
        } else if(this.getSize() == Size.GRANDE) {
            return cost + .15;
        } else {
            return cost + .20;
        }
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
