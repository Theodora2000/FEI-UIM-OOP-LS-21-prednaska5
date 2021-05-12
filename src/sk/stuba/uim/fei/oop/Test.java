package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String args[]){
        JFrame F = new JFrame();
        F.setSize(300,200);
        F.add(new TestCanvas());
        F.setVisible(true);

    }
}
