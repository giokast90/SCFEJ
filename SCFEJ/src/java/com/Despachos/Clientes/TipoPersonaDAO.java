
package com.Despachos.Clientes;

import Conexion.ConexionDB;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import javax.faces.model.SelectItem;

public class TipoPersonaDAO {

    ArrayList<SelectItem> lista;
    
    public TipoPersonaDAO() {
        
        lista = new ArrayList<SelectItem>();
        
    }
    
    public ArrayList<SelectItem> listarTiposPersona() throws SQLException{
        
        Connection conexion = new ConexionDB().conectar();
        PreparedStatement consulta = conexion.prepareStatement("select idTipoPersona, descripcion from tipopersona");
        ResultSet resultado = consulta.executeQuery();
        while(resultado.next()){
            lista.add(new SelectItem(resultado.getInt("idTipoPersona"),resultado.getString("descripcion")));
        }
        conexion.close();
	return lista;
        
    }
 
}
