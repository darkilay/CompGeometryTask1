package DrawObjects;

import java.awt.*;

public class DrawTree {
    public void paint(Graphics g) {
        //листва
        g.setColor(new Color(92,169,4));
        g.fillOval(100, 100, 150, 100);
        g.fillOval(150, 50, 100, 100);

        //ствол
        g.setColor(new Color(139, 69, 19));
        g.fillRect(165, 200, 10, 100);


        //листва
        g.setColor(new Color(92,169,4));
        g.fillOval(900, 100, 150, 100);
        g.fillOval(925, 50, 100, 140);

        //ствол
        g.setColor(new Color(139, 69, 19));
        g.fillRect(965, 200, 10, 100);


    }
}
