package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.JarURLConnection;

public class TestFrame extends JFrame implements ActionListener {

    String Close = "Zavri";
    String novinka = "New";

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

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //getSource vrati cely objekt
        if(e.getActionCommand().equals(Close)){
            dispose();
            System.exit(0);
        }
        if(e.getActionCommand().equals(novinka)){
            new TestFrame("Nova");
        }
    }
}
