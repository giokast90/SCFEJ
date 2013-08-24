package com.Despachos.Clientes;
// Generated 08-24-2013 05:33:50 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Tipopersona generated by hbm2java
 */
public class Tipopersona  implements java.io.Serializable {


     private Integer idTipoPersona;
     private String descripcion;
     private Set personaTipopersonas = new HashSet(0);

    public Tipopersona() {
    }

	
    public Tipopersona(String descripcion) {
        this.descripcion = descripcion;
    }
    public Tipopersona(String descripcion, Set personaTipopersonas) {
       this.descripcion = descripcion;
       this.personaTipopersonas = personaTipopersonas;
    }
   
    public Integer getIdTipoPersona() {
        return this.idTipoPersona;
    }
    
    public void setIdTipoPersona(Integer idTipoPersona) {
        this.idTipoPersona = idTipoPersona;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set getPersonaTipopersonas() {
        return this.personaTipopersonas;
    }
    
    public void setPersonaTipopersonas(Set personaTipopersonas) {
        this.personaTipopersonas = personaTipopersonas;
    }




}


