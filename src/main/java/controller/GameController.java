package controller;

import model.NaveJugador;
import view.GamePanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

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
        // --- Actualiza el estado del Juego ---
        // Falta implementar otras clases.

        gamePanel.repaint();
    }

    public void handleKeyPress(int keyCode) {
        if (keyCode == KeyEvent.VK_LEFT) {
            player.moveLeft();
            if (player.getX() > 0) {
                player.setX(0);
            }
        } else if (keyCode == KeyEvent.VK_RIGHT) {
            player.moveRight();
            if (player.getX() > gamePanel.getWidth() - player.getWidth()) {
                player.setX(gamePanel.getWidth() - player.getWidth());
            }
        } else if (keyCode == KeyEvent.VK_SPACE) {
            System.out.println("Disparo!");
        }
    }

    // --- Implementar más métodos ---
}
