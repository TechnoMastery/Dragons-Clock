package net.minheur.dragons_clock.gameUtils;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import net.minheur.dragons_clock.gameScreenHandler.DragonsClockGame;
import net.minheur.potoflux.logger.PtfLogger;

public class GameLauncher {
    private static boolean started = false;

    public static synchronized void launch() {
        if (started) {
            PtfLogger.error("Tried to launch Dragon's Clock two times !", DragonsClockLogCategories.GAME_LAUNCHER);
            return;
        }
        started = true;

        Lwjgl3ApplicationConfiguration config =
                new Lwjgl3ApplicationConfiguration();

        config.setTitle("DragonsClock");
        config.setWindowedMode(1280, 720);
        config.useVsync(true);

        new Lwjgl3Application(new DragonsClockGame(), config);
    }
}
