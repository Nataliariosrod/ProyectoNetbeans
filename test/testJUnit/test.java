package testJUnit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;
import utilidades.Utilidades;

/**
 *
 * @author Natalia
 */
public class test {
    
    /**
     * Variables para probar los test
     */
    LocalDate d = LocalDate.now();
	int a = d.getYear();
        
        @Test
        public void validaFecha(){
            
        assert Utilidades.validaFecha(3);
        
         }
    /**
     * Test para validar si convierte un String a int
     */
        
        @Test
        public void validaInt(){
        
        assertEquals (3,Utilidades.validaInt("3"));
        assertEquals ("n",Utilidades.validaInt("3"));
        
        }
        
        @Test
        
    /**
     * Test para validar si existe el ingreso de numeros
     */
        public void validaString(){
        
            assert Utilidades.validaString("aaksjhf");
            assert !Utilidades.validaString("aak3464643sjhf");
            assert !Utilidades.validaString("2343aak3464643sjhf");
            assert !Utilidades.validaString("2343aak3464643sjhf34643646");
            assert !Utilidades.validaString("3469646");
            assert !Utilidades.validaString("asfaffsdgg093480498");
            assert !Utilidades.validaString("23525352akskjhff");

        }

}