/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.*;

/**
 *
 * @author Natalia Rios
 */

public class ConexionBD {
   /** nombre base de datos*/
  private final String db = "nrios_biblioteca";
  /** usuario */
  private final String user = "nrios";
  /** contraseña de MySql*/
  private final String password = "Nervion1**";
  /** Cadena de conexion */
  private String url = "jdbc:mysql://nrios.salesianas.es/" + db;

  /** variable para trabajar con la conexion a la base de datos */
  private Connection connection = null;
  
  /** variable para comprobar si la conexion es correcta*/
  private String exito;
   /** Constructor de clase */
   public ConexionBD(){
         this.url = "jdbc:mysql://nrios.salesianas.es/" + db;
       try{
         //obtenemos el driver de para mysql
         Class.forName("com.mysql.jdbc.Driver");
         //obtenemos la conexión
         connection = DriverManager.getConnection( this.url, this.user , this.password );  
         exito = "Conexion a la base de datos correcta";
         System.out.println("Conexion correcta");
      }catch(SQLException e){
         System.err.println( e.getMessage() );
      }catch(ClassNotFoundException e){
         System.err.println( e.getMessage() );
      }
   }
   
   /**
    * getters y setters
    * @return connection Connection, exito String
    */
   public Connection getConexion() {
    return this.connection;
   }
   
   public String getString () {
       return exito;
   }
}
