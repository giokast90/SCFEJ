/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Despachos.Abogados;

import Conexion.ConexionDB;
import Entidades.AbogadoTipoabogado;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AbogadosTipoAbogadosDAO {
    
    public AbogadosTipoAbogadosDAO(){
    }
   
    public void guardarTipoAbogado(AbogadoTipoabogado entidad) throws SQLException{
    
        Connection conexion = new ConexionDB().conectar();
        String query = "insert into despachoabogados.abogado_tipoabogado values("+entidad.getIdtipoabogado()+",(select max(idAbogado) FROM despachoabogados.abogados),"+entidad.isActivo()+");";
        PreparedStatement exec = conexion.prepareStatement(query);
        exec.executeUpdate();
        conexion.close();
        
    }
    
}
