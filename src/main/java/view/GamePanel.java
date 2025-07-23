package view;

import javax.swing.JPanel;
import java.awt.Dimension;

public class GamePanel extends JPanel {
    public static final int ANCHO = 800;
    public static final int ALTO = 600;

    public GamePanel() {
        super();
        setPreferredSize(new Dimension(ANCHO, ALTO));
        setFocusable(true);
    }
}
