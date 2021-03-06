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
public class Articulo {
    
    /**
     * Atributos de la clase
     */
    private int idArticulo;
    private String ISSN;
    private String titulo;
    private String autor;
    private String nombreRevista;
    private int mes;
    private int year;
    private int paginaInicio;
    private int paginaFin;

    /**
    * Constructor vacio
    */
    public Articulo (){
        this.idArticulo = 0;
        this.ISSN = "";
        this.titulo = "";
        this.autor = "";
        this.nombreRevista = "";
        this.mes = 0;
        this.year = 0;
        this.paginaInicio = 0;
        this.paginaFin = 0;
    }

    /**
     * Constructor con atributos
     * @param idArticulo
     * @param titulo
     * @param autor
     * @param nombreRevista 
     */
    public Articulo(int idArticulo, String titulo, String autor, String nombreRevista){
        this.idArticulo = idArticulo;
        this.titulo = titulo;
        this.autor = autor;
        this.nombreRevista = nombreRevista;
    }

    /**
     * Constructor con todos los atributos
     * @param id
     * @param ISSN
     * @param titulo
     * @param autor
     * @param nombreRevista
     * @param mes
     * @param year
     * @param paginaIni
     * @param paginaF 
     */
    public Articulo (int id, String ISSN, String titulo, String autor, String nombreRevista, int mes, int year , int paginaIni, int paginaF) {
        this.idArticulo = id;
        this.ISSN = ISSN;
        this.titulo = titulo;
        this.autor = autor;
        this.nombreRevista = nombreRevista;
        this.mes = mes;
        this.year = year;
        this.paginaInicio = paginaIni;
        this.paginaFin = paginaF;

    }

    /**
     * Getters y setters
     */
    public int getIdArticulo() {
        return idArticulo;
    }

    public String getISSN() {
        return ISSN;
    }

    public void setISSN(String ISSN) {
        this.ISSN = ISSN;
    }

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

    public String getNombreRevista() {
        return nombreRevista;
    }

    public void setNombreRevista(String nombreRevista) {
        this.nombreRevista = nombreRevista;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPaginaInicio() {
        return paginaInicio;
    }

    public void setPaginaInicio(int paginaInicio) {
        this.paginaInicio = paginaInicio;
    }

    public int getPaginaFin() {
        return paginaFin;
    }

    public void setPaginaFin(int paginaFin) {
        this.paginaFin = paginaFin;
    }

    
}
