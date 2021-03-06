package de.dickeLunten.coronaPacman;

import de.dickeLunten.coronaPacman.controller.NavigationPanels;
import util.Bundle;

public interface ViewListener {
    void onNavigate(NavigationPanels destination, Bundle bundle);
    void notifyPauseGame();
    void notifyContinueGame();
    void notifyExitGame();
    void notifyGameStarted();
}