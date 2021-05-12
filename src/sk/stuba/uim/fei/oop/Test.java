package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String args[]){

        JFrame F = new JFrame();
        F.setSize(300,200);
        F.setLayout(new BorderLayout());
        F.add(BorderLayout.CENTER,new TestCanvas());
        JPanel p = new JPanel();
        p.add(new JButton("Change"));
        p.add(new JButton("Close"));
        F.add(BorderLayout.SOUTH,p);
        F.setVisible(true);

    }
}
