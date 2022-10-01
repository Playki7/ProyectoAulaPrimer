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
public class Biblioteca {

   private int ID;
   private int CantLibros;
   private String Nombrebiblioteca;

    public Biblioteca() {
    }

    public Biblioteca(int ID, int CantLibros, String Nombrebiblioteca) {
        this.ID = ID;
        this.CantLibros = CantLibros;
        this.Nombrebiblioteca = Nombrebiblioteca;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCantLibros() {
        return CantLibros;
    }

    public void setCantLibros(int CantLibros) {
        this.CantLibros = CantLibros;
    }

    public String getNombrebiblioteca() {
        return Nombrebiblioteca;
    }

    public void setNombrebiblioteca(String Nombrebiblioteca) {
        this.Nombrebiblioteca = Nombrebiblioteca;
    }

    @Override
    public String toString() {
        return "Biblioteca{" + "ID=" + ID + ", CantLibros=" + CantLibros + ", Nombrebiblioteca=" + Nombrebiblioteca + '}';
    }
   
   
    
}
