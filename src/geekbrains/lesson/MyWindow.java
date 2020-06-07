package geekbrains.lesson;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public MyWindow(){
        setBounds(500,300,750,300);
        setTitle("Последний урок");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton[] jbs = new JButton[10];
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
        for (int i = 0; i < jbs.length; i++) {
            jbs[i] = new JButton("№" + i);
            jbs[i].setAlignmentX(CENTER_ALIGNMENT);
            add(jbs[i]);
        }
        setVisible(true);
    }
}
