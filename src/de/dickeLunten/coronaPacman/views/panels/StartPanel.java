package de.dickeLunten.coronaPacman.views.panels;

import de.dickeLunten.coronaPacman.ModelListener;
import de.dickeLunten.coronaPacman.ViewListener;
import de.dickeLunten.coronaPacman.controller.NavigationPanels;
import de.dickeLunten.coronaPacman.models.panel.StartModel;
import util.Data;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class StartPanel extends JPanel {
    private final StartModel model;
    private final ModelListener modelListener;

    private Image pogImg;

    public StartPanel(StartModel model, ViewListener viewListener) {
        this.model = model;
        this.viewListener = viewListener;
        setBackground(Color.GRAY);
        setLayout(new BorderLayout());

        /*        BufferedImage image = null;
        try {
            image = ImageIO.read(getClass().getResource("/froschi.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        //^das selbe wie da unten

        //TODO add image and intitialize all models
        add(model.getBackgroundImg());


        JButton startBtn = new JButton("Press ENTER to start");
        //startBtn.setFont(new Font("Pac-Font", Font.PLAIN, 40));
        startBtn.setLocation(720, 5);
        startBtn.setSize(300,300);
        startBtn.setOpaque(false);
        startBtn.setContentAreaFilled(false);
        startBtn.setBorderPainted(false);
        startBtn.setFont(new Font("sans", Font.PLAIN, 70));


        startBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewListener.onNavigate(NavigationPanels.GAME_PANEL);
            }
        });
        add(startBtn, BorderLayout.NORTH);

        //JLabel highscoreLabel = new JLabel("Highscores: ");
        //add(highscoreLabel, BorderLayout.NORTH);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(pogImg, 0, 0, null);
    }
}