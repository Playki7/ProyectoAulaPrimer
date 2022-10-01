/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author USUARIO
 */
public class RegistroUsuario {
    
    
    private int IdUsuario;
    private String Nombre;
    private String Apellido;
    private String Dirrecion;
    private int Telefono;    

    public RegistroUsuario() {
    }

    public RegistroUsuario(int IdUsuario, String Nombre, String Apellido, String Dirrecion, int Telefono) {
        this.IdUsuario = IdUsuario;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Dirrecion = Dirrecion;
        this.Telefono = Telefono;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDirrecion() {
        return Dirrecion;
    }

    public void setDirrecion(String Dirrecion) {
        this.Dirrecion = Dirrecion;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }
    
    public void RegistrarUsuario(){
        
        
    }
    
}
