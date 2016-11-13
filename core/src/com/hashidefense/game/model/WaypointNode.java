package com.hashidefense.game.model;

import com.hashidefense.game.visitors.PaintableVisitor;

/**
 * Created by Florian on 13.11.2016.
 */

public class WaypointNode extends Node {
    private final Direction direction;

    public WaypointNode(int posX, int posY, Direction direction, Waypoint type) {
        super(posX, posY);
        this.direction = direction;
    }

    @Override
    public void accept(PaintableVisitor visitor) {
        visitor.paint(this);
    }
}
