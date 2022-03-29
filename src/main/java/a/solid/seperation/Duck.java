package a.solid.seperation;

/**
 * Created by shivam.si on 29/03/22 8:11 am
 */

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void swim() {
        System.out.println("Swimming.........");
    }

    public abstract void display();

    public void performFly() {
        flyBehaviour.fly();
    }
}
