/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Despachos.Clientes;

import Entidades.Tipopersona;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;

/**
 *
 * @author Tellin
 */
@ManagedBean
@RequestScoped
public class TipoPersonaBean {
    
    private int idTipoPersona;
    private String descripcion;
    private Tipopersona entidad;
    
    public TipoPersonaBean() {
        
        entidad = new Tipopersona();
        
    }

    public int getIdTipoPersona() {
        return idTipoPersona;
    }

    public void setIdTipoPersona(int idTipoPersona) {
        this.idTipoPersona = idTipoPersona;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public ArrayList<SelectItem> listaTipoPersona() throws SQLException{
    
        return entidad.listaTipoPersona();
        
    }
    
}
