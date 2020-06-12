package pack1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class nobutton extends JButton {
    public nobutton() {
        super("No");
        this.setBounds(Var.x4, Var.y3, Var.width3, Var.height3);
        this.setForeground( Color.white);
        this.setBackground( Color.black);
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Var.jl1.setVisible(false);
                Var.jb1.setVisible(false);
                Var.jb2.setVisible(false);
                Var.jl10.setVisible(true);
                Var.jb15.setVisible(true);
                Var.jf1.getContentPane().setBackground( Color.red);

            }
        });
    }

}
