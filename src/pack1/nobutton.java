package pack1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class nobutton extends JButton {
    public nobutton() {
        super("No");
        this.setBounds(Var.x2, Var.y, Var.width, Var.height);
        this.setForeground( Color.white);
        this.setBackground( Color.black);
    }
}