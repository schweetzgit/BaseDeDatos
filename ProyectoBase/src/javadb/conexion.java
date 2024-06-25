
package javadb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.mysql.cj.jdbc.Driver;
/* @author Carolina Colunga */
public class conexion {
    public static Connection getConnection(){
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/libreria";
			String username = "root";
			String password = "berries";
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url,username,password);
                        //JOptionPane.showMessageDialog(null,"Connected","Exito",JOptionPane.INFORMATION_MESSAGE);
			System.out.println("Connected");
			return conn;
		} catch(Exception e) {System.out.println(e);}
		
		return null;
	}
    /*Connection conn;
    private String host="localhost";
    private String port="3306";
    private String dbName="liberia";
    private String userName="root";
    private String password="berries";
    
    public conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://"+this.host+":"+this.port+"/"+this.dbName;
            conn = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion existosa");
            
        } catch (ClassNotFoundException|SQLException e) {
            System.out.println("Error en la conexion"+e);
        }
    }*/
}

