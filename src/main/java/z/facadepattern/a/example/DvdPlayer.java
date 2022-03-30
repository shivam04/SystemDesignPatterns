package z.facadepattern.a.example;

/**
 * Created by shivam.si on 30/03/22 3:40 pm
 */

public class DvdPlayer {
    public void on() {
        System.out.println("DVD Player on");
    }

    public void play(String movie) {
        System.out.println("DVD Player playing movie: " + movie);
    }

    public void stop() {
        System.out.println("DVD Player stop");
    }

    public void eject() {
        System.out.println("DVD Player eject");
    }

    public void off() {
        System.out.println("DVD Player off");
    }
}
