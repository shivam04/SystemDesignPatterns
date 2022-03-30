package r.commandpattern.basicexample;

/**
 * Created by shivam.si on 30/03/22 12:11 pm
 */

public class RemoteControlTest {
    public static void main(String[] args) throws InterruptedException {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.buttonPressed();
        simpleRemoteControl.setCommand(garageDoorOpenCommand);
        simpleRemoteControl.buttonPressed();

        Thread.sleep(5000);

        LightOffCommand lightOffCommand = new LightOffCommand(light);
        simpleRemoteControl.setCommand(lightOffCommand);
        simpleRemoteControl.buttonPressed();
    }
}
