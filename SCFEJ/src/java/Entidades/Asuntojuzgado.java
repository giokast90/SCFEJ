package Entidades;
// Generated 08-28-2013 12:12:48 AM by Hibernate Tools 3.2.1.GA


/**
 * Asuntojuzgado generated by hbm2java
 */
public class Asuntojuzgado  implements java.io.Serializable {


     private Integer idAsuntoJudicial;
     private Integer idJuzgados;
     private boolean activo;

    public Asuntojuzgado() {
    }

    public Integer getIdAsuntoJudicial() {
        return idAsuntoJudicial;
    }

    public void setIdAsuntoJudicial(Integer idAsuntoJudicial) {
        this.idAsuntoJudicial = idAsuntoJudicial;
    }

    public Integer getIdJuzgados() {
        return idJuzgados;
    }

    public void setIdJuzgados(Integer idJuzgados) {
        this.idJuzgados = idJuzgados;
    }
    
    public boolean isActivo() {
        return this.activo;
    }
    
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

}


