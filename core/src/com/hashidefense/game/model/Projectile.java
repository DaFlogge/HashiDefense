package com.hashidefense.game.model;

import com.hashidefense.game.visitors.PaintableVisitor;

/**
 * Created by Florian on 13.11.2016.
 */

public class Projectile extends Movable {
    public Projectile(Direction direction, int currentX, int currentY, double currentSpeed) {
        super(direction, currentX, currentY, currentSpeed);
    }

    @Override
    public void accept(PaintableVisitor visitor) {
        visitor.paint(this);
    }
}
