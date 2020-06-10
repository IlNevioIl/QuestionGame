package question4;

import pack1.Var;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class continuebutton4 extends JButton {
    public continuebutton4() {

        super("Continue");
        this.setVisible(false);
        this.setBounds(Var.x5, Var.y3, Var.width3, Var.height3);
        this.setForeground( Color.white);
        this.setBackground( Color.black);
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Var.jl4.setVisible(false);
                Var.jb12.setVisible(false);
                Var.jl7.setVisible(true);
                Var.jb13.setVisible(true);
                Var.jb14.setVisible(true);
            }
        });
    }
}
