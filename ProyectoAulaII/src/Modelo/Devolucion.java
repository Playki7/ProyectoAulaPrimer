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
public class Devolucion {
    
    private int Folio;
    private int IDLibro;

    public Devolucion() {
    }

    public Devolucion(int Folio, int IDLibro) {
        this.Folio = Folio;
        this.IDLibro = IDLibro;
    }

    public int getFolio() {
        return Folio;
    }

    public void setFolio(int Folio) {
        this.Folio = Folio;
    }

    public int getIDLibro() {
        return IDLibro;
    }

    public void setIDLibro(int IDLibro) {
        this.IDLibro = IDLibro;
    }
    
    public void devolver(){
        
        
    }
    
}
