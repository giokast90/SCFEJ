package Entidades;
// Generated 08-28-2013 12:12:48 AM by Hibernate Tools 3.2.1.GA



/**
 * Detallesexpediente generated by hbm2java
 */
public class Detallesexpediente  implements java.io.Serializable {


     private int idExpediente;
     private Expediente expediente;
     private AbogadoTipoabogado abogadoTipoabogado;
     private PersonaTipopersona personaTipopersona;

    public Detallesexpediente() {
    }

    public Detallesexpediente(int idExpediente, Expediente expediente, AbogadoTipoabogado abogadoTipoabogado, PersonaTipopersona personaTipopersona) {
       this.idExpediente = idExpediente;
       this.expediente = expediente;
       this.abogadoTipoabogado = abogadoTipoabogado;
       this.personaTipopersona = personaTipopersona;
    }
   
    public int getIdExpediente() {
        return this.idExpediente;
    }
    
    public void setIdExpediente(int idExpediente) {
        this.idExpediente = idExpediente;
    }
    public Expediente getExpediente() {
        return this.expediente;
    }
    
    public void setExpediente(Expediente expediente) {
        this.expediente = expediente;
    }
    public AbogadoTipoabogado getAbogadoTipoabogado() {
        return this.abogadoTipoabogado;
    }
    
    public void setAbogadoTipoabogado(AbogadoTipoabogado abogadoTipoabogado) {
        this.abogadoTipoabogado = abogadoTipoabogado;
    }
    public PersonaTipopersona getPersonaTipopersona() {
        return this.personaTipopersona;
    }
    
    public void setPersonaTipopersona(PersonaTipopersona personaTipopersona) {
        this.personaTipopersona = personaTipopersona;
    }




}


