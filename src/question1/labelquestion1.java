package question1;

import pack1.Var;

import javax.swing.*;
import java.awt.*;

public class labelquestion1 extends JLabel {
    public labelquestion1() {
        this.setText("Ok lets go :)");
        this.setBounds(Var.x2, Var.y2, Var.width2, Var.height2);
        this.setForeground( Color.white);
        this.setFont(new Font("Arial", Font.PLAIN,Var.size));
        this.setVisible(false);
    }


}

