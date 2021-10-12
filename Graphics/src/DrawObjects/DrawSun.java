package DrawObjects;

import java.awt.*;

public class DrawSun {
    public void paint(Graphics g) {
        int[] x = {585, 660, 670};
        int[] y = {410, 365, 375};
        g.setColor(new Color(255, 140, 0));
        g.fillPolygon(x, y, 3);

        x = new int[]{585, 660, 670};
        y = new int[]{420, 420, 435};
        g.setColor(new Color(255, 140, 0));
        g.fillPolygon(x, y, 3);

        x = new int[]{590, 590, 595};
        y = new int[]{430, 480, 470};
        g.setColor(new Color(255, 140, 0));
        g.fillPolygon(x, y, 3);


        g.setColor(new Color(139, 0, 0));
        g.fillArc(570, 390, 30, 50, 0, 90 );
        g.fillArc(570, 390, 30, 50, -90, 90 );

        /*
        int[] x = {5, 80, 90};
        int[] y = {50, 5, 15};

        g.setColor(new Color(255, 140, 0));
        g.fillPolygon(x, y, 3);

        x = new int[]{5, 80, 90};
        y = new int[]{60, 60, 75};
        g.setColor(new Color(255, 140, 0));
        g.fillPolygon(x, y, 3);

        x = new int[]{10, 40, 45};
        y = new int[]{70, 120, 110};
        g.setColor(new Color(255, 140, 0));
        g.fillPolygon(x, y, 3);


        g.setColor(new Color(139, 0, 0));
        g.fillArc(-10, 30, 30, 50, 0, 90 );
        g.fillArc(-10, 30, 30, 50, -90, 90 );
         */
    }
}
