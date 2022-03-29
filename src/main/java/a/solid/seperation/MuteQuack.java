package a.solid.seperation;

/**
 * Created by shivam.si on 29/03/22 8:08 am
 */

public class MuteQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Can't Quack.........");
    }
}
