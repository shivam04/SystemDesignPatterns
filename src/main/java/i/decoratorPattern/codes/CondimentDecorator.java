package i.decoratorPattern.codes;

/**
 * Created by shivam.si on 29/03/22 1:20 pm
 */

public abstract class CondimentDecorator extends Beverage{
    protected Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public Size getSize() {
        return beverage.getSize();
    }

    public abstract String getDescription();
}
