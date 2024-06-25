/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
/**
 *
 * @author Carolina Colunga
 */
public class Conexion {
    public Connection conexionBD;
    public String db = "libreria";
    public String url = String.format("jdbc:mysql://localhost:3306/%s",db);
    public String username = "root";
    public String password = "berries";
    public String jdbc = "com.mysql.cj.jdbc.Driver";
    
    public void openConnection(){
	try {
            Class.forName(jdbc);
            conexionBD = DriverManager.getConnection(url, username, password);
            //JOptionPane.showMessageDialog(null,"Connected","Exito",JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Connected");
	} catch(Exception e) {System.out.println(e);}
    }
    public void closeConnection(){
        try{
            conexionBD.close();
        } catch(Exception e) {System.out.println(e);}
    }

    public PreparedStatement prepareStatement(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
