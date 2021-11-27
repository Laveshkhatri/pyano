

import jdk.jfr.StackTrace;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;




class instrument implements MouseListener {

    JFrame frame;
    JLabel label, label1, label2;
    JButton btn, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn22, btn33;

    instrument() {
        frame = new JFrame();
        frame.setVisible(true);

        frame.setBounds(200, 100, 800, 500);

        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.PINK);
        JPanel panel = new JPanel();
        panel.setBackground(Color.PINK);
        panel.setBounds(50, 200, 700, 300);
        panel.setLayout(null);

        label1 = new JLabel("03043934140");
        label1.setBounds(60, 5, 200, 20);
        label1.setFont(new Font("Serif", Font.PLAIN, 20));


        label2 = new JLabel();
        ImageIcon icon1 = new ImageIcon("iconcal.png");
        label2.setIcon(icon1);
        label2.setBounds(10, -20, 50, 100);


        label = new JLabel();
        ImageIcon icon = new ImageIcon("pu1.png");
        label.setIcon(icon);
        label.setBounds(200, -70, 300, 300);

        btn = new JButton("A");
        btn.setBounds(20, 10, 50, 280);
        btn2 = new JButton("B");
        btn2.setBounds(71, 10, 50, 280);
        btn.setBackground(Color.black);
        btn2.setBackground(Color.white);


        btn.setFocusable(false);
        btn2.setFocusable(false);
        frame.setLayout(null);


        btn3 = new JButton("C");
        btn3.setBounds(122, 10, 50, 280);
        btn4 = new JButton("D");
        btn4.setBounds(172, 10, 50, 280);
        btn3.setBackground(Color.black);
        btn4.setBackground(Color.white);
        btn3.setFocusable(false);
        btn4.setFocusable(false);


        btn5 = new JButton("E");
        btn5.setBounds(220, 10, 50, 280);
        btn6 = new JButton("F");
        btn6.setBounds(270, 10, 50, 280);
        btn5.setBackground(Color.black);
        btn6.setBackground(Color.white);
        btn5.setFocusable(false);
        btn6.setFocusable(false);


        btn7 = new JButton("G");
        btn7.setBounds(320, 10, 50, 280);
        btn8 = new JButton("H");
        btn8.setBounds(370, 10, 50, 280);
        btn7.setBackground(Color.black);
        btn8.setBackground(Color.white);
        btn7.setFocusable(false);
        btn8.setFocusable(false);


        btn9 = new JButton("I");
        btn9.setBounds(420, 10, 50, 280);
        btn10 = new JButton("J");
        btn10.setBounds(470, 10, 50, 280);
        btn9.setBackground(Color.black);
        btn10.setBackground(Color.white);
        btn9.setFocusable(false);
        btn10.setFocusable(false);


        btn11 = new JButton("K");
        btn11.setBounds(520, 10, 50, 280);
        btn22 = new JButton("L");
        btn22.setBounds(570, 10, 50, 280);
        btn11.setBackground(Color.black);
        btn22.setBackground(Color.white);
        btn11.setFocusable(false);
        btn22.setFocusable(false);


        btn33 = new JButton("M");
        btn33.setBounds(620, 10, 50, 280);

        btn33.setBackground(Color.black);
        btn33.setFocusable(false);


        frame.add(panel);
        frame.add(label);
        frame.add(label1);
        panel.add(btn);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        panel.add(btn5);
        panel.add(btn6);
        panel.add(btn7);
        panel.add(btn8);
        panel.add(btn9);
        panel.add(btn10);
        panel.add(btn11);
        frame.add(label2);
        panel.add(btn22);
        panel.add(btn33);

        btn.addMouseListener(this);

