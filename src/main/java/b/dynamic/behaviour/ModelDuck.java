package b.dynamic.behaviour;

/**
 * Created by shivam.si on 29/03/22 8:27 am
 */

public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }


    @Override
    public void display() {
        System.out.println("Model Duck");
    }
}
