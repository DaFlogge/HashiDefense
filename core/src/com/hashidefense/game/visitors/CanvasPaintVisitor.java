package com.hashidefense.game.visitors;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.hashidefense.game.model.Board;
import com.hashidefense.game.model.Creep;
import com.hashidefense.game.model.Projectile;
import com.hashidefense.game.model.TowerNode;
import com.hashidefense.game.model.WaypointNode;


/**
 * Created by Florian on 13.11.2016.
 */

public class CanvasPaintVisitor implements PaintableVisitor {
    private static final Texture TOWER_TEXTURE = new Texture("dngn_altar_kikubaaqudgha.png");
    private static final Texture CREEP_TEXTURE = new Texture("necromancer.png");
    private SpriteBatch batch;

    public CanvasPaintVisitor(SpriteBatch batch) {
        this.batch = batch;
    }

    @Override
    public void paint(Creep creep) {
        batch.draw(CREEP_TEXTURE, creep.getPosX(), creep.getPosY());
        Gdx.app.debug("CanvasPaintVisitor#paint(Creep)", String.format("X: %d, Y: %d", creep.getPosX(), creep.getPosY()));
    }

    @Override
    public void paint(Projectile projectile) {

    }

    @Override
    public void paint(TowerNode towerNode) {
        batch.draw(TOWER_TEXTURE, towerNode.getPosX(), towerNode.getPosY());

    }

    @Override
    public void paint(WaypointNode waypointNode) {

    }

    @Override
    public void paint(Board board) {

    }
}
