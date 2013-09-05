
package com.Despachos.Clientes;

import Conexion.ConexionDB;
import Entidades.Personas;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonasDAO {
    
    Connection conexion;
    List<Personas> lista;
    
    public PersonasDAO() throws SQLException {
        conexion = new ConexionDB().conectar();
        lista = new ArrayList<Personas>();
    }
    public void guardarPersona(Personas entidad) throws SQLException{
    
        String query = "insert into Personas values("+entidad.getIdPersona()+",'"+entidad.getNombrePersona()+"','"
                        +entidad.getPrimerApellidoPersona()+"','"+entidad.getSegundoApellidoPersona()+"','"+entidad.getCedulaPersona()+"','"
                        +entidad.getDireccionPersona()+"',"+entidad.getTelefonoPersona()+","+entidad.getCelularPersona()+",'"+entidad.getEmailPersona()+"','"
                        +entidad.getObservaciones()+"');";
        PreparedStatement exec = conexion.prepareStatement(query);
        exec.executeUpdate();
        conexion.close();
        
    }
    
    public List<Personas> listaPersona() throws SQLException{
        
        PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM despachoabogados.personas;");
        ResultSet resultado = consulta.executeQuery();
        Personas entidad;
        while(resultado.next()){
            entidad = new Personas();
            entidad.setIdPersona(Integer.parseInt(resultado.getString(1)));
            entidad.setNombrePersona(resultado.getString(2));
            entidad.setPrimerApellidoPersona(resultado.getString(3));
            entidad.setSegundoApellidoPersona(resultado.getString(4));
            entidad.setCedulaPersona(resultado.getString(5));
            entidad.setDireccionPersona(resultado.getString(6));
            entidad.setTelefonoPersona(Integer.parseInt(resultado.getString(7)));
            entidad.setCelularPersona(Integer.parseInt(resultado.getString(8)));
            entidad.setEmailPersona(resultado.getString(9));
            entidad.setObservaciones(resultado.getString(10));
            lista.add(entidad);
        }
        conexion.close();
        return lista;
    }
    
}
