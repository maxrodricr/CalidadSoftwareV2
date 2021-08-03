/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author luis_
 */
public class EmpleadoDAO {
    Conexion cn = new Conexion(); 
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public Empleado validar(String user,String pass){
        Empleado em = new Empleado();
        String query ="SELECT * FROM empleados WHERE userEmpleado=? and passEmpleado=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs=ps.executeQuery();
            while(rs.next()){
                em.setIdEmpleado(rs.getInt(1));
                em.setCedula(rs.getString(2));
                em.setNombreEmpleado(rs.getString(3));
                em.setTelefono(rs.getInt(4));
                em.setEstado(rs.getString(5));
                em.setUsuario(rs.getString(6));
                em.setPass(rs.getString(7));
             
            }
        } catch (Exception e) {
        }
        
        return em;
    }
}
