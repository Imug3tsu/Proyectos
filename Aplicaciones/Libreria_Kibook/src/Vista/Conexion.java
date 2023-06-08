
package Vista;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    private Connection con;
    
    public Connection Conectar(){
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Libreria","root","udpatewey5");
            System.out.println("Conexion Exitosa!");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return con;
    }
    
}
