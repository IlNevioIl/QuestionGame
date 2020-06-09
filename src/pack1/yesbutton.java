package pack1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class yesbutton extends JButton {
    public yesbutton() {
        super("Yes");
        this.setBounds(Var.x, Var.y, Var.width, Var.height);
        this.setForeground( Color.white);
        this.setBackground( Color.black);
    }


}



