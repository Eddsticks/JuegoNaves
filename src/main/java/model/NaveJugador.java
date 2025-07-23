package model;

import java.awt.Rectangle;
import view.GamePanel;
import java.awt.Graphics;
import java.awt.Color;

public class NaveJugador {

    // -- Propiedades de la nave --
    private int x;
    private int y;
    private int width;
    private int height;
    private int speed;
    private int health;

    private boolean movingLeft;
    private boolean movingRight;

    public NaveJugador(int initialX, int initialY, int width, int height, int speed, int initialHealth) {
        this.x = initialX;
        this.y = initialY;
        this.width = width;
        this.height = height;
        this.speed = speed;
        this.health = initialHealth;
    }

    public void update() {
        if (movingLeft) {
            x -= speed;
        }

        if (movingRight) {
            x += speed;
        }

        if (x < 0) {
            x = 0;
        }

        if (x > GamePanel.ANCHO - width) {
            x = GamePanel.ANCHO - width;
        }
    }

    public void draw(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(x, y, width, height);
    }

    // -- Comportamiento de la nave --
    public void setMovingLeft(boolean movingLeft) {
        this.movingLeft = movingLeft;
        if (movingLeft) this.movingRight = false;
    }

    public void setMovingRight(boolean movingRight) {
        this.movingRight = movingRight;
        if (movingRight) this.movingLeft = false;
    }

    public void moveUp() {
        this.y += speed;
    }

    public void moveDown() {
        this.y -= speed;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
        }
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    // -- Getters --
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getHealth() {
        return health;
    }

    public int getSpeed() {
        return speed;
    }

    /**
     * Establece posición en X.
     * @param x nueva posición X.
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Establece posición en Y.
     * @param y nueva posición en Y.
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Representa los límites de la nave (colisiones).
     * @return Rectangulo que define tamaño y posición de la nave.
     */
    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }
}
