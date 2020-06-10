package pack1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class yesbutton extends JButton {
    public yesbutton() {

        super("Yes");
        this.setBounds(50,200,95,30);
        this.setForeground( Color.white);
        this.setBackground( Color.black);
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Var.jl2.setVisible(true);
                Var.jl1.setVisible(false);
            }
        });
    }


}



