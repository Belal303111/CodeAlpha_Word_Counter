package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String args[])
    {
        JFrame f =new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setLayout(null);
        f.getContentPane().setBackground(Color.GREEN);
        f.setSize(600,600);
        JLabel l=new JLabel("This is My page to calculate the number of words in a string");
        l.setBounds(50,-20,400,70);
        f.add(l);
        JTextArea A =new JTextArea();
        A.setBounds(50,50,500,200);
        f.add(A);
        JButton b =new JButton("Press the button");
        b.setBounds(20,250,150,30);
        f.add(b);
        JLabel result = new JLabel("The Result will appear here");
        result.setBounds(20,300,300,50);
        f.add(result);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = A.getText().trim(); //delete the spaces from the start and the end
                if(text.isEmpty())
                    result.setText("There is not found any word");
                else
                {
                    String [] words = text.split("\\s+"); //fetch the words only
                    result.setText("The number of words is: "+words.length);
                }
            }
        });
    }
}
