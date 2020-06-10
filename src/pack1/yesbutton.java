package pack1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class yesbutton extends JButton {
    public yesbutton() {

        super("Yes");
        this.setBounds(Var.x3, Var.y3, Var.width3, Var.height3);
        this.setForeground( Color.white);
        this.setBackground( Color.black);
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Var.jl2.setVisible(true);
                Var.jl1.setVisible(false);
                Var.jb1.setVisible(false);
                Var.jb2.setVisible(false);
            }
        });
    }


}



