package com.hashidefense.game.model;

import com.hashidefense.game.visitors.PaintableVisitor;

/**
 * Created by Florian on 13.11.2016.
 */

public class Creep extends Movable {
    private final double startHealth;
    private final double startSpeed;
    private double currentHealth;

    public Creep(int posX, int posY, Direction direction, double health, double speed) {
        super(direction, posX, posY, speed);
        this.startHealth = health;
        this.currentHealth = health;
        this.startSpeed = speed;
    }

    @Override
    public void accept(PaintableVisitor visitor) {
        visitor.paint(this);
    }
}
