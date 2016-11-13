package com.hashidefense.game.visitors;

import com.hashidefense.game.model.Board;
import com.hashidefense.game.model.Creep;
import com.hashidefense.game.model.Projectile;
import com.hashidefense.game.model.TowerNode;
import com.hashidefense.game.model.WaypointNode;

/**
 * Created by Florian on 13.11.2016.
 */

public interface PaintableVisitor {
    void paint(Creep creep);

    void paint(Projectile projectile);

    void paint(TowerNode towerNode);

    void paint(WaypointNode waypointNode);

    void paint(Board board);
}
