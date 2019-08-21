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
import java.sql.*;

public class DataBase {
    private final String Driver = "com.mysql.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost/hospital";
    private final String USER = "root";
    private final String PASSWORD = "vgim859&";
    public Connection conn() throws Exception {
        return DriverManager.getConnection(URL,USER,PASSWORD);
    }
    

}
    

