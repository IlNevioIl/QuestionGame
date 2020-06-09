package pack1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class label extends JLabel {
    public label() {
        super("Yes");
        this.setBounds(Var.x3, Var.y2, Var.width2, Var.height2);
        this.setFont(new Font("Arial", Font.PLAIN,Var.size));
        this.setForeground( Color.white);

        Var.jf1.add(Var.jl1);
    }


}