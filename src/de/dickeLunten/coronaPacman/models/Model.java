package de.dickeLunten.coronaPacman.models;

import de.dickeLunten.coronaPacman.models.panel.*;

public class Model {
    StartModel startModel;
    GameModel gameModel;
    EndModel endModel;
    CreditsModel creditsModel;
    RulesModel rulesModel;

    public Model(StartModel startModel, GameModel gameModel, EndModel endModel, CreditsModel creditsModel, RulesModel rulesModel) {
        this.startModel = startModel;
        this.gameModel = gameModel;
        this.endModel = endModel;
        this.creditsModel = creditsModel;
        this.rulesModel = rulesModel;
    }

    public StartModel getStartModel() {
        return startModel;
    }

    public GameModel getGameModel() {
        return gameModel;
    }


    public EndModel getEndModel() {
        return endModel;
    }

    public CreditsModel getCreditsModel() {
        return creditsModel;
    }

    public RulesModel getRulesModel() {
        return rulesModel;
    }

    public void resetGameModel() {
        gameModel = new GameModel();
    }
}