package com.hashidefense.game.model;

/**
 * Created by Florian on 13.11.2016.
 */
public class Tower {
    private final boolean isSource;
    private final int inboundConnections;
    private final TowerType type;

    public Tower(boolean isSource, int inboundConnections, TowerType type) {
        this.isSource = isSource;
        this.inboundConnections = inboundConnections;
        this.type = type;
    }
}
