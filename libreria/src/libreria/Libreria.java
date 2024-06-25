/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Carolina Colunga
 */
public class Libreria {

    public static void main(String[] args) {
     
    }
    public static Connection getConnection(){
	try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/libreria";
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
        /*public Connection conexionBD;
    public String db = "libreria";
    public String url = String.format("jdbc:mysql://localhost:3306/%s",db);
    public String username = "root";
    public String password = "berries";
    public String jdbc = "com.mysql.cj.jdbc.Driver";
    
    public void getConnection(){
	try {
            Class.forName(jdbc);
            conexionBD = DriverManager.getConnection(url, username, password);
            JOptionPane.showMessageDialog(null,"Connected","Exito",JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Connected");
	} catch(Exception e) {System.out.println(e);}
    }
    public void closeConnection(){
        try{
            conexionBD.close();
        } catch(Exception e) {System.out.println(e);}
    }*/
}
