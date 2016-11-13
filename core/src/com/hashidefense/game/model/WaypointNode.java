package com.hashidefense.game.model;

/**
 * Created by Florian on 13.11.2016.
 */

public class WaypointNode extends Node {
    private final Direction direction;
    protected WaypointNode(int posX, int posY, Direction direction) {
        super(posX, posY);
        this.direction = direction;
    }
}
