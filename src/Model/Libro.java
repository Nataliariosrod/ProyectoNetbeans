/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Natalia
 */
public class Libro {
    
    /**
     * Atributos
     */
     private int idLibro;
    private String ISBN;
    private String titulo;
    private String autor;
    private String editorial;
    private int pageNumber;
    private int year;


    /**
     * Constructor vacio
     */
    public Libro() {
        this.idLibro = 0;
        this.ISBN = "";
        this.titulo = "";
        this.autor = "";
        this.editorial = "";
        this.pageNumber = 0;
        this.year = 0000;

    }

    /**
     * Constructor con parametros
     * @param id
     * @param ISBN
     * @param titulo
     * @param autor
     * @param editorial
     * @param pageNumber
     * @param year 
     */
    public Libro(int id , String ISBN, String titulo, String autor, String editorial, int pageNumber, int year) {
        this.idLibro = id;
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.year = year;
        this.editorial = editorial;
        this.pageNumber = pageNumber;

    }

    //Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }
}
