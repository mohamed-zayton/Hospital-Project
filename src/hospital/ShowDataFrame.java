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
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class ShowDataFrame extends JFrame implements ActionListener {


    private JPanel p1;
    private String query;
    private JButton b1,b2,b3,b4,b5,b6;
    private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    private JTable table;
    private JScrollPane jScrollPane;
    DataBase dataBase = new DataBase();
    DefaultTableModel t =new  DefaultTableModel();
    Doctor doctor = new Doctor();




    public ShowDataFrame(){
        this.setTitle("ShowAll Data");
        this.setSize(1600,1600);
        this.setVisible(true);


        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.yellow);
        b1 = new JButton("Insert Data");
        b2 = new JButton("Update Data");
        b3 = new JButton("Delete Data");
        b4 = new JButton("Search For Data");
        b5 = new JButton("Back");
        b6 = new JButton("Delete All");

        l1 = new JLabel("ALL DATA");
        l2 = new JLabel("Name");
        l3 = new JLabel("Addres");
        l4 = new JLabel("Phone");
        l5 = new JLabel("Department");
        l6 = new JLabel("Birt Day");
        l7 = new JLabel("Current Month");
        l8 = new JLabel("Get His Salery");
        l9 = new JLabel("Salery");
        l10 = new JLabel("Bonus");
        l11 = new JLabel("Total Salery");
        
        table = new JTable();
        jScrollPane = new JScrollPane();
        jScrollPane.add(table);
        l1.setBounds(10,40,150,25);
        l1.setForeground(Color.DARK_GRAY);
        l1.setFont(new Font("font",Font.BOLD,20));
        b1.setBounds(1,0,150,35);
        b2.setBounds(152,0,150,35);
        b3.setBounds(303,0,150,35);
        b4.setBounds(454,0,150,35);
        b5.setBounds(1460,0,70,20);
        b6.setBounds(605,0,150,35);

        l2.setBounds(10,60,150,40);
        l3.setBounds(160,60,150,40);
        l4.setBounds(310,60,150,40);
        l5.setBounds(460,60,150,40);
        l6.setBounds(610,60,150,40);
        l7.setBounds(760,60,150,40);
        l8.setBounds(910,60,150,40);
        l9.setBounds(1060,60,150,40);
        l10.setBounds(1210,60,150,40);
        l11.setBounds(1365,60,150,40);

        table.setBounds(10,90,this.getWidth()-45,this.getHeight()-200);
        table.setBackground(Color.gray);
        table.setForeground(Color.yellow);
        table.setFont(new Font("font",Font.ITALIC,12));
        b1.setBackground(Color.gray);
        b1.setForeground(Color.yellow);
        b2.setBackground(Color.gray);
        b2.setForeground(Color.yellow);
        b3.setBackground(Color.gray);
        b3.setForeground(Color.yellow);
        b4.setBackground(Color.gray);
        b4.setForeground(Color.yellow);
        b5.setBackground(Color.GRAY);
        b5.setForeground(Color.yellow);
        b6.setBackground(Color.gray);
        b6.setForeground(Color.yellow);
        l2.setBackground(Color.cyan);
        l2.setForeground(Color.gray);
        l2.setFont(new Font("font",Font.BOLD,15));
        l3.setBackground(Color.RED);
        l3.setForeground(Color.gray);
        l3.setFont(new Font("font",Font.BOLD,15));
        l4.setBackground(Color.RED);
        l4.setForeground(Color.gray);
        l4.setFont(new Font("font",Font.BOLD,15));
        l5.setBackground(Color.RED);
        l5.setForeground(Color.gray);
        l5.setFont(new Font("font",Font.BOLD,15));
        l6.setBackground(Color.RED);
        l6.setForeground(Color.gray);
        l6.setFont(new Font("font",Font.BOLD,15));
        l7.setBackground(Color.RED);
        l7.setForeground(Color.gray);
        l7.setFont(new Font("font",Font.BOLD,15));
        l8.setBackground(Color.RED);
        l8.setForeground(Color.gray);
        l8.setFont(new Font("font",Font.BOLD,15));
        l9.setBackground(Color.RED);
        l9.setForeground(Color.gray);
        l9.setFont(new Font("font",Font.BOLD,15));
        l10.setBackground(Color.RED);
        l10.setForeground(Color.gray);
        l10.setFont(new Font("font",Font.BOLD,15));
        l11.setBackground(Color.RED);
        l11.setForeground(Color.gray);
        l11.setFont(new Font("font",Font.BOLD,15));
        table.disable();
        table.setGridColor(new Color(255,255,255));
        this.add(p1);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        p1.add(b6);

        p1.add(l1);
        p1.add(table);
        p1.add(l2);
        p1.add(l3);
        p1.add(l4);
        p1.add(l5);
        p1.add(l6);
        p1.add(l7);
        p1.add(l8);
        p1.add(l9);
        p1.add(l10);
        p1.add(l11);

        //this.add(jScrollPane);
        //p1.add(jScrollPane);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);




        //Object[] col = {"name","addres"};
        //t.setColumnIdentifiers(col);
        table.setRowHeight(20);
        table.setSelectionBackground(Color.orange);





        ResultSet resultSet = doctor.showData();

        try {
            table.setModel(t);

            t.addColumn("Name");
            t.addColumn("Phone");
            t.addColumn("name");
            t.addColumn("name");
            t.addColumn("name");
            t.addColumn("name");
            t.addColumn("name");
            t.addColumn("name");
            t.addColumn("name");
            t.addColumn("name");
            while (resultSet.next()) {
                t.addRow(new Object[] {resultSet.getString("name"),
                resultSet.getString("addres"),
                resultSet.getString("phone"),
                resultSet.getString("department"),
                resultSet.getString("birthDay"),
                resultSet.getString("currentMonth"),
                resultSet.getString("getSalery"),
                resultSet.getString("salery"),
                resultSet.getString("bonus"),
                resultSet.getString("totalSalery")});
             }
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ( e.getSource() == b1){
            InsertFromShow insertFromShow = new InsertFromShow();
            this.setVisible(false);

        }
        if (e.getSource() == b2) {
            UpdateShow updateShow = new UpdateShow();
            this.setVisible(false);
        }
        if (e.getSource() == b3) {
            DeleteShow deleteShow = new DeleteShow();
            this.setVisible(false);

        }
        if (e.getSource() == b4) {
            SearchShow searchShow = new SearchShow();
            this.setVisible(false);

        }

        if (e.getSource() == b5){
                DoctorFrame doctorFrame = new DoctorFrame();
                this.setVisible(false);
        }
        if ( e.getSource() == b6){
            doctor.deletAll();
            DoctorFrame doctorFrame = new DoctorFrame();
            this.setVisible(false);
        }
    }
}
