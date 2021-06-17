package de.dickeLunten.coronaPacman.views;

import de.dickeLunten.coronaPacman.ModelListener;
import de.dickeLunten.coronaPacman.ViewListener;
import de.dickeLunten.coronaPacman.controller.Controller;
import de.dickeLunten.coronaPacman.controller.NavigationPanels;
import de.dickeLunten.coronaPacman.models.Model;
import de.dickeLunten.coronaPacman.models.panel.EndModel;
import de.dickeLunten.coronaPacman.models.panel.GameModel;
import de.dickeLunten.coronaPacman.models.panel.StartModel;
import de.dickeLunten.coronaPacman.views.panels.EndPanel;
import de.dickeLunten.coronaPacman.views.panels.GamePanel;
import de.dickeLunten.coronaPacman.views.panels.PausePanel;
import de.dickeLunten.coronaPacman.views.panels.StartPanel;

import javax.swing.*;

public class View implements ModelListener {
    private final JFrame frame;
    private Model model;

    private StartPanel startPanel;
    private GamePanel gamePanel;
    private PausePanel pausePanel;
    private EndPanel endPanel;
    private ViewListener viewListener;

    public View(Model model, ViewListener viewListener) {
        this.viewListener = viewListener;
        this.model = model;
        frame = initFrame();
        init();
    }

    private void init() {
        initPanels();
        initStart();
    }

    private void initPanels() {
        startPanel = new StartPanel(model.getStartModel(), viewListener);
        System.out.println(startPanel.getActionMap().get("enter_action"));
        gamePanel = new GamePanel(model.getGameModel(),viewListener);
        pausePanel = new PausePanel(model.getPauseModel());
        endPanel = new EndPanel(model.getEndModel(), viewListener);
    }

    private JFrame initFrame() {
        JFrame frame = new JFrame("CoronaPacman");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setResizable(false);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setUndecorated(true);
        frame.setVisible(true);
        return frame;
    }

    private void initStart() {
        startPanel.getActionMap().get("aa");
        frame.add(startPanel);
        frame.revalidate();
        frame.repaint();
    }
    private void initGamePanel() {
        frame.add(gamePanel);
        frame.revalidate();
        frame.repaint();
    }
    private void initEndPanel() {
        frame.add(endPanel);
        frame.revalidate();
        frame.repaint();
    }

    //Removes all components + panels from frame
    private void resetFrame() {
        frame.getContentPane().removeAll();
        frame.revalidate();
        frame.repaint();
    }

    @Override
    public void update() {

    }

    public void onNavigate(NavigationPanels destination) {
        switch (destination) {
            case START_PANEL -> {
                resetFrame();
                initStart();
            }
            case GAME_PANEL -> {
                resetFrame();
                initGamePanel();
            }
            case END_PANEL -> {
                resetFrame();
                initEndPanel();
            }
        }
    }

    public StartPanel getStartPanel() {
        return startPanel;
    }

    public GamePanel getGamePanel() {
        return gamePanel;
    }

    public PausePanel getPausePanel() {
        return pausePanel;
    }

    public EndPanel getEndPanel() {
        return endPanel;
    }

    public void setStartPanel(StartPanel panel){
        startPanel = panel;
    }



}