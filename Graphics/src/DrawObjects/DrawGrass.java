package DrawObjects;

import java.awt.*;

public class DrawGrass {
    public void paint(Graphics g) {
        int[] x = {0, 0, 550, 1100, 1100};
        int[] y = {660, 280, 250, 280, 660};

        g.setColor(new Color(0, 128, 0));
        g.fillPolygon(x, y, 5);
    }
}
