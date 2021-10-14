package com.company;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing1 extends JFrame {
    private JTextField tFirst;
    private JTextField tSecound;
    private JButton devide;
    private JButton multiply;
    private JPanel mainPanel ;
    private JTextField tCalculate;

    public Swing1(){
        setContentPane(mainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("devide and multiply");
        setSize(450,300);
        setVisible(true);

        devide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             double a=Integer.parseInt(tFirst.getText());
             double b=Integer.parseInt(tSecound.getText());
             double c= a/b;
             String s1= String.valueOf(c);
             tCalculate.setText(s1);
            }
        });
        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a=Integer.parseInt(tFirst.getText());
                double b=Integer.parseInt(tSecound.getText());
                double c= a*b;
                String s1= String.valueOf(c);
                tCalculate.setText(s1);
            }
        });
    }
    public static void main(String[] args) {
        Swing1 obj= new Swing1();
    }
}
