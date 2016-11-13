package com.hashidefense.game.model;

import com.hashidefense.game.visitors.WaypointVisitor;

/**
 * Created by Florian on 13.11.2016.
 */
public interface Waypoint {
    void accept(WaypointVisitor visitor);
}
