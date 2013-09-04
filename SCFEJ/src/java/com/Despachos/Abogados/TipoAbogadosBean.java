/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Despachos.Abogados;

import Entidades.Tipoabogado;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;

/**
 *
 * @author Usuario
 */
@ManagedBean
@RequestScoped
public class TipoAbogadosBean {

    private int idTipoAbogado;
    private String descripcion;
    private Tipoabogado entidad;
    
    public TipoAbogadosBean() {
        
        entidad = new Tipoabogado();
    }

    public int getIdTipoAbogado() {
        return idTipoAbogado;
    }

    public void setIdTipoAbogado(int idTipoAbogado) {
        this.idTipoAbogado = idTipoAbogado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
     public ArrayList<SelectItem> listaTipoAbogados() throws SQLException{
    
        return entidad.listaTipoAbogados();
        
    }
}
