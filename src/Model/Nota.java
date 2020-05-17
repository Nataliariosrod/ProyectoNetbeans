/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Nata
 */
public class Nota {
    
    /**
     * Atributos
     */
   private int idNota;
   private String tema;

   /**
    * Constructor con parametros
    * @param idNota
    * @param tema 
    */
    public Nota(int idNota, String tema) {
        this.idNota = idNota;
        this.tema = tema;
    }

    /**
     * Getters y setters
     * @return 
     */
    public int getIdNota() {
        return idNota;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}
