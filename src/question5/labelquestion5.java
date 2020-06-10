package question5;

import pack1.Var;

import javax.swing.*;
import java.awt.*;

public class labelquestion5 extends JLabel {
    public labelquestion5() {
        this.setText("Do u like Fortnite?");
        this.setBounds(Var.x2, Var.y2, Var.width4, Var.height2);
        this.setForeground( Color.white);
        this.setFont(new Font("Arial", Font.PLAIN,Var.size));
        this.setVisible(false);
    }
}
