package z.facadepattern.a.example;

/**
 * Created by shivam.si on 30/03/22 3:51 pm
 */

public class HomeTheaterTestDrive {
    public static void main(String[] args) throws InterruptedException {
        Tuner tuner = new Tuner();
        Amplifier amplifier = new Amplifier();
        DvdPlayer dvdPlayer = new DvdPlayer();
        CdPlayer cdPlayer = new CdPlayer();
        Projector projector = new Projector();
        TheaterLights theaterLights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popcornPopper = new PopcornPopper();
        HomeTheaterFacade facade = new HomeTheaterFacade(tuner, amplifier, dvdPlayer, cdPlayer,
                projector, theaterLights,screen, popcornPopper);
        facade.watchMovie("Lord of the rings");
        Thread.sleep(10000);
        System.out.println("==========\n\n\n==========");
        facade.endMovie();
    }
}
