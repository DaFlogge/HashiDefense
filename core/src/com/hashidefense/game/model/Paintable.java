package com.hashidefense.game.model;

import com.hashidefense.game.visitors.PaintableVisitor;

/**
 * Created by Florian on 13.11.2016.
 */

public interface Paintable {
    void accept(PaintableVisitor visitor);
}
