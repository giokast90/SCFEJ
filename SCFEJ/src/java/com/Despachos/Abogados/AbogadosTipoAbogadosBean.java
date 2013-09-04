/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Despachos.Abogados;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
/**
 *
 * @author Usuario
 */
@ManagedBean
@RequestScoped
public class AbogadosTipoAbogadosBean {

    private int idTipoAbogado;
    private int idAbogado;
    private boolean activo;
    
    public AbogadosTipoAbogadosBean() {
    }

    public int getIdTipoAbogado() {
        return idTipoAbogado;
    }

    public void setIdTipoAbogado(int idTipoAbogados) {
        this.idTipoAbogado = idTipoAbogados;
    }

    public int getIdAbogado() {
        return idAbogado;
    }

    public void setIdAbogado(int idAbogado) {
        this.idAbogado = idAbogado;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }       
}
