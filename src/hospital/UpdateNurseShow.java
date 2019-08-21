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
import javax.swing.JOptionPane;

public class UpdateNurseShow extends UpdateNurseFrame  implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        Nurse nurse = new Nurse();
        if (e.getSource() == b2){
            ShowNurseData showNurseData = new ShowNurseData();
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
                nurse.update(sear,name,addres,phone,department,birthDay,currentMonth,getSalery,saleryDouble,bonusDouble);

            }catch (Exception ex){
                JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);

            }
        }
    }
}

