package DrawObjects;

import java.awt.*;

public class DrawCloud {
    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(320, 30, 75, 50);
        g.fillOval(370, 20, 50, 30);
        g.fillOval(350, 40, 100, 30);

        g.fillOval(820, 50, 75, 50);
        g.fillOval(870, 40, 50, 30);
        g.fillOval(850, 60, 100, 30);

        g.fillOval(620, 40, 75, 50);
        g.fillOval(670, 30, 50, 30);
        g.fillOval(650, 50, 100, 60);
    }
}
