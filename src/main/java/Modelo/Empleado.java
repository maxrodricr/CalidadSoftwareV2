/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author luis_
 */
public class Empleado {
    int idEmpleado;
    String cedula;
    String nombreEmpleado;
    int telefono;
    String estado;
    String usuario;
    String pass;

    public Empleado() {
    }

    public Empleado(int idEmpleado, String cedula, String nombreEmpleado, int telefono, String estado, String usuario, String pass) {
        this.idEmpleado = idEmpleado;
        this.cedula = cedula;
        this.nombreEmpleado = nombreEmpleado;
        this.telefono = telefono;
        this.estado = estado;
        this.usuario = usuario;
        this.pass = pass;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", cedula=" + cedula + ", nombreEmpleado=" + nombreEmpleado + ", telefono=" + telefono + ", estado=" + estado + ", usuario=" + usuario + ", pass=" + pass + '}';
    }
          
}
