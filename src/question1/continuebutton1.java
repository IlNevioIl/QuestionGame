package question1;

import pack1.Var;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class continuebutton1 extends JButton {
    public continuebutton1() {

        super("Continue");
        this.setBounds(50,200,95,30);
        this.setForeground( Color.white);
        this.setBackground( Color.black);
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Var.jl2.setVisible(false);
            }
        });
    }


}

