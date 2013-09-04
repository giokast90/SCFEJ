package Entidades;
// Generated 08-28-2013 12:12:48 AM by Hibernate Tools 3.2.1.GA


import com.Despachos.Clientes.TipoPersonaDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.faces.model.SelectItem;

public class Tipopersona{


     private int idTipoPersona;
     private String descripcion;
     private TipoPersonaDAO dao;

    public Tipopersona() {
        
        dao = new TipoPersonaDAO();
        
    }
   
    public int getIdTipoPersona() {
        return this.idTipoPersona;
    }
    
    public void setIdTipoPersona(int idTipoPersona) {
        this.idTipoPersona = idTipoPersona;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<SelectItem> listaTipoPersona() throws SQLException{
        
        return dao.listarTiposPersona();
        
    }
    
}


