package controller;

import model.NaveJugador;
import view.GamePanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.security.Key;

public class GameController implements ActionListener {

    private NaveJugador player;
    private GamePanel gamePanel;
    private Timer gameTimer;

    private final int DELAY = 15;

    public GameController(NaveJugador player, GamePanel gamePanel) {
        this.player = player;
        this.gamePanel = gamePanel;

        gameTimer = new Timer(DELAY, this);
    }

    public void startGameLoop() {
        gameTimer.start();
    }

    public void stopGameLoop() {
        gameTimer.stop();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        player.update();
        gamePanel.repaint();
    }

    public void handleKeyPress(int keyCode) {
        if (keyCode == KeyEvent.VK_A) {
            player.setMovingLeft(true);
        } else if (keyCode == KeyEvent.VK_D) {
            player.setMovingRight(true);
        } else if (keyCode == KeyEvent.VK_SPACE) {
            System.out.println("Disparo!");
        }
    }

    public void handleKeyRelease(int keyCode) {
        if (keyCode == KeyEvent.VK_A) {
            player.setMovingLeft(false);
        }
        if (keyCode == KeyEvent.VK_D) {
            player.setMovingRight(false);
        }
    }

    // --- Implementar más métodos ---
}
