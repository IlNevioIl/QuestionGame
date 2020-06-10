package question3;

import pack1.Var;

import javax.swing.*;
import java.awt.*;

public class labelquestion3 extends JLabel {
    public labelquestion3() {
        this.setText("Is Corona a Virus?");
        this.setBounds(Var.x2, Var.y2, Var.width4, Var.height2);
        this.setForeground( Color.white);
        this.setFont(new Font("Arial", Font.PLAIN,Var.size));
        this.setVisible(false);
    }


}
