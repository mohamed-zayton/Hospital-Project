/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Accountant extends JFrame implements ActionListener {

    // Define Variables
    private JPanel p1 ;
    private JButton b1,b2,b3,b4;
    private  JLabel l1;

    public  Accountant(){
        this.setSize(300,400);
        this.setTitle("Welcome Accountant");
        this.setLocation(500,120);
        this.setVisible(true);
        this.setResizable(false);

        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.yellow);
        l1 = new JLabel("Employees : ");
        b1 = new JButton("Doctors");
        b2 = new JButton("Nurse");
        b3 = new JButton("Other Employee");
        b4 = new JButton("Back");
        l1.setBounds(10,30,450,45);
        b1.setBounds(5,100,this.getWidth()-24,30);
        b2.setBounds(5,150,this.getWidth()-24,30);
        b3.setBounds(5,200,this.getWidth()-24,30);
        b4.setBounds(this.getWidth()-94,this.getHeight()-67,80,30);


        l1.setFont(new Font("font",Font.BOLD,25));
        b1.setFont(new Font("font",Font.BOLD,18));
        b2.setFont(new Font("font",Font.BOLD,18));
        b3.setFont(new Font("font",Font.BOLD,18));
        b4.setFont(new Font("font",Font.BOLD,15));

        b1.setBackground(Color.DARK_GRAY);
        b1.setForeground(Color.white);
        b2.setBackground(Color.DARK_GRAY);
        b2.setForeground(Color.white);
        b3.setBackground(Color.DARK_GRAY);
        b3.setForeground(Color.white);
        b4.setBackground(Color.yellow);
        b4.setForeground(Color.gray);
        l1.setForeground(Color.gray);
        this.add(p1);
        p1.add(l1);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1){
            DoctorFrame doctorFrame = new DoctorFrame();
            this.setVisible(false);
        }
        if (e.getSource() == b2){
            NurseControlFrame nurseFrame = new NurseControlFrame();
            this.setVisible(false);

        }
        if (e.getSource() == b3){
            OtherEmployeeFrame otherEmployee = new OtherEmployeeFrame();
            this.setVisible(false);

        }
        if (e.getSource() == b4){
            startMenu startMenu = new startMenu();
            this.setVisible(false);

        }
    }
}
