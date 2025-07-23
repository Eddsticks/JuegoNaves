package launcher;

import view.GamePanel;

import javax.swing.*;

public class JuegoNaves {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Juegito FIUM!!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        GamePanel gamePanel = new GamePanel();
        frame.add(gamePanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
