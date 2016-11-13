package com.hashidefense.game.model;

import com.hashidefense.game.visitors.PaintableVisitor;

/**
 * Created by Florian on 13.11.2016.
 */

public class Board implements Paintable {
    private final int dimX;
    private final int dimY;

    public Board(int dimX, int dimY) {
        this.dimX = dimX;
        this.dimY = dimY;
    }

    @Override
    public void accept(PaintableVisitor visitor) {
        visitor.paint(this);
    }
}
