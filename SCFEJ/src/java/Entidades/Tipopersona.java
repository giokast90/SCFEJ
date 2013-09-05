package Entidades;

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


