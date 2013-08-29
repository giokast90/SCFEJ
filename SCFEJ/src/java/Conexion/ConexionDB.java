
package Conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

    public Connection conectar() throws SQLException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(Exception e){
        }
        return (Connection) DriverManager.getConnection("jdbc:mysql://localhost/DespachoAbogados", "root", "giokast9020");
    }
}
