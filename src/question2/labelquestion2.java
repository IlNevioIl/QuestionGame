package question2;

import pack1.Var;

import javax.swing.*;
import java.awt.*;

public class labelquestion2 extends JLabel {
    public labelquestion2() {
        this.setText("Is 2+2=4 ?");
        this.setBounds(Var.x2, Var.y2, Var.width2, Var.height2);
        this.setForeground( Color.white);
        this.setFont(new Font("Arial", Font.PLAIN,Var.size));
        this.setVisible(false);
    }


}
