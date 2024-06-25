
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javadb.conexion;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carolina Colunga
 */
public class libro_code {
    String isbn, edicion, editorial, idioma, encuadernacion, nombre;
     int paginas, disponibilidad;
    public libro_code(){};

    libro_code(String text, String text0, String text1, String text2, String text3, String text4, String text5, String text6) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
     
    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getEncuadernacion() {
        return encuadernacion;
    }

    public void setEncuadernacion(String encuadernacion) {
        this.encuadernacion = encuadernacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    public void agregarlibro(){
        Statement st;
        ResultSet rs;
        try{
             conexion c = new conexion();
            //Connection con = getConnection();
            st = c.conn.createStatement();
            PreparedStatement parametro;
            String query = "INSERT INTO libro(ISBN, paginas, edicion, editorial, idioma, encuadernacion, disponibilidad, nombre) VALUES (?,?,?,?,?,?,?,?)";
            
            parametro = c.conn.prepareStatement(query);
            parametro.setString(1, getIsbn());
            parametro.setInt(2, getPaginas());
            parametro.setString(3, getEdicion());
            parametro.setString(4, getEditorial());
            parametro.setString(5, getIdioma());
            parametro.setString(6, getEncuadernacion());
            parametro.setInt(7, getDisponibilidad());
            parametro.setString(8, getNombre());
            
            int execute = parametro.executeUpdate();
            JOptionPane.showMessageDialog(null, Integer.toString(execute)+ "Registro exitoso","Agegar",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            System.out.println("Error en la conexion"+e);
        }
    }
    public DefaultTableModel leer(){
        DefaultTableModel tabla = new DefaultTableModel();
        conexion c = new conexion();
        Statement st;
        ResultSet rs;
        try {
            st = c.conn.createStatement();
            rs = st.executeQuery("select * from libro");
            Connection con = getConnection();
            String query;
            query = "Select ISBN, paginas, edicion, editorial, idioma, encuadernacion, disponibilidad, nombre";
            ResultSet consulta = st.executeQuery(query);
            
            String encabezado[]={"ISBN","Paginas","Edición","Editorial","Idioma","Encuadernación","Disponibilidad","Nombre"};
            tabla.setColumnIdentifiers(encabezado);
            
            String datos[] = new String[8];
            
            while(consulta.next()){
                datos[0] = consulta.getString("ISBN");
                datos[1] = consulta.getString("paginas");
                datos[2] = consulta.getString("edicion");
                datos[3] = consulta.getString("editorial");
                datos[4] = consulta.getString("idioma");
                datos[5] = consulta.getString("encuadernacion");
                datos[6] = consulta.getString("disponibilidad");
                datos[7] = consulta.getString("nombre");
                tabla.addRow(datos);
            }  
        } catch (Exception ex) {
            Logger.getLogger(libro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tabla;
        }

    private String getEditorial() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
