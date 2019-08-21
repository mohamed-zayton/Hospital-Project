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


public class InsertFromShow extends InsertFrame implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b2){
            ShowDataFrame showDataFrame = new ShowDataFrame();
            this.setVisible(false);
        }
        if (e.getSource() == b1) {
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
    }
}
