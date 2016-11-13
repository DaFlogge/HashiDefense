package com.hashidefense.game.model;

import com.hashidefense.game.visitors.PaintableVisitor;

/**
 * Created by Florian on 13.11.2016.
 */

public class TowerNode extends Node {
    private final Tower tower;

    public TowerNode(int posX, int posY, Tower tower) {
        super(posX, posY);
        this.tower = tower;
    }

    @Override
    public void accept(PaintableVisitor visitor) {
        visitor.paint(this);
    }
}
