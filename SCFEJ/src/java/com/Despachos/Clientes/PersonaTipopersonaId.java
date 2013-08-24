package com.Despachos.Clientes;
// Generated 08-24-2013 05:33:50 PM by Hibernate Tools 3.2.1.GA



/**
 * PersonaTipopersonaId generated by hbm2java
 */
public class PersonaTipopersonaId  implements java.io.Serializable {


     private int idPersona;
     private int idTipoPersona;

    public PersonaTipopersonaId() {
    }

    public PersonaTipopersonaId(int idPersona, int idTipoPersona) {
       this.idPersona = idPersona;
       this.idTipoPersona = idTipoPersona;
    }
   
    public int getIdPersona() {
        return this.idPersona;
    }
    
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
    public int getIdTipoPersona() {
        return this.idTipoPersona;
    }
    
    public void setIdTipoPersona(int idTipoPersona) {
        this.idTipoPersona = idTipoPersona;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PersonaTipopersonaId) ) return false;
		 PersonaTipopersonaId castOther = ( PersonaTipopersonaId ) other; 
         
		 return (this.getIdPersona()==castOther.getIdPersona())
 && (this.getIdTipoPersona()==castOther.getIdTipoPersona());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdPersona();
         result = 37 * result + this.getIdTipoPersona();
         return result;
   }   


}

