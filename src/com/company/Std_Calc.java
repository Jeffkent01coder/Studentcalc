package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Std_Calc {
    private JLabel title;
    private JLabel name;
    private JLabel admNo;
    private JLabel math;
    private JLabel eng;
    private JLabel kis;
    private JLabel tot;
    private JLabel avg;
    private JLabel grade;
    private JButton calc;
    private JTextField nme;
    private JTextField adm;
    private JTextField mao;
    private JTextField engl;
    private JTextField kiswa;
    private JTextField total;
    private JTextField averg;
    private JTextField grd;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Std_Calc");
        frame.setContentPane(new Std_Calc().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Std_Calc() {
        calc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int M, E, K, TOT;
                double avg;

                M = Integer.parseInt(mao.getText());
                E = Integer.parseInt(engl.getText());
                K = Integer.parseInt(kiswa.getText());

                TOT = M + E + K;
                total.setText(String.valueOf(TOT));

                avg = TOT/3;
                averg.setText(String.valueOf(avg));

                if (avg > 50){
                    grd.setText("PASS");
                }
                else {
                    grd.setText("FAIL");
                }



            }
        });
    }
}
