package net.minheur.dragons_clock.translations;

import net.minheur.dragons_clock.DragonsClock;
import net.minheur.potoflux.translations.AbstractTranslationsRegistry;

public class DragonsClockTranslations extends AbstractTranslationsRegistry {
    public DragonsClockTranslations() {
        super(DragonsClock.MOD_ID);
    }

    @Override
    protected void makeTranslation() {
        addLobbyTab("name")
                .en("Dragon's Clock lobby");
        addLobbyTab("title")
                .en("Lobby");
    }

    // tabs helper
    private TranslationBuilder addLobbyTab(String... children) {
        return addTab("dragonsClockLobby", children);
    }
}
