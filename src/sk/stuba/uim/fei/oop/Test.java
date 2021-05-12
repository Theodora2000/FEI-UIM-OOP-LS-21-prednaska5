package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String args[]){

        JFrame F = new JFrame();
        F.setSize(300,300);
        JPanel p = new JPanel();
        MyButton b = new MyButton("OK");
        p.add(b);
        F.add(p);
        F.setVisible(true);

    }
}
