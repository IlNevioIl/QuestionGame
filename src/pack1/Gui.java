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

        //Adding all the Buttons to Frame:
        Var.jf1.add(Var.jb1);
        Var.jf1.add(Var.jb2);

        //Adding all the Labels to the Frame:
        Var.jf1.add(Var.jl1);
    }



            }