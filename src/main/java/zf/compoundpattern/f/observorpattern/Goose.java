package zf.compoundpattern.f.observorpattern;

/**
 * Created by shivam.si on 02/04/22 5:45 pm
 */

public class Goose {
    public void honk() {
        System.out.println("Honk");
    }

    @Override
    public String toString() {
        return "Goose";
    }
}
