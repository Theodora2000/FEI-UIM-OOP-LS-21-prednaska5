package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String args[]){

        JFrame F = new JFrame();

        F.setLayout(new GridLayout(0,2));
        F.add(new JLabel("riadok1, stlpec1"));
        F.add(new JLabel("riadok1, stlpec2"));
        F.add(new JLabel("riadok2, stlpec1"));
        F.add(new JLabel("riadok2, stlpec2"));
        F.add(new JLabel("riadok3, stlpec1")) ;
        F.pack();//spakuje to do najlepseho menseho tvaru
        F.setVisible(true);

    }
}
