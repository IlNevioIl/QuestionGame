package question3;

import pack1.Var;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class yesbutton3 extends JButton {
    public yesbutton3() {

        super("Yes");
        this.setVisible(false);
        this.setBounds(Var.x3, Var.y3, Var.width3, Var.height3);
        this.setForeground( Color.white);
        this.setBackground( Color.black);
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Var.jl5.setVisible(false);
                Var.jb7.setVisible(false);
                Var.jb8.setVisible(false);
                Var.jb9.setVisible(true);
                Var.jl4.setVisible(true);
            }
        });
    }
}
