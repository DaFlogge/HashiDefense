package com.hashidefense.game;

import com.badlogic.gdx.Gdx;
import com.hashidefense.game.model.Creep;
import com.hashidefense.game.model.Direction;
import com.hashidefense.game.model.Paintable;
import com.hashidefense.game.model.Tower;
import com.hashidefense.game.model.TowerNode;
import com.hashidefense.game.model.TowerType;

import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * Created by Florian on 13.11.2016.
 */

public class Controller implements Runnable {
    private volatile List<Paintable> paintables;
    private volatile boolean paused = true;
    public final TowerNode tower = new TowerNode(5, 10, new Tower(false, 1, TowerType.BULLET, 1, 1, 1, 1));
    public final Creep creep = new Creep(50, 100, Direction.RIGHT, 100, 0.1);

    public Controller(List<Paintable> paintables) {
        this.paintables = paintables;
        this.paintables.add(tower);
        this.paintables.add(creep);
    }

    public void tick() {
        Gdx.app.debug("Controller#tick()", "Gameloop step executed");
        creep.move();
    }

    @Override
    public void run() {
        while (true) {
            if (!paused) {
                tick();
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException("Unexpected Controller interrupt", e);
            }
        }
    }

    public synchronized void pause(){
        Gdx.app.log("Controller#pause()", "Gameloop paused");
        paused = true;
    }

    public synchronized void unpause(){
        Gdx.app.log("Controller#unpause()", "Gameloop resumed");
        paused = false;
    }
}
