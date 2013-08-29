/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
        String query = "insert into persona_tipopersona values("+entidad.getIdpersonas()+","+entidad.getIdtipopersona()+","+entidad.isActivo()+");";
        PreparedStatement exec = conexion.prepareStatement(query);
        exec.executeUpdate();
        conexion.close();
        
    }
}
