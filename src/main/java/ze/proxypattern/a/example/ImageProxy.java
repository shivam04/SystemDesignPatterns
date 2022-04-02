package ze.proxypattern.a.example;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Created by shivam.si on 02/04/22 10:36 am
 */

public class ImageProxy implements Icon {
    volatile ImageIcon imageIcon;
    final URL imageUrl;
    Thread retrievalThread;
    boolean retrieving = false;

    public ImageProxy(URL imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if(imageIcon != null) {
            imageIcon.paintIcon(c, g, x, y);
        } else {
            g.drawString("Loading CD cover, please wait......", x+300, y+190);
            if(!retrieving) {
                retrieving = true;
                retrievalThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            setImageIcon(new ImageIcon(imageUrl, "CD Cover"));
                            c.repaint();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }
                });
                retrievalThread.start();
            }
        }
    }

    @Override
    public int getIconWidth() {
        if(imageIcon != null)
            return imageIcon.getIconWidth();
        return 800;
    }

    @Override
    public int getIconHeight() {
        if(imageIcon != null)
            return imageIcon.getIconHeight();
        return 600;
    }
}
