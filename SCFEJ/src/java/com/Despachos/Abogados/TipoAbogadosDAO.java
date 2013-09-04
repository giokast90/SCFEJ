package com.Despachos.Abogados;

/**
 *
 * @author Usuario
 */

import Conexion.ConexionDB;
import Entidades.Tipoabogado;
import com.mysql.jdbc.Connection;
import com.sun.org.apache.bcel.internal.generic.Select;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import javax.faces.model.SelectItem;

public class TipoAbogadosDAO {
    
     ArrayList<SelectItem> lista;
    
    public TipoAbogadosDAO() {
        
        lista = new ArrayList<SelectItem>();
        
    }
    
     public ArrayList<SelectItem> listarTipoAbogados() throws SQLException{
        
        Connection conexion = new ConexionDB().conectar();
        PreparedStatement consulta = conexion.prepareStatement("select idTipoAbogado, descripcion from tipoabogado");
        ResultSet resultado = consulta.executeQuery();
        while(resultado.next()){
            lista.add(new SelectItem(resultado.getInt("idTipoAbogado"),resultado.getString("descripcion")));
        }
	return lista;       
    }      
}
