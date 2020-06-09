package pack1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class yesbutton {



    public void actionPerformed(ActionEvent e) {

        Var.jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        if (e.getSource() == Var.jb2)
            System.exit(0);
        {
        }

    }
}