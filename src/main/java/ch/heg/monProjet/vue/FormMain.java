package ch.heg.monProjet.vue;

import javax.swing.*;

public class FormMain extends JFrame {

    private JPanel MainPanel;
    private JButton btnVider;
    private JButton btnRemplir;
    private JList lstDonnee;
    public FormMain(){
        initCompenant();
    }

    private void initCompenant(){
        setContentPane(MainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setSize(500,500);
    }
}
