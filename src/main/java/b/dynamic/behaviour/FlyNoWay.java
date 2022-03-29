package b.dynamic.behaviour;

/**
 * Created by shivam.si on 29/03/22 8:04 am
 */

public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Can't fly");
    }
}
