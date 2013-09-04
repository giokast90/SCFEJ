package com.Despachos.Abogados;

import Conexion.ConexionDB;
import Entidades.Abogados;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AbogadosDAO {
    
    public AbogadosDAO() {
        
    }
     public void guardarAbogados(Abogados entidad) throws SQLException{
    
        Connection conexion = new ConexionDB().conectar();
        String query = "insert into Abogados values("+entidad.getIdAbogado()+",'"+entidad.getNombre()+"','"
                        +entidad.getPrimerApellido()+"','"+entidad.getSegundoApellido()+"','"+entidad.getNoCarne()+"','"
                        +entidad.getCedula()+"','"+entidad.getDireccion()+"',"+entidad.getTelefono()+","
                        +entidad.getCelular()+",'"+entidad.getEmail()+"');";
        PreparedStatement exec = conexion.prepareStatement(query);
        exec.executeUpdate();
        conexion.close();        
    }  
}
