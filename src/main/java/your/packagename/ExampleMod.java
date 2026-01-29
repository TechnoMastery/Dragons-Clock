package your.packagename;

import net.minheur.potoflux.PotoFlux;
import net.minheur.potoflux.loader.PotoFluxLoadingContext;
import net.minheur.potoflux.loader.mod.Mod;
import net.minheur.potoflux.loader.mod.ModEventBus;
import net.minheur.potoflux.loader.mod.events.RegisterLangEvent;
import net.minheur.potoflux.logger.LogCategories;
import net.minheur.potoflux.logger.PtfLogger;
import your.packagename.tabs.Tabs;
import your.packagename.translations.ExampleModTranslations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

@Mod(modId = ExampleMod.MOD_ID, version = "1.0", compatibleVersions = {"6.1"})
public class ExampleMod {
    public static final String MOD_ID = "yourmodid";

    public ExampleMod() {
        ModEventBus modEventBus = PotoFluxLoadingContext.get().getModEventBus();

        modEventBus.addListener(Tabs::register);
        modEventBus.addListener(this::onRegisterLang);
    }

    private void onRegisterLang(RegisterLangEvent event) {
        event.registerLang(new ExampleModTranslations());
    }

    public static Path getModDir() {
        Path dir = PotoFlux.getModDataDir().resolve(MOD_ID);
        try {
            Files.createDirectories(dir);
        } catch (IOException ignored) {}
        return dir;
    }

    public static String getVersion() {
        try {
            Properties props = new Properties();
            props.load(ExampleMod.class.getResourceAsStream("/modVersion.properties"));

            return props.getProperty("version");
        } catch (IOException e) {
            e.printStackTrace();
            PtfLogger.error("Could not get version for mod " + MOD_ID, LogCategories.MOD_LOADER);
            return null;
        }
    }
}
