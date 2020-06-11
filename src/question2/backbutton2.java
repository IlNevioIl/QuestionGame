package question2;

import pack1.Var;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class backbutton2 extends JButton {

    public backbutton2() {

        super("Back");
        this.setVisible(false);
        this.setBounds(Var.x5, Var.y3, Var.width3, Var.height3);
        this.setForeground( Color.white);
        this.setBackground( Color.black);
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Var.jb16.setVisible(false);
                Var.jl9.setVisible(false);
                Var.jl4.setVisible(false);
                Var.jb4.setVisible(true);
                Var.jb5.setVisible(true);
                Var.jl3.setVisible(true);
            }
        });
    }
}
