package com.hashidefense.game.model;

/**
 * Created by Florian on 13.11.2016.
 */

public abstract class Node {
    private final int posX;
    private final int posY;

    protected Node(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }
}
