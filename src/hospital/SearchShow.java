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

public class SearchShow extends  DeleteFrame implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        Doctor doctor = new Doctor();
        if (e.getSource() == b2){
            ShowDataFrame showDataFrame = new ShowDataFrame();
            this.setVisible(false);
        }
                if (e.getSource() == b1){
            String name = t0.getText();


            try{
                ResultSet r = doctor.search(name);
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
    }
}