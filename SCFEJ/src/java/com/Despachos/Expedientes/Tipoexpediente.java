package com.Despachos.Expedientes;
// Generated 08-24-2013 05:33:50 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Tipoexpediente generated by hbm2java
 */
public class Tipoexpediente  implements java.io.Serializable {


     private Integer idTipoExpediente;
     private String descripcion;
     private boolean activo;
     private Set expedientes = new HashSet(0);

    public Tipoexpediente() {
    }

	
    public Tipoexpediente(String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }
    public Tipoexpediente(String descripcion, boolean activo, Set expedientes) {
       this.descripcion = descripcion;
       this.activo = activo;
       this.expedientes = expedientes;
    }
   
    public Integer getIdTipoExpediente() {
        return this.idTipoExpediente;
    }
    
    public void setIdTipoExpediente(Integer idTipoExpediente) {
        this.idTipoExpediente = idTipoExpediente;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public boolean isActivo() {
        return this.activo;
    }
    
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    public Set getExpedientes() {
        return this.expedientes;
    }
    
    public void setExpedientes(Set expedientes) {
        this.expedientes = expedientes;
    }




}