        btn2.addMouseListener(this);
        btn3.addMouseListener(this);
        btn4.addMouseListener(this);
        btn5.addMouseListener(this);
        btn6.addMouseListener(this);
        btn7.addMouseListener(this);
        btn8.addMouseListener(this);
        btn9.addMouseListener(this);
        btn10.addMouseListener(this);
        btn11.addMouseListener(this);
        btn22.addMouseListener(this);
        btn33.addMouseListener(this);

    }



    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {


        if (e.getSource() == btn) {
            try {
                String path = "musi/A.wav";
//musi is folder name where A file is save and wav is extension
// of music file..java does not support mp3 files


                Clip player;
                AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
                player = AudioSystem.getClip();
                player.open(audio);

                player.start();

            } catch (Exception ue) {
                System.out.println(ue);
            }


        } else if (e.getSource() == btn2) {


            try {
                String path1 = "musi/aa.wav";

                Clip player1;
                AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path1));
                player1 = AudioSystem.getClip();
                player1.open(audio);

                player1.start();
            } catch (Exception ue) {
                System.out.println(ue);
            }


        } else if (e.getSource() == btn3) {


            try {
                String path2 = "musi/B.wav";

                Clip player2;
                AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path2));
                player2 = AudioSystem.getClip();
                player2.open(audio);

                player2.start();
            } catch (Exception ue) {
                System.out.println(ue);
            }


        } else if (e.getSource() == btn4) {


            try {
                String path3 = "musi/ss.wav";

                Clip player3;
                AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path3));
                player3 = AudioSystem.getClip();
                player3.open(audio);

                player3.start();
            } catch (Exception ue) {
                System.out.println(ue);
            }


        } else if (e.getSource() == btn5) {


            try {
                String path4 = "musi/C.wav";

                Clip player4;
                AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path4));
                player4 = AudioSystem.getClip();
                player4.open(audio);

                player4.start();
            } catch (Exception ue) {
                System.out.println(ue);
            }


        } else if (e.getSource() == btn6) {


            try {
                String path5 = "musi/C_Drum.wav";
                Clip player5;
                AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path5));
                player5 = AudioSystem.getClip();
                player5.open(audio);

                player5.start();
            } catch (Exception ue) {
                System.out.println(ue);
            }


        } else if (e.getSource() == btn7) {


            try {
                String path4 = "musi/ccc.wav";

                Clip player4;
                AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path4));
                player4 = AudioSystem.getClip();
                player4.open(audio);

                player4.start();
            } catch (Exception ue) {
                System.out.println(ue);
            }


        } else if (e.getSource() == btn8) {


            try {
                String path4 = "musi/cccc.wav";

                Clip player4;
                AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path4));
                player4 = AudioSystem.getClip();
                player4.open(audio);

                player4.start();
            } catch (Exception ue) {
                System.out.println(ue);
            }


        } else if (e.getSource() == btn9) {


            try {
                String path4 = "musi/D.wav";

                Clip player4;
                AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path4));
                player4 = AudioSystem.getClip();
                player4.open(audio);

                player4.start();
            } catch (Exception ue) {
                System.out.println(ue);
            }


        } else if (e.getSource() == btn10) {


            try {
                String path4 = "musi/D.wav";

                Clip player4;
                AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path4));
                player4 = AudioSystem.getClip();
                player4.open(audio);

                player4.start();
            } catch (Exception ue) {
                System.out.println(ue);
            }


        } else if (e.getSource() == btn11) {


            try {
                String path4 = "musi/Dq1_Drum.wav";

                Clip player4;
                AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path4));
                player4 = AudioSystem.getClip();
                player4.open(audio);

                player4.start();
            } catch (Exception ue) {
                System.out.println(ue);
            }


        } else if (e.getSource() == btn22) {


            try {
                String path4 = "musi/E.wav";

                Clip player4;
                AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path4));
                player4 = AudioSystem.getClip();
                player4.open(audio);

                player4.start();
            } catch (Exception ue) {
                System.out.println(ue);
            }


        } else if (e.getSource() == btn33) {


            try {
                String path4 = "musi/ee.wav";

                Clip player4;
                AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path4));
                player4 = AudioSystem.getClip();
                player4.open(audio);

                player4.start();
            } catch (Exception ue) {
                System.out.println(ue);
            }


        }









    }

    @Override
    public void mouseExited(MouseEvent e) {
    }





}










public class pyano {
    public static void main(String[] args)
    {
        instrument objet=new instrument();
    }
}
