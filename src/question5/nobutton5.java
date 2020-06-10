package question5;

import pack1.Var;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class nobutton5 extends JButton {
    public nobutton5() {

        super("No");
        this.setVisible(false);
        this.setBounds(Var.x4, Var.y3, Var.width3, Var.height3);
        this.setForeground( Color.white);
        this.setBackground( Color.black);
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Var.jb13.setVisible(false);
                Var.jb14.setVisible(false);
                Var.jl7.setVisible(false);
            }
        });
    }
}
