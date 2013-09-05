package com.Despachos.Clientes;

import Conexion.ConexionDB;
import Entidades.PersonaTipopersona;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PersonaTipoPersonaDAO {

    public PersonaTipoPersonaDAO() {
    }
    public void guardarTipoPersona(PersonaTipopersona entidad) throws SQLException{
    
        Connection conexion = new ConexionDB().conectar();
        String query = "insert into persona_tipopersona values((select max(idPersona) FROM personas),"+entidad.getIdtipopersona()+","+entidad.isActivo()+");";
        PreparedStatement exec = conexion.prepareStatement(query);
        exec.executeUpdate();
        conexion.close();
        
    }
}
