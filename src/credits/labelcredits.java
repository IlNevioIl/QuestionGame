package credits;

import pack1.Var;

import javax.swing.*;
import java.awt.*;

public class labelcredits extends JLabel {
    public labelcredits() {
        this.setText("Thx for playing :)");
        this.setBounds(Var.x2, Var.y2, Var.width4, Var.height2);
        this.setForeground( Color.white);
        this.setFont(new Font("Arial", Font.PLAIN,Var.size));
        this.setVisible(false);
    }
}
