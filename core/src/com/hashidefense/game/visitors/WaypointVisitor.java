package com.hashidefense.game.visitors;

import com.hashidefense.game.model.FixedAmountHealingWaypoint;
import com.hashidefense.game.model.PercentualHealingWaypoint;
import com.hashidefense.game.model.SpeedUpWaypoint;

/**
 * Created by Florian on 13.11.2016.
 */
public interface WaypointVisitor {

    void visit(SpeedUpWaypoint speedUpWaypoint);

    void visit(FixedAmountHealingWaypoint fixedAmountHealingWaypoint);

    void visit(PercentualHealingWaypoint percentualHealingWaypoint);
}
