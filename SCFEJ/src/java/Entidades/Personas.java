package Entidades;
// Generated 08-28-2013 12:12:48 AM by Hibernate Tools 3.2.1.GA


import com.Despachos.Clientes.PersonasDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Personas{


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
     private PersonasDAO dao;

    public Personas() throws SQLException {
        
        dao = new PersonasDAO();
        
    }
   
    public int getIdPersona() {
        return this.idPersona;
    }
    
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
    public String getNombrePersona() {
        return this.nombrePersona;
    }
    
    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }
    public String getPrimerApellidoPersona() {
        return this.primerApellidoPersona;
    }
    
    public void setPrimerApellidoPersona(String primerApellidoPersona) {
        this.primerApellidoPersona = primerApellidoPersona;
    }
    public String getSegundoApellidoPersona() {
        return this.segundoApellidoPersona;
    }
    
    public void setSegundoApellidoPersona(String segundoApellidoPersona) {
        this.segundoApellidoPersona = segundoApellidoPersona;
    }
    public String getCedulaPersona() {
        return this.cedulaPersona;
    }
    
    public void setCedulaPersona(String cedulaPersona) {
        this.cedulaPersona = cedulaPersona;
    }
    public String getDireccionPersona() {
        return this.direccionPersona;
    }
    
    public void setDireccionPersona(String direccionPersona) {
        this.direccionPersona = direccionPersona;
    }
    public int getTelefonoPersona() {
        return this.telefonoPersona;
    }
    
    public void setTelefonoPersona(int telefonoPersona) {
        this.telefonoPersona = telefonoPersona;
    }
    public int getCelularPersona() {
        return this.celularPersona;
    }
    
    public void setCelularPersona(int celularPersona) {
        this.celularPersona = celularPersona;
    }
    public String getEmailPersona() {
        return this.emailPersona;
    }
    
    public void setEmailPersona(String emailPersona) {
        this.emailPersona = emailPersona;
    }
    public String getObservaciones() {
        return this.observaciones;
    }
    
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    public void guardarPersona(Personas entidad) throws SQLException{
    
        dao.guardarPersona(entidad);
    
    }
    
    public List<Personas> listaPersonas() throws SQLException{
    
        return dao.listaPersona();
    
    }

}