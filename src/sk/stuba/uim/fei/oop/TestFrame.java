package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.JarURLConnection;

public class TestFrame extends JFrame implements ActionListener {

    String Close = "Zavri";
    String novinka = "New";
    public static int pocetFrameov = 0;
    public static int umiestnenie = 10;

    public TestFrame(String nazov){
        super();
        setSize(300,300);
        JPanel p = new JPanel();
        JButton b = new JButton(Close);
        b.addActionListener(this);
        JButton NOVY = new JButton(novinka);
        NOVY.addActionListener(this);

        p.add(b);
        p.add(NOVY);
        add(p);
        setLocation(umiestnenie, umiestnenie);

        setVisible(true);
        pocetFrameov++;
        umiestnenie+=50;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //getSource vrati cely objekt
        if(e.getActionCommand().equals(Close)){
           if(pocetFrameov==1) {
               dispose();
               System.exit(0);
           }else{
               dispose();
           }
        }
        if(e.getActionCommand().equals(novinka)){
            new TestFrame("Nova");

        }
    }
}
