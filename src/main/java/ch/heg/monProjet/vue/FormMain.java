package ch.heg.monProjet.vue;



import ch.heg.monProjet.domaine.Persone;
import ch.heg.monProjet.manager.PersoneManager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FormMain extends JFrame {

    private JPanel MainPanel;
    private JButton btnVider;
    private JButton btnRemplir;
    private JList lstDonnee;
    private ArrayList<Persone> list;
    private DefaultListModel<String> dlm;
    public FormMain(){
        initCompenant();
        PersoneManager personeManager = new PersoneManager();
        personeManager.dataLoading();
        list = (ArrayList<Persone>) personeManager.getPersones();
        fillJlist();

    }

    private void initCompenant(){
        setContentPane(MainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setSize(500,500);
        dlm = new DefaultListModel<>();
        lstDonnee.setModel(dlm);
        btnRemplir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remplirActionPerfomed(e);
            }
        });
        btnVider.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viderActionPerfomed(e);
            }
        });
    }
    private void fillJlist(){
        dlm.clear();
        Persone p;
        for (int i = 0 ; i < list.size();i++ ) {
            p = list.get(i);
            dlm.add(i,   p.getLastName() + " "+p.getFirstName());
        }
    }
    private void remplirActionPerfomed(ActionEvent e){
        if(dlm.isEmpty()){
            fillJlist();
        }

    }
    private void viderActionPerfomed(ActionEvent e){
        dlm.clear();
    }



}
