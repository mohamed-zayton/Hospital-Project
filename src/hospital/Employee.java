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
import java.sql.*;



public  class Employee {
   protected int id;
   protected String name , address, phone, department ,brithDay ,currentMonth , getHisMoney ;
   protected double salery , bonus, totalSalery;


    public  Employee(){

    }

    public Employee( String name, String address, String phone, String department, String brithDay, String currentMonth, String getHisMoney, double salery, double bonus, double totalSalery) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.department = department;
        this.brithDay = brithDay;
        this.currentMonth = currentMonth;
        this.getHisMoney = getHisMoney;
        this.salery = salery;
        this.bonus = bonus;
        this.totalSalery = totalSalery;
    }


    public double earning(double salery, double bonus){
        return this.salery + this.bonus;
    }
}
