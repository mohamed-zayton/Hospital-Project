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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JOptionPane;



public class UpdateOtherEmployeeShow extends UpdateNurseFrame  implements ActionListener {
    public void actionPerformed(ActionEvent e) {
                OtherEmployee otherEmployee = new OtherEmployee();

        if (e.getSource() == b3){
            String name = t0.getText();

            try{
                ResultSet r = otherEmployee.search(name);
                if (r.next()){
                    t1.setText(r.getString("name"));
                    t2.setText(r.getString("addres"));
                    t3.setText(r.getString("phone"));
                    t4.setText(r.getString("department"));
                    t5.setText(r.getString("birthDay"));
                    t6.setText(r.getString("salery"));
                    t7.setText(r.getString("bonus"));
                    for (int i =0 ; i <month.length ; i++){
                        if (r.getString("currentMonth").equals(month[i])){
                            cb1.setSelectedIndex(i);
                        }
                    }
                    for (int i =0 ; i <getSalery.length ; i++){
                        if (r.getString("getSalery").equals(getSalery[i])){
                            cb2.setSelectedIndex(i);
                        }
                    }


                }
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);

            }

        }
        if (e.getSource() == b2){
            ShowDataEmployeeFrame showDataEmployeeFrame = new ShowDataEmployeeFrame();
            this.setVisible(false);
        }
  

        if (e.getSource() == b1){
            String sear = t0.getText();
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
                otherEmployee.update(sear,name,addres,phone,department,birthDay,currentMonth,getSalery,saleryDouble,bonusDouble);



            }catch (Exception ex){
                JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);

            }
        }
    }
}

