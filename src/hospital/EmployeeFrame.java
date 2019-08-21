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

public class EmployeeFrame extends JFrame implements ActionListener {
    private JPanel p1 ;
    private JButton b1,b2,b3,b4,b5,b6;
    private JLabel l1;

    public EmployeeFrame(){
        this.setSize(400,450);
        this.setTitle("Other Employee Data");
        this.setLocation(500,120);
        this.setVisible(true);
        this.setResizable(false);


        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.yellow);
        l1 = new JLabel("Other Employee Data : ");
        b1 = new JButton("Insert Data");
        b2 = new JButton("Update Data");
        b3 = new JButton("Delete Data");
        b4 = new JButton("Show All Data");
        b5 = new JButton("Search For Data");
        b6 = new JButton("Back");
        l1.setBounds(10,30,450,45);
        b1.setBounds(5,100,this.getWidth()-24,30);
        b2.setBounds(5,150,this.getWidth()-24,30);
        b3.setBounds(5,200,this.getWidth()-24,30);
        b4.setBounds(5,250,this.getWidth()-24,30);
        b5.setBounds(5,300,this.getWidth()-24,30);
        b6.setBounds(this.getWidth()-94,this.getHeight()-67,80,30);

        l1.setFont(new Font("font",Font.BOLD,25));
        b1.setFont(new Font("font",Font.BOLD,18));
        b2.setFont(new Font("font",Font.BOLD,18));
        b3.setFont(new Font("font",Font.BOLD,18));
        b4.setFont(new Font("font",Font.BOLD,18));
        b5.setFont(new Font("font",Font.BOLD,18));
        b6.setFont(new Font("font",Font.BOLD,15));

        l1.setForeground(Color.gray);
        b1.setBackground(Color.DARK_GRAY);
        b1.setForeground(Color.white);
        b2.setBackground(Color.DARK_GRAY);
        b2.setForeground(Color.white);
        b3.setBackground(Color.DARK_GRAY);
        b3.setForeground(Color.white);
        b4.setForeground(Color.white);
        b4.setBackground(Color.DARK_GRAY);
        b5.setForeground(Color.white);
        b5.setBackground(Color.DARK_GRAY);
        b6.setBackground(Color.yellow);
        b6.setForeground(Color.gray);




        this.add(p1);
        p1.add(l1);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        p1.add(b6);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1){
            InsertOtherEmployeeFrame insertOtherEmployeeFrame = new InsertOtherEmployeeFrame();
            this.setVisible(false);


        }
        if (e.getSource() == b2){
            UpdateOtherEmployeeFrame updateOtherEmployeeFrame = new UpdateOtherEmployeeFrame();
            this.setVisible(false);

        }
        if (e.getSource() == b3){
            DeleteOtherEmployeeFarme deleteOtherEmployeeFarme = new DeleteOtherEmployeeFarme();
            this.setVisible(false);

        }
        if (e.getSource() == b4){
            ShowDataEmployeeFrame showDataEmployeeFrame = new ShowDataEmployeeFrame();
            showDataEmployeeFrame.setResizable(false);
            this.setVisible(false);

        }
        if (e.getSource() == b5){
            SearchOtherEmployee searchOtherEmployee = new SearchOtherEmployee();
            this.setVisible(false);

        }
        if (e.getSource() == b6){
            Accountant accountant = new Accountant();
            this.setVisible(false);
        }

    }
}


