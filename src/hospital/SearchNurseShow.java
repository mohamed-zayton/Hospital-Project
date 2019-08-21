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

public class SearchNurseShow extends SearchNurseFrame implements ActionListener {
    public void actionPerformed(ActionEvent e) {
              Nurse nurse = new Nurse();

        if (e.getSource() == b1){
            String name = t0.getText();
            ResultSet resultSet = nurse.search(name);

            try{
                if (resultSet.next()){
                    t1.setText(resultSet.getString("name"));
                    t2.setText(resultSet.getString("addres"));
                    t3.setText(resultSet.getString("phone"));
                    t4.setText(resultSet.getString("department"));
                    t5.setText(resultSet.getString("birthDay"));
                    t6.setText(resultSet.getString("salery"));
                    t7.setText(resultSet.getString("bonus"));
                    for (int i =0 ; i <month.length ; i++){
                        if (resultSet.getString("currentMonth").equals(month[i])){
                            cb1.setSelectedIndex(i);
                        }
                    }
                    for (int i =0 ; i <getSalery.length ; i++){
                        if (resultSet.getString("getSalery").equals(getSalery[i])){
                            cb2.setSelectedIndex(i);
                        }
                    }

                }
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
                System.out.println(ex.getMessage());
            }

        }
        if (e.getSource() == b2){
            ShowNurseData showNurseData = new ShowNurseData();
            this.setVisible(false);
        }
    }
}

