package r.commandpattern.basicexample;

/**
 * Created by shivam.si on 30/03/22 12:09 pm
 */

public class LightOffCommand implements Command{

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
