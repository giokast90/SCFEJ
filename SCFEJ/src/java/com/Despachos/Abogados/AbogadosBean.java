/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Despachos.Abogados;

import Entidades.AbogadoTipoabogado;
import Entidades.Abogados;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Tellin
 */
@ManagedBean
@RequestScoped
public class AbogadosBean {

    private int idAbogado;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String noCarne;
    private String cedula;
    private String direccion;
    private int telefono;
    private int celular;
    private String email;
    private Abogados entidad;
    private AbogadoTipoabogado entidadAbogadoTipoabogado;
    
    
    public AbogadosBean() throws SQLException {      
        
        entidadAbogadoTipoabogado = new AbogadoTipoabogado();
        entidad = new Abogados();
    }
    
    public int getIdAbogado() {
        return idAbogado;
    }

    public void setIdAbogado(int idAbogado) {
        this.idAbogado = idAbogado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
    
    public String getNoCarne(){
        return noCarne;
    }

    public void setNoCarne(String noCarne){
        this.noCarne = noCarne;
    }
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AbogadoTipoabogado getEntidadAbogadoTipoabogado() {
        return entidadAbogadoTipoabogado;
    }

    public void setEntidadAbogadoTipoabogado(AbogadoTipoabogado entidadAbogadoTipoabogado) {
        this.entidadAbogadoTipoabogado = entidadAbogadoTipoabogado;
    }

      public void guardarAbogados() throws SQLException{
    
        entidad.setIdAbogado(idAbogado);
        entidad.setNombre(nombre);
        entidad.setDireccion(direccion);
        entidad.setPrimerApellido(primerApellido);
        entidad.setSegundoApellido(segundoApellido);
        entidad.setNoCarne(noCarne);
        entidad.setCedula(cedula);
        entidad.setCelular(celular);
        entidad.setTelefono(telefono);
        entidad.setEmail(email);
        
        entidad.guardarAbogados(entidad);
        
        entidadAbogadoTipoabogado.setIdtipoabogado(entidadAbogadoTipoabogado.getIdtipoabogado());
        entidadAbogadoTipoabogado.setActivo(entidadAbogadoTipoabogado.isActivo());   
        
        entidadAbogadoTipoabogado.GuardarTipodeAbogado(entidadAbogadoTipoabogado);
        
        
   }
    
    public void msg() {
        boolean comprobar=true;
        try{
            this.guardarAbogados();
        }
        catch(SQLException ex){
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR,"Almacenamiento de Datos","Error al insertar los Datos");
            FacesContext.getCurrentInstance().addMessage(null, msg);
            comprobar=false;
        }
        if(comprobar==true){
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO,"Almacenamiento de Datos","Datos guardados exitosamente");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }  
    }
   
    public ArrayList<Abogados> listaAbogados() throws SQLException {
    
        return entidad.listaAbogados();
    }

}
