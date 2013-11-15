package com.sblm.model3;
// Generated 19/08/2013 04:48:41 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Archivodocumento generated by hbm2java
 */
@Entity
@Table(name="ARCHIVODOCUMENTO"
    ,schema="dbo"
    ,catalog="beneficenciadba"
)
public class Archivodocumento  implements java.io.Serializable {


     private int idarchivodocumento;
     private Documento documento;
     private Extensionarchivo extensionarchivo;
     private String ruta;
     private String area;
     private String usuarioCreador;
     private int autorArchivo;
     private Date fechaCreacion;

    public Archivodocumento() {
    }

	
    public Archivodocumento(int idarchivodocumento, Documento documento, Extensionarchivo extensionarchivo, int autorArchivo, Date fechaCreacion,String usuarioCreador) {
        this.idarchivodocumento = idarchivodocumento;
        this.documento = documento;
        this.extensionarchivo = extensionarchivo;
        this.autorArchivo = autorArchivo;
        this.fechaCreacion=fechaCreacion;
        this.usuarioCreador=usuarioCreador;
    }
    public Archivodocumento(int idarchivodocumento, Documento documento, Extensionarchivo extensionarchivo, String ruta, String area, int autorArchivo, Date fechaCreacion, String usuarioCreador) {
       this.idarchivodocumento = idarchivodocumento;
       this.documento = documento;
       this.extensionarchivo = extensionarchivo;
       this.ruta = ruta;
       this.area = area;
       this.autorArchivo = autorArchivo;
       this.fechaCreacion=fechaCreacion;
       this.usuarioCreador=usuarioCreador;
    }
   
     @Id 
    @GeneratedValue
    @Column(name="idarchivodocumento", unique=true, nullable=false)
    public int getIdarchivodocumento() {
        return this.idarchivodocumento;
    }
    
    public void setIdarchivodocumento(int idarchivodocumento) {
        this.idarchivodocumento = idarchivodocumento;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="iddocumento", nullable=false)
    public Documento getDocumento() {
        return this.documento;
    }
    
    public void setDocumento(Documento documento) {
        this.documento = documento;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idExtensionArchivo", nullable=false)
    public Extensionarchivo getExtensionarchivo() {
        return this.extensionarchivo;
    }
    
    public void setExtensionarchivo(Extensionarchivo extensionarchivo) {
        this.extensionarchivo = extensionarchivo;
    }
    
    @Column(name="ruta", length=100)
    public String getRuta() {
        return this.ruta;
    }
    
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    @Column(name="usuarioCreador", length=100)
    public String getUsuarioCreador() {
        return this.usuarioCreador;
    }
    
    public void setUsuarioCreador(String usuarioCreador) {
        this.usuarioCreador = usuarioCreador;
    }
    
    
    @Column(name="area", length=25)
    public String getArea() {
        return this.area;
    }
    
    public void setArea(String area) {
        this.area = area;
    }
    
    @Column(name="autorArchivo", nullable=false)
    public int getAutorArchivo() {
        return this.autorArchivo;
    }
    
    public void setAutorArchivo(int autorArchivo) {
        this.autorArchivo = autorArchivo;
    }

    @Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FECHACREACION", length = 23)
	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}


}

