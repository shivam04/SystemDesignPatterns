package z.facadepattern.a.example;

/**
 * Created by shivam.si on 30/03/22 3:40 pm
 */

public class Amplifier {
    public void on() {
        System.out.println("Amplifier on");
    }

    public void setDvd(DvdPlayer dvdPlayer) {
        System.out.println("Amplifier set dvd");
    }

    public void setSurroundSound() {
        System.out.println("Amplifier surround sound");
    }

    public void setVolume(int i) {
        System.out.println("Amplifier volume: " + i);
    }

    public void off() {
        System.out.println("Amplifier off");
    }
}
