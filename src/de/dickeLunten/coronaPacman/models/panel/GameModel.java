package de.dickeLunten.coronaPacman.models.panel;

import de.dickeLunten.coronaPacman.models.entities.Player;
import de.dickeLunten.coronaPacman.models.entities.Vac;

public class GameModel {

    private Player player;
    private Vac[] vacs;

    public GameModel(){
        player = new Player();
        vacs = new Vac[4];
        vacs[0] = new Vac(30,30);
        vacs[1] = new Vac(130, 30);
        vacs[2] = new Vac(130, 130);
        vacs[3] = new Vac(30,130);
    }

}
