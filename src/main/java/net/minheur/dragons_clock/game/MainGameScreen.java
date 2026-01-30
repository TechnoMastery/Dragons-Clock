package net.minheur.dragons_clock.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import org.lwjgl.opengl.GL20;

public class MainGameScreen implements Screen {
    private final DragonsClockGame game;
    private SpriteBatch batch;
    private Texture texture;

    public MainGameScreen(DragonsClockGame game) {
        this.game = game;
    }

    @Override
    public void show() {
        batch = new SpriteBatch();
        texture = new Texture("badlogic.jpg"); // test pic for LibGDX
    }

    @Override
    public void render(float v) {
        Gdx.gl.glClearColor(0.1f, 0.1f, 0.15f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        batch.draw(texture, 100, 100);
        batch.end();
    }

    @Override
    public void resize(int i, int i1) {}
    @Override public void pause() {}
    @Override public void resume() {}
    @Override public void hide() {}

    @Override
    public void dispose() {
        batch.dispose();
        texture.dispose();
    }
}
