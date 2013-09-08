package com.Despachos.Abogados;

import Conexion.ConexionDB;
import Entidades.Abogados;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AbogadosDAO {
    
    Connection conexion;
    ArrayList<Abogados> lista;
    
    public AbogadosDAO() throws SQLException {
        
        
        lista = new ArrayList<Abogados>();
    }
     public void guardarAbogados(Abogados entidad) throws SQLException{
         conexion = new ConexionDB().conectar();
    
        String query = "insert into Abogados values("+entidad.getIdAbogado()+",'"+entidad.getNombre()+"','"
                        +entidad.getPrimerApellido()+"','"+entidad.getSegundoApellido()+"','"+entidad.getNoCarne()+"','"
                        +entidad.getCedula()+"','"+entidad.getDireccion()+"',"+entidad.getTelefono()+","
                        +entidad.getCelular()+",'"+entidad.getEmail()+"');";
        PreparedStatement exec = conexion.prepareStatement(query);
        exec.executeUpdate();
        conexion.close();        
    } 
     
    public ArrayList<Abogados> listaAbogados() throws SQLException {
        conexion = new ConexionDB().conectar();
    
        PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM despachoabogados.abogados");
        ResultSet tabla = consulta.executeQuery();
        Abogados entidad;
        while (tabla.next()){
        
            entidad = new Abogados();
            entidad.setIdAbogado(Integer.parseInt(tabla.getString(1)));
            entidad.setNombre(tabla.getString(2));
            entidad.setPrimerApellido(tabla.getString(3));
            entidad.setSegundoApellido(tabla.getString(4));
            entidad.setNoCarne(tabla.getString(5));
            entidad.setCedula(tabla.getString(6));
            entidad.setDireccion(tabla.getString(7));
            entidad.setTelefono(Integer.parseInt(tabla.getString(8)));
            entidad.setCelular(Integer.parseInt(tabla.getString(9)));
            entidad.setEmail(tabla.getString(10));             
            
            lista.add(entidad);
        }
        conexion.close();        
        
        return lista;
        
    }
     
}
