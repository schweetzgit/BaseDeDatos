/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Carolina Colunga
 */
public class Bookstore {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
     
    }
    public static Connection getConnection(){
	try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/book";
            String username = "root";
            String password = "berries";
            
            Class.forName(driver);		
            Connection conn = DriverManager.getConnection(url,username,password);
            //JOptionPane.showMessageDialog(null,"Conectado a la base de datos");
            System.out.println("Connected");
            return conn;
	} catch(HeadlessException | ClassNotFoundException | SQLException e) {System.out.println(e);}
	return null;
    }
    
}
