/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.*;


/**
 *
 * @author ALM_Usuario11
 */
public class Conexion {
      
    public Conexion(){
    
    }
    
    public Connection getConexion(){
        Connection con=null;
        
        try {
            //Carga el driver JDBC
            Class.forName("com.mysql.jdbc.Driver");
            //Obtener la conexion
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "");            
        }catch(Exception e){
        }
        
        return con;
    }
}
