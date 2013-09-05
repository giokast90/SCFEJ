/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Despachos.Clientes;

import Entidades.PersonaTipopersona;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import Entidades.Personas;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;


@ManagedBean
@RequestScoped
public class PersonaBean {

    private int idPersona;
    private String nombrePersona;
    private String primerApellidoPersona;
    private String segundoApellidoPersona;
    private String cedulaPersona;
    private String direccionPersona;
    private int telefonoPersona;
    private int celularPersona;
    private String emailPersona;
    private String observaciones;
    private Personas entidad;
    private PersonaTipopersona entidadPersonaTipoPersona;
    
    public PersonaBean() throws SQLException {
        entidadPersonaTipoPersona = new PersonaTipopersona();
        entidad = new Personas();
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getPrimerApellidoPersona() {
        return primerApellidoPersona;
    }

    public void setPrimerApellidoPersona(String primerApellidoPersona) {
        this.primerApellidoPersona = primerApellidoPersona;
    }

    public String getSegundoApellidoPersona() {
        return segundoApellidoPersona;
    }

    public void setSegundoApellidoPersona(String segundoApellidoPersona) {
        this.segundoApellidoPersona = segundoApellidoPersona;
    }

    public String getCedulaPersona() {
        return cedulaPersona;
    }

    public void setCedulaPersona(String cedulaPersona) {
        this.cedulaPersona = cedulaPersona;
    }

    public String getDireccionPersona() {
        return direccionPersona;
    }

    public void setDireccionPersona(String direccionPersona) {
        this.direccionPersona = direccionPersona;
    }

    public int getTelefonoPersona() {
        return telefonoPersona;
    }

    public void setTelefonoPersona(int telefonoPersona) {
        this.telefonoPersona = telefonoPersona;
    }

    public int getCelularPersona() {
        return celularPersona;
    }

    public void setCelularPersona(int celularPersona) {
        this.celularPersona = celularPersona;
    }

    public String getEmailPersona() {
        return emailPersona;
    }

    public void setEmailPersona(String emailPersona) {
        this.emailPersona = emailPersona;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public PersonaTipopersona getEntidadPersonaTipoPersona() {
        return entidadPersonaTipoPersona;
    }

    public void setEntidadPersonaTipoPersona(PersonaTipopersona entidadPersonaTipoPersona) {
        this.entidadPersonaTipoPersona = entidadPersonaTipoPersona;
    }
    
    public void guardarPersona() throws SQLException{
    
        entidad.setIdPersona(idPersona);
        entidad.setNombrePersona(nombrePersona);
        entidad.setDireccionPersona(direccionPersona);
        entidad.setPrimerApellidoPersona(primerApellidoPersona);
        entidad.setSegundoApellidoPersona(segundoApellidoPersona);
        entidad.setCedulaPersona(cedulaPersona);
        entidad.setCelularPersona(celularPersona);
        entidad.setTelefonoPersona(telefonoPersona);
        entidad.setEmailPersona(emailPersona);
        entidad.setObservaciones(observaciones);
        
        entidad.guardarPersona(entidad);
        
        entidadPersonaTipoPersona.setIdtipopersona(entidadPersonaTipoPersona.getIdtipopersona());
        entidadPersonaTipoPersona.setActivo(entidadPersonaTipoPersona.isActivo());
        
        entidadPersonaTipoPersona.GuardarTipodePersona(entidadPersonaTipoPersona);
        
    }
    
    public void msg() {
        boolean comprobar=true;
        try{
            this.guardarPersona();
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
    
    public List<Personas> listaPersonas() throws SQLException{
    
        return entidad.listaPersonas();
    
    }
    
}
