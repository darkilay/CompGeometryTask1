package DrawObjects;

import java.awt.*;

public class DrawFire {
    public void paint(Graphics g) {
        int[] x = {550, 560, 540};
        int[] y = {360, 390, 380};

        g.setColor(new Color(255, 99, 71));
        g.fillPolygon(x, y, 3);

        g.fillArc(560, 390, 50,30, 0, 180);
    }
}
