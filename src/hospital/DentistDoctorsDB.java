/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author EGYPT-LAPTOP
 */
public class DentistDoctorsDB {
        DataBase dataBase = new DataBase();
    Connection connection = null;

    private String query;
    static String name;
    static String age,phone,dentistDoctors,numberOfexamines,number,price;
    private Statement statement = null;
    private ResultSet r =null;
    private String sear;
   

    public DentistDoctorsDB() {
    }

    public DentistDoctorsDB(String query, String name, String age, String phone, String dentistDoctors, String numberOfexamines, String number, String price, String sear) {
        this.query = query;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.dentistDoctors = dentistDoctors;
        this.numberOfexamines = numberOfexamines;
        this.number = number;
        this.price = price;
        this.sear = sear;
    }
    
    public void insert(String name,String age,String phone,String dentistDoctors,String numberOfexamines,String number,String price){
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.dentistDoctors = dentistDoctors;
        this.numberOfexamines = numberOfexamines;
        this.number = number;
        this.price = price;
     
        try {
            connection = dataBase.conn();
            statement = connection.createStatement();
            query = "INSERT INTO dentist (name,age,phone,dentistDoctor,numberOfExamine,number"
                    + ",price)  VALUES ('"+name+"','"+age+"','"+phone+"','"+dentistDoctors+"','"+numberOfexamines+"','"+number+"','"+price+"' )";
            statement.executeUpdate(query);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void update(String sear,String name,String age,String phone,String dentistDoctors,String numberOfexamines,String number,String price){
        this.sear = sear;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.dentistDoctors = dentistDoctors;
        this.numberOfexamines = numberOfexamines;
        this.number = number;
        this.price = price;
   

        try {
            connection = dataBase.conn();
            statement = connection.createStatement();
            query = "Update dentist set name='"+name+"'  ,age='"+age+"',phone='"+phone+"'" +
                    ",dentistDoctor='"+dentistDoctors+"',numberOfExamine='"+numberOfexamines+"',number='"+number+"'" +
                    ",price='"+price+"' where name='"+sear+"' ";
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Data Is Updated","UPDATE",JOptionPane.INFORMATION_MESSAGE);

        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
   
    public void deleteItem(String name){
        this.name = name;

        try {
            connection = dataBase.conn();
            statement = connection.createStatement();
            query = "delete from dentist where name = '"+name+"'";
            statement.execute(query);
            JOptionPane.showMessageDialog(null,"Data Is Deleted","Data Deleted",JOptionPane.INFORMATION_MESSAGE);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
    }
       
    public void deletAll(){
        try {
            connection = dataBase.conn();
            Statement statement = connection.createStatement();
            query ="delete from dentist";
            statement.execute(query);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);

        }
    }
    
        public ResultSet showData(){
        ResultSet r = null;
        try {
            connection = dataBase.conn();
            statement = connection.createStatement();
            query = "select * from dentist";
            r =statement.executeQuery(query);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return r;
    }
        
            public ResultSet search(String name){
        this.name = name;
        ResultSet r = null;
        try {
            connection = dataBase.conn();
            statement = connection.createStatement();
            query = "select * from dentist where name ='"+name+"'";
            r =statement.executeQuery(query);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return r;

    }
}
