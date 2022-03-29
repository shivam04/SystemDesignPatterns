package i.decoratorPattern.codes;

/**
 * Created by shivam.si on 29/03/22 1:25 pm
 */

public class SteamedMilk extends CondimentDecorator{

    public SteamedMilk(Beverage beverage) {
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
        return beverage.getDescription() + ", Steamed Milk";
    }
}
