package com.hashidefense.game.model;

import com.hashidefense.game.visitors.WaypointVisitor;

/**
 * Created by Florian on 13.11.2016.
 */

public class PercentualHealingWaypoint extends HealingWaypoint {
    @Override
    public void accept(WaypointVisitor visitor) {
        visitor.visit(this);
    }
}
