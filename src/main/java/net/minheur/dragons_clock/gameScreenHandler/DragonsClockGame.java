package net.minheur.dragons_clock.gameScreenHandler;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.LifecycleListener;
import net.minheur.dragons_clock.gameUtils.DragonsClockLogCategories;
import net.minheur.potoflux.logger.PtfLogger;

public class DragonsClockGame extends Game {

    private boolean exiting = false;

    @Override
    public void create() {
        Gdx.app.addLifecycleListener(new LifecycleListener() {
            @Override
            public void pause() {}

            @Override
            public void resume() {}

            @Override
            public void dispose() {
                onBeforeExit();
            }
        });

        setScreen(new MainGameScreen(this));
    }

    private synchronized void onBeforeExit() {
        if (exiting) return;
        exiting = true;

        PtfLogger.info("Closing Dragon's Clock...", DragonsClockLogCategories.GAME_LAUNCHER);
    }

    @Override
    public void dispose() {
        super.dispose();
    }
}
