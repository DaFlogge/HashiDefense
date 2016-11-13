package com.hashidefense.game.model;

/**
 * Created by Florian on 13.11.2016.
 */
public class Tower {
    private final boolean isSource;
    private final int inboundConnections;
    private final TowerType type;
    private final double damage;
    private final int cooldown;
    private final double tierDamageMultiplier;
    private final double tierCooldownMultiplier;

    public Tower(boolean isSource, int inboundConnections, TowerType type, double damage, int cooldown, double tierDamageMultiplier, double tierCooldownMultiplier) {
        this.isSource = isSource;
        this.inboundConnections = inboundConnections;
        this.type = type;
        this.damage = damage;
        this.cooldown = cooldown;
        this.tierDamageMultiplier = tierDamageMultiplier;
        this.tierCooldownMultiplier = tierCooldownMultiplier;
    }
}
