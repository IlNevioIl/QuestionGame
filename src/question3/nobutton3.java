package question3;

import pack1.Var;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class nobutton3 extends JButton {
    public nobutton3() {

        super("No");
        this.setVisible(false);
        this.setBounds(Var.x4, Var.y3, Var.width3, Var.height3);
        this.setForeground( Color.white);
        this.setBackground( Color.black);
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Var.jl5.setVisible(false);
                Var.jb7.setVisible(false);
                Var.jb8.setVisible(false);
                Var.jl9.setVisible(true);
                Var.jb16.setVisible(true);
                Var.jf1.getContentPane().setBackground( Color.red);
            }
        });
    }
}
