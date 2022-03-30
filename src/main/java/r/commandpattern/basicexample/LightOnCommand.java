package r.commandpattern.basicexample;

/**
 * Created by shivam.si on 30/03/22 12:08 pm
 */

public class LightOnCommand implements Command{

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
