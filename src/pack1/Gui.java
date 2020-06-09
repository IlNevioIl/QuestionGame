package pack1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame{
    JLabel areyouready;

    public Gui () {

        //The window

        Var.jf1 = new JFrame();
        Var.jf1.setSize(Var.screenwidth, Var.screenheight);
        Var.jf1.setTitle("Quiz");
        Var.jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Var.jf1.setLayout(null);
        Var.jf1.setResizable(false);
        Var.jf1.setVisible(true);
        Var.jf1.setLocationRelativeTo(null);
        Var.jf1.requestFocus();
        Var.jf1.getContentPane().setBackground( Color.black);

        //The Question

        Var.jl1 = new JLabel("Are you ready?");
        Var.jl1.setBounds(Var.x3, Var.y2, Var.width2, Var.height2);
        Var.jl1.setFont(new Font("Arial", Font.PLAIN,Var.size));
        Var.jl1.setForeground( Color.white);
        Var.jf1.add(Var.jl1);

        //Yes Button

        Var.jb1 = new JButton("Yes");
        Var.jb1.setBounds(Var.x, Var.y, Var.width, Var.height);
        Var.jb1.setForeground( Color.white);
        Var.jb1.setBackground( Color.black);
        Var.jf1.add(Var.jb1);

        //No Button

        Var.jb2 = new JButton("No");
        Var.jb2.setBounds(Var.x2, Var.y, Var.width, Var.height);
        Var.jb2.setForeground( Color.white);
        Var.jb2.setBackground( Color.black);
        Var.jf1.add(Var.jb2);
    }



            }





