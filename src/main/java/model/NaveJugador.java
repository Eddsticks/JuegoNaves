package model;

import java.awt.Rectangle; //representa colisiones

public class NaveJugador {

    // -- Propiedades de la nave --
    private int x;
    private int y;
    private int width;
    private int height;
    private int speed;
    private int health;

    public NaveJugador(int initialX, int initialY, int width, int height, int speed, int initialHealth) {
        this.x = initialX;
        this.y = initialY;
        this.width = width;
        this.height = height;
        this.speed = speed;
        this.health = initialHealth;
    }

    // -- Comportamiento de la nave --
    public void moveLeft() {
        this.x -= speed;
    }

    public void moveRight() {
        this.x += speed;
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
