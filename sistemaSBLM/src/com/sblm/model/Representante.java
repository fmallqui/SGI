package com.sblm.model;
// Generated 28/10/2013 06:01:30 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Representante generated by hbm2java
 */
@Entity
@Table(name="REPRESENTANTE"
    ,schema="dbo"
    ,catalog="beneficenciadba"
)
public class Representante  implements java.io.Serializable {


     private int idrepresentante;
     private String nombres;
     private String apellidos;
     private String nombrescompletos;
     private String ruc;
     private String dni;
     private Date fechacreacion;
     private String usuariocreador;
     private Date fechamodificacion;
     private String usuariomodificador;
     private Set<Contrato> contratos = new HashSet<Contrato>(0);

    public Representante() {
    }

	
    public Representante(int idrepresentante) {
        this.idrepresentante = idrepresentante;
    }
    public Representante(int idrepresentante, String nombres, String apellidos, String nombrescompletos, String ruc, String dni, Date fechacreacion, String usuariocreador, Date fechamodificacion, String usuariomodificador, Set<Contrato> contratos) {
       this.idrepresentante = idrepresentante;
       this.nombres = nombres;
       this.apellidos = apellidos;
       this.nombrescompletos = nombrescompletos;
       this.ruc = ruc;
       this.dni = dni;
       this.fechacreacion = fechacreacion;
       this.usuariocreador = usuariocreador;
       this.fechamodificacion = fechamodificacion;
       this.usuariomodificador = usuariomodificador;
       this.contratos = contratos;
    }
   
     @Id 
     @GeneratedValue
    @Column(name="IDREPRESENTANTE", unique=true, nullable=false)
    public int getIdrepresentante() {
        return this.idrepresentante;
    }
    
    public void setIdrepresentante(int idrepresentante) {
        this.idrepresentante = idrepresentante;
    }
    
    @Column(name="NOMBRES", length=100)
    public String getNombres() {
        return this.nombres;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
    @Column(name="APELLIDOS", length=100)
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    @Column(name="NOMBRESCOMPLETOS", length=200)
    public String getNombrescompletos() {
        return this.nombrescompletos;
    }
    
    public void setNombrescompletos(String nombrescompletos) {
        this.nombrescompletos = nombrescompletos;
    }
    
    @Column(name="RUC", length=10)
    public String getRuc() {
        return this.ruc;
    }
    
    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
    
    @Column(name="DNI", length=10)
    public String getDni() {
        return this.dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="FECHACREACION", length=23)
    public Date getFechacreacion() {
        return this.fechacreacion;
    }
    
    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }
    
    @Column(name="USUARIOCREADOR", length=100)
    public String getUsuariocreador() {
        return this.usuariocreador;
    }
    
    public void setUsuariocreador(String usuariocreador) {
        this.usuariocreador = usuariocreador;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="FECHAMODIFICACION", length=23)
    public Date getFechamodificacion() {
        return this.fechamodificacion;
    }
    
    public void setFechamodificacion(Date fechamodificacion) {
        this.fechamodificacion = fechamodificacion;
    }
    
    @Column(name="USUARIOMODIFICADOR", length=100)
    public String getUsuariomodificador() {
        return this.usuariomodificador;
    }
    
    public void setUsuariomodificador(String usuariomodificador) {
        this.usuariomodificador = usuariomodificador;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="representante")
    public Set<Contrato> getContratos() {
        return this.contratos;
    }
    
    public void setContratos(Set<Contrato> contratos) {
        this.contratos = contratos;
    }




}

