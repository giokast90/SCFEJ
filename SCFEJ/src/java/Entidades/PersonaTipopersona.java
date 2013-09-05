package Entidades;
// Generated 08-28-2013 12:12:48 AM by Hibernate Tools 3.2.1.GA

import com.Despachos.Clientes.PersonaTipoPersonaDAO;
import java.sql.SQLException;


public class PersonaTipopersona  implements java.io.Serializable {


     private int idtipopersona;
     private int idpersonas;
     private boolean activo;
     private PersonaTipoPersonaDAO dao;

    public PersonaTipopersona() {
        dao = new PersonaTipoPersonaDAO();
    }

    public int getIdtipopersona() {
        return idtipopersona;
    }

    public void setIdtipopersona(int idtipopersona) {
        this.idtipopersona = idtipopersona;
    }

    public int getIdpersonas() {
        return idpersonas;
    }

    public void setIdpersonas(int idpersonas) {
        this.idpersonas = idpersonas;
    }

    public boolean isActivo() {
        return this.activo;
    }
    
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    public void GuardarTipodePersona(PersonaTipopersona entidad) throws SQLException{
    
        dao.guardarTipoPersona(entidad);
        
    }

}


