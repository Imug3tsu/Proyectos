
package com.sql_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Conexion {
    
    private Connection con;
    private DriverManager dr;
    
    public Connection Conectar(){
        try{
            con=dr.getConnection("jdbc:mysql://localhost:3306/Prueba2","root","udpatewey5");
            System.out.println("Conexion con exito!");
        }catch(SQLException e){
            System.out.println("Error al conectar: "+e.getMessage());
        }
        return con;
    }
    
}
