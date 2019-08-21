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
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OtherEmployee extends  Employee {

        private String query;
        private DataBase dataBase = new DataBase();
        private Connection connection = null;
        private Statement statement = null;
        private ResultSet r =null;
    private String sear;

        public OtherEmployee() {
        }

        public OtherEmployee(int id, String name, String address, String phone, String department, String brithDay, String currentMonth, String getHisMoney, double salery, double bonus, double totalSalery) {
            super( name, address, phone, department, brithDay, currentMonth, getHisMoney, salery, bonus, totalSalery);
        }

        public void insert(String name, String address, String phone, String department, String brithDay, String currentMonth, String getHisMoney, double salery, double bonus){
            this.name = name;
            this.address = address;
            this.phone = phone;
            this.department = department;
            this.brithDay = brithDay;
            this.currentMonth = currentMonth;
            this.getHisMoney = getHisMoney;
            this.salery = salery;
            this.bonus = bonus;
            double total = salery+bonus;
            String sale_String,bonusString;
            sale_String = Double.toString(salery);
            bonusString = Double.toString(bonus);
            String totalToString = Double.toString(total);

            try {
                connection = dataBase.conn();
                Statement statement = connection.createStatement();

                query = "INSERT INTO otherEmployee (name,addres,phone,department,birthDay,currentMonth" +
                        ",getSalery,salery,bonus,totalSalery) VALUES ('"+name+"','"+address+"','"+phone+"'," +
                        "'"+department+"','"+brithDay+"','"+currentMonth+"','"+getHisMoney+"'," +
                        "'"+sale_String+"','"+bonusString+"','"+totalToString+"')";
                statement.executeUpdate(query);

            }catch (Exception e){
                JOptionPane.showMessageDialog(null,e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }


        public void deleteItem(String name){
            this.name = name;

            try {
                connection = dataBase.conn();
                statement = connection.createStatement();
                query = "delete from otherEmployee where name = '"+name+"'";
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
                query ="delete from otherEmployee";
                statement.execute(query);
            }catch (Exception e){
                JOptionPane.showMessageDialog(null,e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);

            }
        }

        public void update(String sear,String name, String address, String phone, String department, String brithDay, String currentMonth, String getHisMoney, double salery, double bonus){
            this.sear= sear;
            this.name = name;
            this.address = address;
            this.phone = phone;
            this.department = department;
            this.brithDay = brithDay;
            this.currentMonth = currentMonth;
            this.getHisMoney = getHisMoney;
            this.salery = salery;
            this.bonus = bonus;
            double total = salery+bonus;
            String sale_String,bonusString;
            sale_String = Double.toString(salery);
            bonusString = Double.toString(bonus);
            String totalToString = Double.toString(total);

            try {
                connection = dataBase.conn();
                statement = connection.createStatement();
                query = "UPDATE otherEmployee set name='"+name+"',addres='"+address+"',phone='"+phone+"'" +
                        ",department='"+department+"',birthDay='"+brithDay+"',currentMonth='"+currentMonth+"'" +
                        ",getSalery='"+getHisMoney+"',salery='"+sale_String+"',bonus='"+bonusString+"'" +
                        ",totalSalery='"+totalToString+"' where name='"+sear+"'";
                statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Data Is Updated","UPDATE",JOptionPane.INFORMATION_MESSAGE);

            }catch (Exception e){
                JOptionPane.showMessageDialog(null,e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
                System.out.println(e.getMessage());
            }
        }


        public ResultSet showData(){
            ResultSet r = null;
            try {
                connection = dataBase.conn();
                statement = connection.createStatement();
                query = "select * from otherEmployee";
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
                query = "select * from otherEmployee where name ='"+name+"'";
                r =statement.executeQuery(query);
            }catch (Exception e){
                JOptionPane.showMessageDialog(null,e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
            }
            return r;

        }

    }

