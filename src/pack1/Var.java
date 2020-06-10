package pack1;



import question1.continuebutton1;
import question1.labelquestion1;
import question2.*;
import question3.continuebutton3;
import question3.labelquestion3;
import question3.nobutton3;
import question3.yesbutton3;
import question4.continuebutton4;
import question4.labelquestion4;
import question4.nobutton4;
import question4.yesbutton4;
import question5.labelquestion5;
import question5.nobutton5;
import question5.yesbutton5;

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
    public static JLabel jl6 = new labelquestion4();
    public static JLabel jl7 = new labelquestion5();

    //Label Cords Right Answer
    public static JLabel jl4 = new rightanswerlabel2();

    //Yes Button Cords
    public static int x3 = 50, y3 = 200, width3 = 95, height3 = 30;
    public static JButton jb1 = new yesbutton();
    public static JButton jb4 = new yesbutton2();
    public static JButton jb7 = new yesbutton3();
    public static JButton jb10 = new yesbutton4();
    public static JButton jb13 = new yesbutton5();

    //No Button Cords
    public static int x4 = 250;
    public static JButton jb2 = new nobutton();
    public static JButton jb5 = new nobutton2();
    public static JButton jb8 = new nobutton3();
    public static JButton jb11 = new nobutton4();
    public static JButton jb14 = new nobutton5();

    //Continue Button Cords
    public static int x5 = 150;
    public static JButton jb3 = new continuebutton1();
    public static JButton jb6 = new continuebutton2();
    public static JButton jb9 = new continuebutton3();
    public static JButton jb12 = new continuebutton4();

    public  Var() {


    }

}
