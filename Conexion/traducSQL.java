/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;
import java.sql.SQLException;
import java.util.List;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;

/**
 *
 * @author Daniel Marcucci
 */
public class traducSQL extends conexionMySQL {
    private final QueryRunner QR = new QueryRunner();
    private List lista;
    String[] modules;
    
    public List select(String sql, BeanListHandler blh, Object[] valores){
        try {
            lista = (List) QR.query(abrirCn(),sql,blh,valores);
        } catch (SQLException ex) {
            showMessageDialog(null, "No se realizó la consulta.\nError: "+ex, "Error de Consulta", WARNING_MESSAGE);
        }
        return lista;
    }
    
    public void insert(String sql, Object[] valores){
        try {
            QR.insert(abrirCn(),sql,new ColumnListHandler(),valores);
        } catch (SQLException ex) {
            showMessageDialog(null, "No se insertó el nuevo registro a la Base de Datos\nError: "+ex, "Error de Creación", WARNING_MESSAGE);
        }
    }
    
    public void update(String sql, Object[] valores){
        try {
            QR.update(abrirCn(),sql,valores);
        } catch (SQLException ex) {
            showMessageDialog(null, "No se actualizó el registro a la Base de Datos\nError: "+ex, "Error de Modificación", WARNING_MESSAGE);
        }
    }
    
    public void insertUpdate(String iSql, Object[] iValores, String uSql, Object[] uValores){
        try {
            QR.insert(abrirCn(),iSql,new ColumnListHandler(),iValores);
        } catch (SQLException ex) {
            update(uSql,uValores);
        }
    }
    
    public boolean delete(String sql, Object[] valores){
        try {
            QR.update(abrirCn(),sql,valores);
        } catch (SQLException ex) {
            showMessageDialog(null, "No se eliminó el registro en la Base de Datos\nError: "+ex, "Error de Eliminación", WARNING_MESSAGE);
            return false;
        }
        return true;
    }
}
