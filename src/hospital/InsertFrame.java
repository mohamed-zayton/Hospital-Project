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
import java.awt.event.*;
import java.sql.SQLException;

public class InsertFrame extends JFrame implements ActionListener{
    String[] month ={"Jan","Feb","Mar","Apr","May","June","July","Aug","Sep","Oct","Nov","Dec"};
    String[] getSalery = {"YES","NO"};
    JPanel p1;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JButton b1,b2;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JComboBox cb1,cb2;

    public  InsertFrame(){
        this.setTitle("Insert Data");
        this.setSize(500,550);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocation(450,120);
        p1 = new  JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.yellow);

        l1 = new JLabel("Name");
        l2 = new JLabel("Addres");
        l3 = new JLabel("Phone");
        l4 = new JLabel("Department");
        l5 = new JLabel("Birth Day");
        l6 = new JLabel("Current Month");
        l7 = new JLabel("Get his Salery");
        l8 = new JLabel("Salery");
        l9 = new JLabel("Bonus");

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        t5 = new JTextField();
        t6 = new JTextField();
        t7 = new JTextField();
        cb1 = new JComboBox(month);
        cb2 = new JComboBox(getSalery);
        b1 = new  JButton("Insert Data");
        b2 = new  JButton("Back");

        l1.setBounds(10,30,100,30);
        l2.setBounds(10,70,100,30);
        l3.setBounds(10,110,100,30);
        l4.setBounds(10,150,100,30);
        l5.setBounds(10,190,100,30);
        l6.setBounds(10,230,150,30);
        l7.setBounds(10,270,150,30);
        l8.setBounds(10,310,100,30);
        l9.setBounds(10,350,100,30);
        t1.setBounds(110,35,350,25);
        t2.setBounds(110,75,350,25);
        t3.setBounds(110,115,350,25);
        t4.setBounds(110,155,350,25);
        t5.setBounds(110,195,350,25);
        t6.setBounds(110,315,350,25);
        t7.setBounds(110,355,350,25);

        cb1.setBounds(110,235,350,25);
        cb2.setBounds(110,275,350,25);

        b1.setBounds(130,400,200,35);
        b2.setBounds(this.getWidth()-94,this.getHeight()-67,80,30);


        l1.setForeground(Color.DARK_GRAY);
        l1.setFont(new Font("font",Font.BOLD,14));
        l2.setForeground(Color.DARK_GRAY);
        l2.setFont(new Font("font",Font.BOLD,14));
        l3.setForeground(Color.DARK_GRAY);
        l3.setFont(new Font("font",Font.BOLD,14));
        l4.setForeground(Color.DARK_GRAY);
        l4.setFont(new Font("font",Font.BOLD,14));
        l5.setForeground(Color.DARK_GRAY);
        l5.setFont(new Font("font",Font.BOLD,14));
        l6.setForeground(Color.DARK_GRAY);
        l6.setFont(new Font("font",Font.BOLD,14));
        l7.setForeground(Color.DARK_GRAY);
        l7.setFont(new Font("font",Font.BOLD,14));
        l8.setForeground(Color.DARK_GRAY);
        l8.setFont(new Font("font",Font.BOLD,15));
        l9.setForeground(Color.DARK_GRAY);
        l9.setFont(new Font("font",Font.BOLD,15));
        t1.setBackground(Color.gray);
        t1.setForeground(Color.yellow);
        t2.setBackground(Color.gray);
        t2.setForeground(Color.yellow);
        t3.setBackground(Color.gray);
        t3.setForeground(Color.yellow);
        t4.setBackground(Color.gray);
        t4.setForeground(Color.yellow);
        t5.setBackground(Color.gray);
        t5.setForeground(Color.yellow);
        t6.setBackground(Color.gray);
        t6.setForeground(Color.yellow);
        t7.setBackground(Color.gray);
        t7.setForeground(Color.yellow);
        cb1.setBackground(Color.gray);
        cb1.setForeground(Color.yellow);
        cb2.setBackground(Color.gray);
        cb2.setForeground(Color.yellow);
        t1.setFont(new Font("font",Font.BOLD,15));
        t2.setFont(new Font("font",Font.BOLD,15));
        t3.setFont(new Font("font",Font.BOLD,15));
        t4.setFont(new Font("font",Font.BOLD,15));
        t5.setFont(new Font("font",Font.BOLD,15));
        t6.setFont(new Font("font",Font.BOLD,15));
        t7.setFont(new Font("font",Font.BOLD,15));
        cb1.setFont(new Font("font",Font.BOLD,15));
        cb2.setFont(new Font("font",Font.BOLD,15));
        b1.setFont(new Font("font",Font.BOLD,25));
        b1.setBackground(Color.DARK_GRAY);
        b1.setForeground(Color.white);
        b2.setFont(new Font("font",Font.BOLD,15));
        b2.setBackground(Color.yellow);
        b2.setForeground(Color.gray);



        this.add(p1);
        p1.add(l1);
        p1.add(l2);
        p1.add(l3);
        p1.add(l4);
        p1.add(l5);
        p1.add(l6);
        p1.add(l7);
        p1.add(l8);
        p1.add(l9);
        p1.add(t1);
        p1.add(t2);
        p1.add(t3);
        p1.add(t4);
        p1.add(t5);
        p1.add(t6);
        p1.add(t7);
        p1.add(cb1);
        p1.add(cb2);
        p1.add(b1);
        p1.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1){
            Doctor doctor = new Doctor();
            if (t6.getText().equals("") || t7.getText().equals("")){
                JOptionPane.showMessageDialog(null,"insert number in salery and bonus","Error",JOptionPane.ERROR_MESSAGE);

            }
            String name = t1.getText();
            String addres = t2.getText();
            String phone = t3.getText();
            String department = t4.getText();
            String birthDay = t5.getText();
            String salery = t6.getText();
            String bonus = t7.getText();
            double saleryDouble = Double.parseDouble(salery);
            double bonusDouble = Double.parseDouble(bonus);
            String currentMonth = (String) cb1.getSelectedItem();
            String getSalery = (String) cb1.getSelectedItem();


            try{
                doctor.insert(name,addres,phone,department,birthDay,currentMonth,getSalery,saleryDouble,bonusDouble);
                 t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
                t6.setText("");
                t7.setText("");


            }catch (Exception ex){
                JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);

            }


        }
        if (e.getSource() == b2){
            DoctorFrame doctor = new DoctorFrame();
            this.setVisible(false);

        }
    }


}

