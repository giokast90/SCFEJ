package Entidades;
// Generated 08-28-2013 12:12:48 AM by Hibernate Tools 3.2.1.GA


import com.Despachos.Abogados.AbogadosDAO;
import java.sql.SQLException;
import java.util.ArrayList;

public class Abogados {

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
     private AbogadosDAO dao;

    public Abogados() throws SQLException {
        dao= new AbogadosDAO();
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
    
    public void guardarAbogados(Abogados entidad) throws SQLException{
        
        dao.guardarAbogados(entidad);
    }
    
    public ArrayList<Abogados> listaAbogados() throws SQLException {
    
        return dao.listaAbogados();
    }    
}


