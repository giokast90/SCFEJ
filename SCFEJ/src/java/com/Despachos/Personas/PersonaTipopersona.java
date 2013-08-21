package com.Despachos.Personas;
// Generated 08-20-2013 07:07:18 PM by Hibernate Tools 3.2.1.GA


import com.Despachos.Expedientes.Expediente;
import java.util.HashSet;
import java.util.Set;

/**
 * PersonaTipopersona generated by hbm2java
 */
public class PersonaTipopersona  implements java.io.Serializable {


     private PersonaTipopersonaId id;
     private Tipopersona tipopersona;
     private Persona persona;
     private boolean activo;
     private Set<Expediente> expedientes = new HashSet<Expediente>(0);

    public PersonaTipopersona() {
    }

	
    public PersonaTipopersona(PersonaTipopersonaId id, Tipopersona tipopersona, Persona persona, boolean activo) {
        this.id = id;
        this.tipopersona = tipopersona;
        this.persona = persona;
        this.activo = activo;
    }
    public PersonaTipopersona(PersonaTipopersonaId id, Tipopersona tipopersona, Persona persona, boolean activo, Set<Expediente> expedientes) {
       this.id = id;
       this.tipopersona = tipopersona;
       this.persona = persona;
       this.activo = activo;
       this.expedientes = expedientes;
    }
   
    public PersonaTipopersonaId getId() {
        return this.id;
    }
    
    public void setId(PersonaTipopersonaId id) {
        this.id = id;
    }
    public Tipopersona getTipopersona() {
        return this.tipopersona;
    }
    
    public void setTipopersona(Tipopersona tipopersona) {
        this.tipopersona = tipopersona;
    }
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public boolean isActivo() {
        return this.activo;
    }
    
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    public Set<Expediente> getExpedientes() {
        return this.expedientes;
    }
    
    public void setExpedientes(Set<Expediente> expedientes) {
        this.expedientes = expedientes;
    }




}


