package question2;

import pack1.Var;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class yesbutton2 extends JButton {
    public yesbutton2() {

        super("Yes");
        this.setVisible(false);
        this.setBounds(Var.x3, Var.y3, Var.width3, Var.height3);
        this.setForeground( Color.white);
        this.setBackground( Color.black);
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Var.jl3.setVisible(false);
                Var.jb4.setVisible(false);
                Var.jb5.setVisible(false);
                Var.jb6.setVisible(true);
                Var.jl4.setVisible(true);
                Var.jf1.getContentPane().setBackground( Color.green);
            }
        });
    }


}
