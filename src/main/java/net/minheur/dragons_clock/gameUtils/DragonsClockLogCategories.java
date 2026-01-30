package net.minheur.dragons_clock.gameUtils;

import net.minheur.potoflux.logger.ILogCategory;

public enum DragonsClockLogCategories implements ILogCategory {
    GAME_LAUNCHER("Dragon's Clock launcher");

    private final String code;

    DragonsClockLogCategories(String code) {
        this.code = code;
    }

    @Override
    public String code() {
        return code;
    }
}
