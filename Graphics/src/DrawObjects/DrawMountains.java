package DrawObjects;

import java.awt.*;

public class DrawMountains {
    public void paint(Graphics g) {
        int[] x = {0, 120, 550, 750, 1000, 1100, 1100,550, 0};
        int[] y = {180, 80, 200, 100, 250, 0, 280, 250, 280};

        g.setColor(Color.BLACK);
        g.fillPolygon(x, y, 9);
    }
}
