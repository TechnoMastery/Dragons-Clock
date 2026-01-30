package net.minheur.dragons_clock.game;

import com.badlogic.gdx.Game;

public class DragonsClockGame extends Game {
    @Override
    public void create() {
        setScreen(new MainGameScreen(this));
    }

    @Override
    public void dispose() {
        super.dispose();
    }
}
