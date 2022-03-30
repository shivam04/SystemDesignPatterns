package r.commandpattern.basicexample;

/**
 * Created by shivam.si on 30/03/22 12:10 pm
 */

public class SimpleRemoteControl {
    Command command;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonPressed() {
        command.execute();
    }
}
