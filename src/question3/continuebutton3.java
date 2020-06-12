package question3;

import pack1.Var;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class continuebutton3 extends JButton {
    public continuebutton3() {

        super("Continue");
        this.setVisible(false);
        this.setBounds(Var.x5, Var.y3, Var.width3, Var.height3);
        this.setForeground( Color.white);
        this.setBackground( Color.black);
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Var.jl4.setVisible(false);
                Var.jb9.setVisible(false);
                Var.jl6.setVisible(true);
                Var.jb10.setVisible(true);
                Var.jb11.setVisible(true);

                String soundName = "clicksound.wav";
                AudioInputStream audioInputStream = null;
                try {
                    audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
                } catch (UnsupportedAudioFileException unsupportedAudioFileException) {
                    unsupportedAudioFileException.printStackTrace();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                Clip clip = null;
                try {
                    clip = AudioSystem.getClip();
                } catch (LineUnavailableException lineUnavailableException) {
                    lineUnavailableException.printStackTrace();
                }
                try {
                    clip.open(audioInputStream);
                } catch (LineUnavailableException lineUnavailableException) {
                    lineUnavailableException.printStackTrace();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                clip.start();
            }
        });
    }
}
