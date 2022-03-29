package i.decoratorPattern.codes;

/**
 * Created by shivam.si on 29/03/22 1:26 pm
 */

public class Soy extends CondimentDecorator{
    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if(this.getSize() == Size.TALL) {
            return cost + .15;
        } else if(this.getSize() == Size.GRANDE) {
            return cost + .20;
        } else {
            return cost + .25;
        }
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
