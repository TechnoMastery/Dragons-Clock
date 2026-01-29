package your.packagename.tabs;

import net.minheur.potoflux.loader.mod.events.RegisterTabsEvent;
import net.minheur.potoflux.registry.RegistryList;
import net.minheur.potoflux.screen.tabs.Tab;
import net.minheur.potoflux.translations.Translations;
import net.minheur.potoflux.utils.ressourcelocation.ResourceLocation;
import your.packagename.ExampleMod;
import your.packagename.tabs.all.YourTabClass;

public class Tabs {
    private final RegistryList<Tab> LIST = new RegistryList<>();
    private static boolean hasGenerated = false;

    public static Tabs INSTANCE;

    public Tabs() {
        if (hasGenerated) throw new IllegalStateException("Can't create the registry 2 times !");
        hasGenerated = true;
    }

    // example tab
    public final Tab MY_TAB = LIST.add(new Tab(new ResourceLocation(ExampleMod.MOD_ID, "your_tab_id"), Translations.get("yourmodid:tabs.yourTab.name"), YourTabClass.class));

    public static void register(RegisterTabsEvent event) {
        INSTANCE = new Tabs();
        INSTANCE.LIST.register(event.reg);
    }
}
