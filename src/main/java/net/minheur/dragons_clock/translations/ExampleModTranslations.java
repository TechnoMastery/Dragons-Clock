package net.minheur.dragons_clock.translations;

import net.minheur.dragons_clock.ExampleMod;
import net.minheur.potoflux.translations.AbstractTranslationsRegistry;

public class ExampleModTranslations extends AbstractTranslationsRegistry {
    public ExampleModTranslations() {
        super(ExampleMod.MOD_ID);
    }

    @Override
    protected void makeTranslation() {
        addYourTab("name")
                .en("Your tab name");
        addYourTab("title")
                .en("Your tab title");
    }

    // tabs helper
    private TranslationBuilder addYourTab(String... children) {
        return addTab("yourTab", children);
    }
}
