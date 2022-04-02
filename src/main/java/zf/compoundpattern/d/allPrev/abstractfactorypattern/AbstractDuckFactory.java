package zf.compoundpattern.d.allPrev.abstractfactorypattern;

/**
 * Created by shivam.si on 02/04/22 5:58 pm
 */

public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedHeadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
}
