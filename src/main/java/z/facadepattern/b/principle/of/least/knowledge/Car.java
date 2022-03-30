package z.facadepattern.b.principle.of.least.knowledge;

/**
 * Created by shivam.si on 30/03/22 4:03 pm
 */

public class Car {
    Engine engine;

    public Car() {
    }

    public void start(Key key) {
        Doors doors = new Doors();

        boolean authorized = key.turns();
        if(authorized) {
            engine.start();
            updateDashBoardDisplay();
            doors.lock();
        }
    }

    private void updateDashBoardDisplay() {
    }
}
