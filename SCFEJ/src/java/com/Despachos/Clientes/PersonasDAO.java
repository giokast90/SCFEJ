
package com.Despachos.Clientes;

import Conexion.ConexionDB;
import Entidades.Personas;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PersonasDAO {
    
    public PersonasDAO() {
        
    }
    public void guardarPersona(Personas entidad) throws SQLException{
    
        Connection conexion = new ConexionDB().conectar();
        String query = "insert into Personas values("+entidad.getIdPersona()+",'"+entidad.getNombrePersona()+"','"
                        +entidad.getPrimerApellidoPersona()+"','"+entidad.getSegundoApellidoPersona()+"','"+entidad.getCedulaPersona()+"','"
                        +entidad.getDireccionPersona()+"',"+entidad.getTelefonoPersona()+","+entidad.getCelularPersona()+",'"+entidad.getEmailPersona()+"','"
                        +entidad.getObservaciones()+"');";
        PreparedStatement exec = conexion.prepareStatement(query);
        exec.executeUpdate();
        conexion.close();
        
    }
    
}
