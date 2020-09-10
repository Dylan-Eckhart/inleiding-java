package HO8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht2 extends Applet {

    //Declaratie Variabelen
    int M;
    int V;
    int PM;
    int PV;
    int Totaal;

    //Declaratie Knoppen
    TextField Tekstvak;
    Button BM;
    Button BV;
    Button BPM;
    Button BPV;

    //Declaratie string
    String SM;
    String SV;
    String SPM;
    String SPV;

    public void init() {
        setSize(800,200);

        //Initalisatie Variabelen
        M = 0;
        V = 0;
        PM = 0;
        PV = 0;
        Totaal = M + V + PM + PV;
        Tekstvak = new TextField("",5);

        //Initalisatie Knoppen
        BM = new Button("Mannelijke Studenten");
        BV = new Button("Vrouwelijke Studenten");
        BPM = new Button("Potentiele Mannelijke Studenten");
        BPV = new Button("Potentiele Vrouwlijke Studenten");

        //Initalisatie Functies Knoppen
        BM.addActionListener(new Man());
        BV.addActionListener(new Vrouw());
        BPM.addActionListener(new PMan());
        BPV.addActionListener(new PVrouw());

        //Initalisatie Add Knoppen
        add(BM);
        add(BV);
        add(BPM);
        add(BPV);
        add(Tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("Mannelijke Studenten: ",50,60);
        g.drawString("Vrouwlijke Studenten: ",50,80);
        g.drawString("Potentiele Mannelijke Studenten: ",50,100);
        g.drawString("Potentiele Vrouwelijke Studenten: ",50,120);
        g.drawString("Totaal: " + Totaal,50,140);
        g.drawString(SM,150,50);
        g.drawString(SM,150,50);
        g.drawString(SM,150,50);
        g.drawString(SM,150,50);
        g.drawString(SM,150,50);
    }

    class Man implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            SM = Tekstvak.getText();
            repaint();
        }
    }

    class Vrouw implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            SV = Tekstvak.getText();
            repaint();
        }
    }

    class PMan implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            SPM = Tekstvak.getText();
            repaint();
        }
    }

    class PVrouw implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            SPV = Tekstvak.getText();
            repaint();
        }
    }

}