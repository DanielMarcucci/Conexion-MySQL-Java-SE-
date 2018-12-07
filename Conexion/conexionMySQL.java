/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Daniel Marcucci
 */
public class conexionMySQL {
    private String ip = "jdbc:mysql://localhost/";
    private String usuario = "root";
    private String contraseña = "posServ@dm!n";
    private String baseDeDatos = "posumg";
    private Connection cn = null;

    public conexionMySQL() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(this.ip+this.baseDeDatos,this.usuario,this.contraseña);
            if(cn != null){
                System.out.println("Conexion exitosa");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            showMessageDialog(null, "No se pudo establecer la conexión con la Base de Datos.\nError: "+ex, "Error de Conexión", WARNING_MESSAGE);
        }
    }
    
    public Connection abrirCn(){
        return cn;
    }
    
    public void cerrarCn() {
        try {
            if (cn != null || !cn.isClosed()) {
                cn.close();
                System.gc();
                System.out.println("Conexión cerrada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error al cerrar la Base de Datos", JOptionPane.ERROR_MESSAGE);
        }

    }
}
