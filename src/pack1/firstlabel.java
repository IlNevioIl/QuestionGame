package pack1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class firstlabel extends JLabel {
    public firstlabel() {
        this.setText("Are you ready?");
        this.setBounds(Var.x3, Var.y2, Var.width2, Var.height2);
        this.setForeground( Color.white);
        this.setFont(new Font("Arial", Font.PLAIN,Var.size));
    }


}