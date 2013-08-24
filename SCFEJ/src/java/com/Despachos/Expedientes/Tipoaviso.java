package com.Despachos.Expedientes;
// Generated 08-24-2013 05:33:50 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Tipoaviso generated by hbm2java
 */
public class Tipoaviso  implements java.io.Serializable {


     private Integer idTipoAviso;
     private String descripcion;
     private Set estadoevolutivos = new HashSet(0);

    public Tipoaviso() {
    }

	
    public Tipoaviso(String descripcion) {
        this.descripcion = descripcion;
    }
    public Tipoaviso(String descripcion, Set estadoevolutivos) {
       this.descripcion = descripcion;
       this.estadoevolutivos = estadoevolutivos;
    }
   
    public Integer getIdTipoAviso() {
        return this.idTipoAviso;
    }
    
    public void setIdTipoAviso(Integer idTipoAviso) {
        this.idTipoAviso = idTipoAviso;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set getEstadoevolutivos() {
        return this.estadoevolutivos;
    }
    
    public void setEstadoevolutivos(Set estadoevolutivos) {
        this.estadoevolutivos = estadoevolutivos;
    }




}

