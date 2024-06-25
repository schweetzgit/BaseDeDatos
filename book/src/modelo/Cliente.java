/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Carolina Colunga
 */
public class Cliente {
    public static Cliente obj1;
    String nombre, direccion, rfc;
    int numero, telefono;
    Conexion cn;

    public static Cliente getObj1() {
        return obj1;
    }

    public static void setObj1(Cliente obj1) {
        Cliente.obj1 = obj1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public int getNumero() {
        int min = 1, max = 1000000;
        Random random = new Random();
        numero = random.nextInt(max + min) + min;
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Conexion getCn() {
        return cn;
    }

    public void setCn(Conexion cn) {
        this.cn = cn;
    }

    
    
    public void agregar(){
        try{ 
            final int numero;
            int min = 1, max = 1000000;
            Random random = new Random();
            numero = random.nextInt(max + min) + min;
            
            PreparedStatement parametro;
            String query = "INSERT INTO cliente(numero, telefono, direccion, nombre, RFC) VALUES (?,?,?,?,?);";
            cn = new Conexion();
            cn.openConnection();
            parametro = (PreparedStatement)cn.conexionBD.prepareStatement(query);
            parametro.setInt(1, getNumero());
            parametro.setInt(2, getTelefono());
            parametro.setString(3, getDireccion());
            parametro.setString(4, getNombre());
            parametro.setString(5, getRfc());
            
            int execute = parametro.executeUpdate();
            cn.closeConnection();
            JOptionPane.showMessageDialog(null, Integer.toString(execute)+ "Registro exitoso","Agegar",JOptionPane.INFORMATION_MESSAGE);
            

            /*nombre = text_nombre.getText();
            telefono = text_telefono.getText();
            direccion = text_direccion.getText();
            rfc = text_rfc.getText()
            PreparedStatement posted = cn.prepareStatement("INSERT INTO cliente(numero, telefono, direccion, nombre, RFC) VALUES ("+numero+",'"+telefono+"','"+direccion+"','"+nombre+"','"+rfc+"')");
            posted.executeUpdate();*/
        } catch(Exception e) {System.out.println(e);}
        /*finally {
            text_numero.setText(Float.toString(numero));;
            System.out.println("Registro exitoso");
            this.hide(); 
        }*/
    }
    public void modificar(){}
    public void aliminar(){}
}
