package DrawObjects;

import java.awt.*;

public class DrawSky {
    public void paint(Graphics g) {
        int[] x = {0, 0, 120, 550, 750, 1000, 1100};
        int[] y = {0, 180, 80, 200, 100, 250, 0};

        g.setColor(new Color(175, 238, 238));
        g.fillPolygon(x, y, 7);
    }
}
