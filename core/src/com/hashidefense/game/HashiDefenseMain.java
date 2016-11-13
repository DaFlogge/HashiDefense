package com.hashidefense.game;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.hashidefense.game.model.Creep;
import com.hashidefense.game.model.Direction;
import com.hashidefense.game.model.Paintable;
import com.hashidefense.game.model.Tower;
import com.hashidefense.game.model.TowerNode;
import com.hashidefense.game.model.TowerType;
import com.hashidefense.game.visitors.CanvasPaintVisitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class HashiDefenseMain extends ApplicationAdapter {
    private SpriteBatch batch;
    private CanvasPaintVisitor painter;
    private final List<Paintable> paintables = new ArrayList<Paintable>();
    private Controller controller;
    private static final Random random = new Random(1337L);

    @Override
    public void create() {
        Gdx.app.setLogLevel(Application.LOG_INFO);
        batch = new SpriteBatch();
        painter = new CanvasPaintVisitor(batch);
        controller = new Controller(paintables);
        Thread thread = new Thread(controller);
        thread.start();
    }

    @Override
    public void render() {
        if (random.nextDouble() < 0.1){
            controller.unpause();
        } else {
            controller.pause();
        }
        Gdx.app.debug("HashiDefenseMain#render()", "Rendering...");
        update();
    }

    private void update() {
        Gdx.gl.glClearColor(0, 0, 0, 0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        for (Paintable paintable : paintables) {
            paintable.accept(painter);
        }
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
    }
}
