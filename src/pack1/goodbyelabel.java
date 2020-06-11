package pack1;

import javax.swing.*;
import java.awt.*;

public class goodbyelabel extends JLabel {
    public goodbyelabel() {
        this.setVisible(false);
        this.setText("Goodbye");
        this.setBounds(Var.x2, Var.y2, Var.width2, Var.height2);
        this.setForeground( Color.white);
        this.setFont(new Font("Arial", Font.PLAIN,Var.size));
    }
}
