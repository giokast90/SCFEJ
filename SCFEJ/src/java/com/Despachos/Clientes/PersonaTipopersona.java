package com.Despachos.Clientes;
// Generated 08-24-2013 05:33:50 PM by Hibernate Tools 3.2.1.GA



/**
 * PersonaTipopersona generated by hbm2java
 */
public class PersonaTipopersona  implements java.io.Serializable {


     private PersonaTipopersonaId id;
     private Tipopersona tipopersona;
     private Personas personas;
     private boolean activo;

    public PersonaTipopersona() {
    }

    public PersonaTipopersona(PersonaTipopersonaId id, Tipopersona tipopersona, Personas personas, boolean activo) {
       this.id = id;
       this.tipopersona = tipopersona;
       this.personas = personas;
       this.activo = activo;
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
    public Personas getPersonas() {
        return this.personas;
    }
    
    public void setPersonas(Personas personas) {
        this.personas = personas;
    }
    public boolean isActivo() {
        return this.activo;
    }
    
    public void setActivo(boolean activo) {
        this.activo = activo;
    }




}

