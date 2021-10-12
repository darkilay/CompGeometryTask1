import DrawObjects.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawPicture extends JFrame {

    private JPanel myJPanel;
    private JButton drawButton;
    private JButton clearButton;

    public DrawPicture() {
        add(myJPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1100, 660);
        this.setTitle("drawPicture");

        drawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                DrawMountains mountains = new DrawMountains();
                mountains.paint(getGraphics());
                DrawSky fon = new DrawSky();
                fon.paint(getGraphics());
                DrawSun sun = new DrawSun();

                DrawGrass grass = new DrawGrass();
                grass.paint(getGraphics());
                DrawCloud cloud = new DrawCloud();
                cloud.paint(getGraphics());
                DrawTree tree = new DrawTree();
                tree.paint(getGraphics());
                DrawLake lake = new DrawLake();
                lake.paint(getGraphics());
                DrawHippopotamus hippopotamus = new DrawHippopotamus();
                hippopotamus.paint(getGraphics());
                sun.paint(getGraphics());
                getGraphics().drawString("hippopotamus", 650, 410);


            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        });
    }
}

