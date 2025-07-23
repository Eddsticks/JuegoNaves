package view;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics;

public class GamePanel extends JPanel {
    public static final int ANCHO = 800;
    public static final int ALTO = 600;

    public GamePanel() {
        super();
        setPreferredSize(new Dimension(ANCHO, ALTO));
        setFocusable(true);
    }

    //Def color fondo.
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0,0, ANCHO, ALTO);
    }
}
