package question4;

import pack1.Var;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class nobutton4 extends JButton {
    public nobutton4() {

        super("No");
        this.setVisible(false);
        this.setBounds(Var.x4, Var.y3, Var.width3, Var.height3);
        this.setForeground( Color.white);
        this.setBackground( Color.black);
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Var.jb12.setVisible(true);
                Var.jl4.setVisible(true);
                Var.jb10.setVisible(false);
                Var.jb11.setVisible(false);
                Var.jl6.setVisible(false);
                Var.jf1.getContentPane().setBackground( Color.green);
            }
        });
    }
}
