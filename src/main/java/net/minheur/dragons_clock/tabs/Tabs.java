package net.minheur.dragons_clock.tabs;

import net.minheur.dragons_clock.DragonsClock;
import net.minheur.potoflux.loader.mod.events.RegisterTabsEvent;
import net.minheur.potoflux.registry.RegistryList;
import net.minheur.potoflux.screen.tabs.Tab;
import net.minheur.potoflux.translations.Translations;
import net.minheur.potoflux.utils.ressourcelocation.ResourceLocation;
import net.minheur.dragons_clock.tabs.all.DragonClockLobby;

public class Tabs {
    private final RegistryList<Tab> LIST = new RegistryList<>();
    private static boolean hasGenerated = false;

    public static Tabs INSTANCE;

    public Tabs() {
        if (hasGenerated) throw new IllegalStateException("Can't create the registry 2 times !");
        hasGenerated = true;
    }

    // example tab
    public final Tab DRAGONS_CLOCK_LOBBY = LIST.add(new Tab(new ResourceLocation(DragonsClock.MOD_ID, "dragons_clock_lobby"), Translations.get("dragons_clock:tabs.dragonsClockLobby.name"), DragonClockLobby.class));

    public static void register(RegisterTabsEvent event) {
        INSTANCE = new Tabs();
        INSTANCE.LIST.register(event.reg);
    }
}
