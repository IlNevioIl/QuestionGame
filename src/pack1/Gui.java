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

        //Adding all the Yes Buttons to Frame:
        Var.jf1.add(Var.jb1);
        Var.jf1.add(Var.jb4);

        //Adding all the No Buttons to Frame:
        Var.jf1.add(Var.jb2);
        Var.jf1.add(Var.jb5);

        //Adding all the Continue Buttons to Frame:
        Var.jf1.add(Var.jb3);
        Var.jf1.add(Var.jb6);


        //Adding all the Labels to the Frame:
        Var.jf1.add(Var.jl1);
        Var.jf1.add(Var.jl2);
        Var.jf1.add(Var.jl3);
        ;
    }



            }