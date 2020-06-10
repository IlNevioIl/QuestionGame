package question4;

import pack1.Var;

import javax.swing.*;
import java.awt.*;

public class labelquestion4 extends JLabel {
    public labelquestion4() {
        this.setText("Is 0 - 1 = 1 ?");
        this.setBounds(Var.x2, Var.y2, Var.width4, Var.height2);
        this.setForeground( Color.white);
        this.setFont(new Font("Arial", Font.PLAIN,Var.size));
        this.setVisible(false);
    }


}
