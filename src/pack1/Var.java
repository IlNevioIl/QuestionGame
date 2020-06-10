package pack1;



import question1.continuebutton1;
import question1.labelquestion1;
import question2.*;
import question3.continuebutton3;
import question3.labelquestion3;
import question3.nobutton3;
import question3.yesbutton3;

import javax.swing.*;

public class Var {


    //public static int x3;
    static JFrame jf1;
    static  int screenwidth = 400, screenheight = 300;




    //Label Cords
    public static int x2 = 65, y2 = 0, width2 = 300, height2 = 200, size = 40;
    public static JLabel jl1 = new firstlabel();

    //Label Cords Question
    public static int width4 = 600;
    public static JLabel jl2 = new labelquestion1();
    public static JLabel jl3 = new labelquestion2();
    public static JLabel jl5 = new labelquestion3();

    //Label Cords Right Answer
    public static JLabel jl4 = new rightanswerlabel2();

    //Yes Button Cords
    public static int x3 = 50, y3 = 200, width3 = 95, height3 = 30;
    public static JButton jb1 = new yesbutton();
    public static JButton jb4 = new yesbutton2();
    public static JButton jb7 = new yesbutton3();

    //No Button Cords
    public static int x4 = 250;
    public static JButton jb2 = new nobutton();
    public static JButton jb5 = new nobutton2();
    public static JButton jb8 = new nobutton3();

    //Continue Button Cords
    public static int x5 = 125;
    public static JButton jb3 = new continuebutton1();
    public static JButton jb6 = new continuebutton2();
    public static JButton jb9 = new continuebutton3();

    public  Var() {


    }

}
