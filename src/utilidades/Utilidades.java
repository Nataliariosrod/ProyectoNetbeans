/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author Natalia 
 */
public class Utilidades {
/**
 * Metodo para convertir un String a int  
 * @param number String
 * @return result int
 */
           
    public static int validaInt(String number){
    int result = 0; //Valor default.
    try{
        if((number != null)){
            result = Integer.parseInt(number);
        }
    }catch(NumberFormatException nfe){
        //*No es numerico!
    }
    return result;
}
    
/**
 * Metodo para validar fecha   
 * @param numero
 * @return fecha
 */
    public static boolean validaFecha (int numero) {
    	LocalDate date = LocalDate.now();
    	int anio = date.getYear();
        if (numero <= anio) {
            return true;
        }else{
            return false;           
        }  
    }
/**
 * Metodo para validar un String sin numeros   
 * @param cadena
 * @return cadena
 */
    
    public static boolean validaString(String string){
        return !string.matches(".*\\d+.*");
    }
    
    /**
     * Metodo para validar si el año no tiene mas de 4 numeros
     * @param string
     * @return 
     */
    public static boolean validaAnio2(String string){
        //meter que no pueda ser el año menor
         return string.matches("\\d{4}");
         //Integer.valueOf("string");
      
        
    }
    
    
}
