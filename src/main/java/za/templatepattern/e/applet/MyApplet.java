package za.templatepattern.e.applet;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by shivam.si on 31/03/22 12:28 pm
 */

public class MyApplet extends Applet {
    String message;

    @Override
    public void init() {
        message = "Hello World I'm alive!!";
        repaint();
    }

    @Override
    public void start() {
        message = "Now I'm starting up!!";
        repaint();
    }

    @Override
    public void stop() {
        message = "Oh, now I'm being stopped!!";
        repaint();
    }

    @Override
    public void destroy() {
        //do nothing
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(message, 5, 15);
    }

    public static void main(String[] args) {
        MyApplet myApplet = new MyApplet();
    }
}
