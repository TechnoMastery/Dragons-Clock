package your.packagename.tabs.all;

import net.minheur.potoflux.screen.tabs.BaseTab;
import net.minheur.potoflux.translations.Translations;

public class YourTabClass extends BaseTab {
    @Override
    protected void setPanel() {
        // add here content
    }

    @Override
    protected String getTitle() {
        return Translations.get("yourmodid:tabs.yourTab.title");
    }
}
