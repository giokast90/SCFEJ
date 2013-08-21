package com.Expedientes.Juzgados;
// Generated 08-20-2013 07:07:18 PM by Hibernate Tools 3.2.1.GA


import com.Expedientes.Agenda.Agenda;
import com.Despachos.Expedientes.Estadoevolutivo;
import java.util.HashSet;
import java.util.Set;

/**
 * Usuarios generated by hbm2java
 */
public class Usuarios  implements java.io.Serializable {


     private Integer idUsuarios;
     private String nombre;
     private String apellido;
     private String alias;
     private String contrasenia;
     private boolean activo;
     private Set<Estadoevolutivo> estadoevolutivos = new HashSet<Estadoevolutivo>(0);
     private Set<Agenda> agendas = new HashSet<Agenda>(0);

    public Usuarios() {
    }

	
    public Usuarios(String nombre, String apellido, String alias, String contrasenia, boolean activo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.alias = alias;
        this.contrasenia = contrasenia;
        this.activo = activo;
    }
    public Usuarios(String nombre, String apellido, String alias, String contrasenia, boolean activo, Set<Estadoevolutivo> estadoevolutivos, Set<Agenda> agendas) {
       this.nombre = nombre;
       this.apellido = apellido;
       this.alias = alias;
       this.contrasenia = contrasenia;
       this.activo = activo;
       this.estadoevolutivos = estadoevolutivos;
       this.agendas = agendas;
    }
   
    public Integer getIdUsuarios() {
        return this.idUsuarios;
    }
    
    public void setIdUsuarios(Integer idUsuarios) {
        this.idUsuarios = idUsuarios;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getAlias() {
        return this.alias;
    }
    
    public void setAlias(String alias) {
        this.alias = alias;
    }
    public String getContrasenia() {
        return this.contrasenia;
    }
    
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    public boolean isActivo() {
        return this.activo;
    }
    
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    public Set<Estadoevolutivo> getEstadoevolutivos() {
        return this.estadoevolutivos;
    }
    
    public void setEstadoevolutivos(Set<Estadoevolutivo> estadoevolutivos) {
        this.estadoevolutivos = estadoevolutivos;
    }
    public Set<Agenda> getAgendas() {
        return this.agendas;
    }
    
    public void setAgendas(Set<Agenda> agendas) {
        this.agendas = agendas;
    }




}


