/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author EGYPT-LAPTOP
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MangerFrame extends JFrame implements ActionListener {

    private  JPanel p1;
    private  JButton b1,b2,b3,b4,b5;

    public MangerFrame(){
        this.setVisible(true);
        this.setTitle("Manger");
        this.setResizable(false);
        this.setLocation(500,120);
        this.setSize(300,300);

        p1 = new JPanel();
        p1.setBackground(Color.yellow);
        p1.setLayout(null);
        b1 = new JButton(" Doctors");
        b2 = new JButton(" Nurse");
        b3 = new JButton(" Other Employee");
        b4 = new JButton(" Patients");
        b5 = new JButton(" Back");
        b1.setBounds(20,30,250,30);
        b2.setBounds(20,80,250,30);
        b3.setBounds(20,120,250,30);
        b4.setBounds(20,170,250,30);
        b5.setBounds(this.getWidth()-94,this.getHeight()-57,80,20);

        b1.setForeground(Color.darkGray);
        b1.setBackground(Color.yellow);
        b1.setFont(new Font("font",Font.BOLD,20));
        b2.setForeground(Color.darkGray);
        b2.setBackground(Color.yellow);
        b2.setFont(new Font("font",Font.BOLD,20));
        b3.setForeground(Color.darkGray);
        b3.setBackground(Color.yellow);
        b3.setFont(new Font("font",Font.BOLD,20));
        b4.setForeground(Color.darkGray);
        b4.setBackground(Color.yellow);
        b4.setFont(new Font("font",Font.BOLD,20));
        b5.setForeground(Color.darkGray);
        b5.setBackground(Color.yellow);
        b5.setFont(new Font("font",Font.BOLD,15));




        this.add(p1);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1){
            DoctorManger doctorManger  = new DoctorManger();
            this.setVisible(false);
        }
        if (e.getSource() == b2){
            NurseManger nurseManger = new NurseManger();
            this.setVisible(false);

        }
        if (e.getSource() == b3){
            OtherEmployeeManger otherEmployeeManger = new OtherEmployeeManger();
            this.setVisible(false);

        }
        if (e.getSource() == b4){
            PatientManger patientManger = new PatientManger();
            patientManger.setVisible(true);
            patientManger.setResizable(false);
            this.setVisible(false);

        }
        if (e.getSource() == b5){
            startMenu startMenu = new startMenu();
            this.setVisible(false);

        }
    }
}
