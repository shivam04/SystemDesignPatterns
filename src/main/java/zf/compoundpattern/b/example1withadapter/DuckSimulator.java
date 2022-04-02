package zf.compoundpattern.b.example1withadapter;

/**
 * Created by shivam.si on 02/04/22 5:43 pm
 */

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    private void simulate() {
        Quackable mallardDuck = new MallardDuck();
        Quackable redHeadDuck = new RedHeadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();
        Quackable gooseAdapter = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator");

        simulate(mallardDuck);
        simulate(redHeadDuck);
        simulate(duckCall);
        simulate(redHeadDuck);
        simulate(gooseAdapter);
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }

}
