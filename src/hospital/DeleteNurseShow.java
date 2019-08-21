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

public class DeleteNurseShow extends DeleteNurseFram implements ActionListener {
    public void actionPerformed(ActionEvent e) {
              Nurse nurse = new Nurse();


        if (e.getSource() == b3){
            String name = t0.getText();

            try{
                ResultSet r = nurse.search(name);
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
            ShowNurseData showNurseData = new ShowNurseData();
            this.setVisible(false);
        }
                if (e.getSource() == b1){
            String name = t1.getText();
            nurse.deleteItem(name);
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
            t7.setText("");
            t8.setText("");

        }
    }
}
