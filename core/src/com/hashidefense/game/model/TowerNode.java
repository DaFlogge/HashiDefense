package com.hashidefense.game.model;

/**
 * Created by Florian on 13.11.2016.
 */

public class TowerNode extends Node {
    private final Tower tower;

    protected TowerNode(int posX, int posY, Tower tower) {
        super(posX, posY);
        this.tower = tower;
    }
}
