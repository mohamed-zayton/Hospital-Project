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

public class Manger extends JFrame {

    private JPanel p1 ;

    public Manger(){
        this.setTitle("Wlcome Manger");
        this.setSize(450,450);
        this.setLocation(500,120);
        this.setVisible(true);
        this.setResizable(false);

        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.cyan);
        this.add(p1);
    }
}
