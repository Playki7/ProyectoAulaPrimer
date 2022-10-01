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
public class RegistroLibro {
    
    private int IdLibro;
    private String Titulo;
    private int fechaPublic;
    private String Autor;
    private String Categoria;
    private int  Edicion;
    private String Idioma;
    private int cantPaginas;
    private String Descripcion;    

    public RegistroLibro() {
    }

    public RegistroLibro(int IdLibro, String Titulo, int fechaPublic, String Autor, String Categoria, int Edicion, String Idioma, int cantPaginas, String Descripcion) {
        this.IdLibro = IdLibro;
        this.Titulo = Titulo;
        this.fechaPublic = fechaPublic;
        this.Autor = Autor;
        this.Categoria = Categoria;
        this.Edicion = Edicion;
        this.Idioma = Idioma;
        this.cantPaginas = cantPaginas;
        this.Descripcion = Descripcion;
    }

    public int getIdLibro() {
        return IdLibro;
    }

    public void setIdLibro(int IdLibro) {
        this.IdLibro = IdLibro;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getFechaPublic() {
        return fechaPublic;
    }

    public void setFechaPublic(int fechaPublic) {
        this.fechaPublic = fechaPublic;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public int getEdicion() {
        return Edicion;
    }

    public void setEdicion(int Edicion) {
        this.Edicion = Edicion;
    }

    public String getIdioma() {
        return Idioma;
    }

    public void setIdioma(String Idioma) {
        this.Idioma = Idioma;
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    
    public void RegistrarLibro(){
        
        
    }
    
    
    
}
