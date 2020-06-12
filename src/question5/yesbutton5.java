package question5;

import pack1.Var;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class yesbutton5 extends JButton {
    public yesbutton5() {

        super("Yes");
        this.setVisible(false);
        this.setBounds(Var.x3, Var.y3, Var.width3, Var.height3);
        this.setForeground( Color.white);
        this.setBackground( Color.black);
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Var.jl7.setVisible(false);
                Var.jb13.setVisible(false);
                Var.jb14.setVisible(false);
                Var.jl9.setVisible(true);
                Var.jb16.setVisible(true);
                Var.jf1.getContentPane().setBackground( Color.red);
            }
        });
    }
}
