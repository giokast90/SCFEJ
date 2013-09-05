/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Despachos.Clientes;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class PersonaTipoPersonaBean {

    private int idTipopersona;
    private int idPersona;
    private boolean activo;
    
    public PersonaTipoPersonaBean() {
    }

    public int getIdTipopersona() {
        return idTipopersona;
    }

    public void setIdTipopersona(int idTipopersona) {
        this.idTipopersona = idTipopersona;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
}
