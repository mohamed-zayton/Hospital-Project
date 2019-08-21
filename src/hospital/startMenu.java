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

public class startMenu extends JFrame implements ActionListener {

    //Define Variables
    private JPanel p1;
    private ButtonGroup g1;
    private JRadioButton c1,c2,c3;
    private JButton b1;
    private JTextField t1;
    private JPasswordField t2;
    private JLabel l1,l2,l3,l4;


    public startMenu(){
        this.setSize(300,450);
        this.setLocation(500,120);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("Main");
        t1 = new JTextField();
        t2 = new JPasswordField();
        b1 = new JButton("Sgin in");
        c1 = new JRadioButton("Manger");
        c2 = new JRadioButton("Accountant");
        c3 = new JRadioButton("Receptionist");
        l1 = new JLabel("Name");
        l2 = new JLabel("Password");
        l3 = new JLabel("Choose one : ");
        l4 = new JLabel("");

        g1 = new ButtonGroup();
        p1 = new JPanel();
        p1.setLayout(null);
        l1.setBounds(30,30,90,30);
        l2.setBounds(10,70,90,30);
        t1.setBounds(120,30,150,25);
        t2.setBounds(120,70,150,25);
        l3.setBounds(10,110,300,35);
        c1.setBounds(20,160,180,30);
        c2.setBounds(20,200,180,30);
        c3.setBounds(20,240,180,30);
        b1.setBounds(100,300,100,25);
        p1.setBackground(Color.yellow);
        l1.setFont(new Font("font",Font.BOLD,18));
        l2.setFont(new Font("font",Font.BOLD,18));
        t1.setFont(new Font("font",Font.BOLD,18));
        t2.setFont(new Font("font",Font.BOLD,18));
        l3.setFont(new Font("font",Font.BOLD,25));
        c1.setFont(new Font("font",Font.BOLD,18));
        c2.setFont(new Font("font",Font.BOLD,18));
        c3.setFont(new Font("font",Font.BOLD,18));
        b1.setFont(new Font("font",Font.BOLD,18));
        l1.setForeground(Color.black);
        l2.setForeground(Color.black);
        c1.setForeground(Color.black);
        c2.setForeground(Color.black);
        c3.setForeground(Color.black);
        l3.setForeground(Color.black);
        c1.setBackground(Color.yellow);
        c2.setBackground(Color.yellow);
        c3.setBackground(Color.yellow);



        this.add(p1);
        g1.add(c1);
        g1.add(c2);
        g1.add(c3);
        p1.add(l1);
        p1.add(l2);
        p1.add(l3);
        p1.add(t1);
        p1.add(t2);
        p1.add(b1);
        p1.add(c1);
        p1.add(c2);
        p1.add(c3);
        b1.addActionListener(this);
        c1.addActionListener(this);
        c2.addActionListener(this);
        c3.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == b1 && c1.isSelected() && t2.getText().equals("manger") && t1.getText().equals("manger")){
            MangerFrame manger = new MangerFrame();
            manger.show();
            System.out.println("ok");
            this.setVisible(false);
        }
        if(e.getSource() == b1 && c2.isSelected() && t2.getText().equals("accountant") && t1.getText().equals("accountant")){
            Accountant accountant = new Accountant();
            accountant.show();
            System.out.println("ok");
            this.setVisible(false);


        }
        if (e.getSource() == b1 && c3.isSelected() && t2.getText().equals("receptionist") && t1.getText().equals("receptionist")){
            Receptionist receptionist = new Receptionist();
            receptionist.setVisible(true);
            receptionist.setResizable(false);
            System.out.println("ok");
            this.setVisible(false);


        }

    }
}

