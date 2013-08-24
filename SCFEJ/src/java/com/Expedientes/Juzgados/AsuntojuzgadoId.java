package com.Expedientes.Juzgados;
// Generated 08-24-2013 05:33:50 PM by Hibernate Tools 3.2.1.GA



/**
 * AsuntojuzgadoId generated by hbm2java
 */
public class AsuntojuzgadoId  implements java.io.Serializable {


     private int idAsuntoJudicial;
     private int idJuzgados;

    public AsuntojuzgadoId() {
    }

    public AsuntojuzgadoId(int idAsuntoJudicial, int idJuzgados) {
       this.idAsuntoJudicial = idAsuntoJudicial;
       this.idJuzgados = idJuzgados;
    }
   
    public int getIdAsuntoJudicial() {
        return this.idAsuntoJudicial;
    }
    
    public void setIdAsuntoJudicial(int idAsuntoJudicial) {
        this.idAsuntoJudicial = idAsuntoJudicial;
    }
    public int getIdJuzgados() {
        return this.idJuzgados;
    }
    
    public void setIdJuzgados(int idJuzgados) {
        this.idJuzgados = idJuzgados;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AsuntojuzgadoId) ) return false;
		 AsuntojuzgadoId castOther = ( AsuntojuzgadoId ) other; 
         
		 return (this.getIdAsuntoJudicial()==castOther.getIdAsuntoJudicial())
 && (this.getIdJuzgados()==castOther.getIdJuzgados());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdAsuntoJudicial();
         result = 37 * result + this.getIdJuzgados();
         return result;
   }   


}

