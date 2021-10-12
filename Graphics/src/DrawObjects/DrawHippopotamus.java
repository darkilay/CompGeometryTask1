package DrawObjects;

import java.awt.*;

public class DrawHippopotamus {
    public void paint(Graphics g) {
        g.setColor(new Color(105, 105, 105));
        g.fillArc(10, 30, 60,60, 0, 180);
        g.setColor(new Color(128, 128, 128));
        g.fillArc(0, 50, 80,40, 0, 180);
        g.setColor(Color.BLACK);
        g.fillArc(28, 55, 8,8, 0, 360);
        g.fillArc(45, 55, 8,8, 0, 360);
        g.setColor(Color.red);
        g.fillRect(28,40,6,9);
        g.fillRect(45,40,6,9);
        /*
        g.setColor(new Color(105, 105, 105));
        g.fillArc(570, 390, 60,60, 0, 180);
        g.setColor(new Color(128, 128, 128));
        g.fillArc(560, 410, 80,40, 0, 180);
        g.setColor(Color.BLACK);
        g.fillArc(588, 415, 8,8, 0, 360);
        g.fillArc(605, 415, 8,8, 0, 360);
        g.setColor(Color.red);
        g.fillRect(588,400,6,9);
        g.fillRect(605,400,6,9);

         */
    }
}
