package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swing_2 extends JFrame {
    private JPanel panelMain;
    private JLabel firstString;
    private JTextField textFristStirng;
    private JLabel secoundString;
    private JTextField textSecoundString;
    private JButton compare;
    private JButton concatenate;
    private JLabel outPut;
    private JLabel ans;

    public swing_2(){
        setContentPane(panelMain);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Compare and Concatenate");
        setSize(450,300);
        setVisible(true);

        compare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String first = textFristStirng.getText();
                String Secound= textSecoundString.getText();
                int third = first.compareTo(Secound);
                ans.setText(String.valueOf(third));


            }
        });
        concatenate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String first = textFristStirng.getText();
                String Secound= textSecoundString.getText();
                String third = first + Secound ;
                ans.setText(third);

            }
        });
    }
    public static void main(String[] args) {
        swing_2 obj= new swing_2();
    }
}
