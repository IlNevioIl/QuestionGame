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
        Var.jf1.add(Var.jb7);
        Var.jf1.add(Var.jb10);
        Var.jf1.add(Var.jb13);

        //Adding all the No Buttons to Frame:
        Var.jf1.add(Var.jb2);
        Var.jf1.add(Var.jb5);
        Var.jf1.add(Var.jb8);
        Var.jf1.add(Var.jb11);
        Var.jf1.add(Var.jb14);

        //Adding all the Continue Buttons to Frame:
        Var.jf1.add(Var.jb3);
        Var.jf1.add(Var.jb6);
        Var.jf1.add(Var.jb9);
        Var.jf1.add(Var.jb12);
        Var.jf1.add(Var.jb15);


        //Adding all the Labels to the Frame:
        Var.jf1.add(Var.jl1);

        //Adding all the Question Labels to the Frame:
        Var.jf1.add(Var.jl2);
        Var.jf1.add(Var.jl3);
        Var.jf1.add(Var.jl5);
        Var.jf1.add(Var.jl6);
        Var.jf1.add(Var.jl7);

        //Adding all the Right/Wrong/Credits Answers Labels to the Frame:
        Var.jf1.add(Var.jl4);
        Var.jf1.add(Var.jl8);
        ;
    }



            }