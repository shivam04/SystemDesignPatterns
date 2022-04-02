package zf.compoundpattern.c.example1adapterdecorator;

/**
 * Created by shivam.si on 02/04/22 5:46 pm
 */

public class GooseAdapter implements Quackable {
    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
