package com.Despachos.Abogados;
// Generated 08-24-2013 05:33:50 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Abogados generated by hbm2java
 */
public class Abogados  implements java.io.Serializable {


     private Integer idAbogado;
     private String nombre;
     private String primerApellido;
     private String segundoApellido;
     private String noCarne;
     private String cedula;
     private String direccion;
     private Integer telefono;
     private Integer celular;
     private String email;
     private Set abogadoTipoabogados = new HashSet(0);

    public Abogados() {
    }

	
    public Abogados(String nombre, String primerApellido, String noCarne, String cedula, String direccion) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.noCarne = noCarne;
        this.cedula = cedula;
        this.direccion = direccion;
    }
    public Abogados(String nombre, String primerApellido, String segundoApellido, String noCarne, String cedula, String direccion, Integer telefono, Integer celular, String email, Set abogadoTipoabogados) {
       this.nombre = nombre;
       this.primerApellido = primerApellido;
       this.segundoApellido = segundoApellido;
       this.noCarne = noCarne;
       this.cedula = cedula;
       this.direccion = direccion;
       this.telefono = telefono;
       this.celular = celular;
       this.email = email;
       this.abogadoTipoabogados = abogadoTipoabogados;
    }
   
    public Integer getIdAbogado() {
        return this.idAbogado;
    }
    
    public void setIdAbogado(Integer idAbogado) {
        this.idAbogado = idAbogado;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPrimerApellido() {
        return this.primerApellido;
    }
    
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }
    public String getSegundoApellido() {
        return this.segundoApellido;
    }
    
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
    public String getNoCarne() {
        return this.noCarne;
    }
    
    public void setNoCarne(String noCarne) {
        this.noCarne = noCarne;
    }
    public String getCedula() {
        return this.cedula;
    }
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Integer getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }
    public Integer getCelular() {
        return this.celular;
    }
    
    public void setCelular(Integer celular) {
        this.celular = celular;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Set getAbogadoTipoabogados() {
        return this.abogadoTipoabogados;
    }
    
    public void setAbogadoTipoabogados(Set abogadoTipoabogados) {
        this.abogadoTipoabogados = abogadoTipoabogados;
    }




}


