package question;

import pack1.Var;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class question extends JLabel {
    public question() {
        this.setBounds(Var.x3, Var.y2, Var.width2, Var.height2);
        this.setText("Are you ready?");
        this.setForeground( Color.white);
        this.setFont(new Font("Arial", Font.PLAIN, Var.size = 40));
    }


}