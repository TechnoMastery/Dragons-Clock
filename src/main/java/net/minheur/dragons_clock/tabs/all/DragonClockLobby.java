package net.minheur.dragons_clock.tabs.all;

import net.minheur.dragons_clock.gameUtils.GameLauncher;
import net.minheur.potoflux.screen.tabs.BaseTab;
import net.minheur.potoflux.translations.Translations;

import javax.swing.*;

public class DragonClockLobby extends BaseTab {
    @Override
    protected void setPanel() {
        // add here content
        JButton startButton = new JButton("Launch game");

        startButton.addActionListener(e -> {
            new Thread(() -> {
                GameLauncher.launch();
            }, "LibGDX-Launcher").start();
        });

        PANEL.add(startButton);
    }

    @Override
    protected String getTitle() {
        return Translations.get("dragons_clock:tabs.dragonsClockLobby.title");
    }
}
