package question4;

import pack1.Var;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class yesbutton4 extends JButton {
    public yesbutton4() {

        super("Yes");
        this.setVisible(false);
        this.setBounds(Var.x3, Var.y3, Var.width3, Var.height3);
        this.setForeground( Color.white);
        this.setBackground( Color.black);
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Var.jl6.setVisible(false);
                Var.jb10.setVisible(false);
                Var.jb11.setVisible(false);
                Var.jl9.setVisible(true);
                Var.jb16.setVisible(true);
                Var.jf1.getContentPane().setBackground( Color.red);
            }
        });
    }
}
