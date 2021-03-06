package com.sblm.model3;

// Generated 05-ago-2013 16:25:24 by Hibernate Tools 3.4.0.CR1

import javax.persistence.GeneratedValue;

import javax.persistence.GeneratedValue;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Documento generated by hbm2java
 */
@Entity
@Table(name="DOCUMENTO"
    ,schema="dbo"
    ,catalog="beneficenciadba"
)
public class Documento  implements java.io.Serializable {


	private int iddocumento;
	private Tipodocumento tipodocumento;
	private Area area;
	private String codigodocumento;
	private String titulo;
	private String descripcion;
	private Date fechadocumento;
	private Date fecharegistro;
	private String numerofolio;
	private String numeroexpediente;
	private String nombreremitente;
	private String estado;
  private String estadodgai;
	private String respuesta;
	private String asunto;
	private Integer idaccion;
	private Integer idasunto;
	private Integer idestado;
	private Integer idremitente;
	private Integer idtipodocumento;
     private String comentario;
     private Date fechaderivaciondgai; 
     private Date fecharespuestadgai;
     private Date fechaaprobacionrechazo;
     private Set<Archivodocumento> archivodocumentos = new HashSet<Archivodocumento>(0);
     private Set<Flujodocumento> flujodocumentos = new HashSet<Flujodocumento>(0);

    public Documento() {
    }

	
    public Documento(int iddocumento, String codigodocumento) {
        this.iddocumento = iddocumento;
        this.codigodocumento = codigodocumento;
    }
    public Documento(int iddocumento, Tipodocumento tipodocumento, Area area, String codigodocumento, String titulo, String descripcion, Date fechadocumento, Date fecharegistro, String numerofolio, String numeroexpediente, String nombreremitente, String estado, String estadodgai, String respuesta, String asunto, Integer idaccion, Integer idasunto, Integer idestado, Integer idremitente, Integer idtipodocumento, String comentario, Set<Archivodocumento> archivodocumentos, Set<Flujodocumento> flujodocumentos) {
       this.iddocumento = iddocumento;
       this.tipodocumento = tipodocumento;
       this.area = area;
       this.codigodocumento = codigodocumento;
       this.titulo = titulo;
       this.descripcion = descripcion;
       this.fechadocumento = fechadocumento;
       this.fecharegistro = fecharegistro;
       this.numerofolio = numerofolio;
       this.numeroexpediente = numeroexpediente;
       this.nombreremitente = nombreremitente;
       this.estado = estado;
       this.estadodgai=estadodgai;
       this.respuesta = respuesta;
       this.asunto = asunto;
       this.idaccion = idaccion;
       this.idasunto = idasunto;
       this.idestado = idestado;
       this.idremitente = idremitente;
       this.idtipodocumento = idtipodocumento;
       this.comentario = comentario;
       this.archivodocumentos = archivodocumentos;
       this.flujodocumentos = flujodocumentos;
    }
   
     @Id 
    @GeneratedValue
    @Column(name="IDDOCUMENTO", unique=true, nullable=false)
    public int getIddocumento() {
        return this.iddocumento;
    }
    
    public void setIddocumento(int iddocumento) {
        this.iddocumento = iddocumento;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IDTIPODOC")
    public Tipodocumento getTipodocumento() {
        return this.tipodocumento;
    }
    
    public void setTipodocumento(Tipodocumento tipodocumento) {
        this.tipodocumento = tipodocumento;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IDAREA")
    public Area getArea() {
        return this.area;
    }
    
    public void setArea(Area area) {
        this.area = area;
    }
    
    @Column(name="CODIGODOCUMENTO", nullable=false, length=20)
    public String getCodigodocumento() {
        return this.codigodocumento;
    }
    
    public void setCodigodocumento(String codigodocumento) {
        this.codigodocumento = codigodocumento;
    }
    
    @Column(name="TITULO", length=300)
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    @Column(name="DESCRIPCION", length=500)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="FECHADOCUMENTO", length=23)
    public Date getFechadocumento() {
        return this.fechadocumento;
    }
    
    public void setFechadocumento(Date fechadocumento) {
        this.fechadocumento = fechadocumento;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="FECHAREGISTRO", length=23)
    public Date getFecharegistro() {
        return this.fecharegistro;
    }
    
    public void setFecharegistro(Date fecharegistro) {
        this.fecharegistro = fecharegistro;
    }
    
    @Column(name="NUMEROFOLIO", length=10)
    public String getNumerofolio() {
        return this.numerofolio;
    }
    
    public void setNumerofolio(String numerofolio) {
        this.numerofolio = numerofolio;
    }
    
    @Column(name="NUMEROEXPEDIENTE", length=50)
    public String getNumeroexpediente() {
        return this.numeroexpediente;
    }
    
    public void setNumeroexpediente(String numeroexpediente) {
        this.numeroexpediente = numeroexpediente;
    }
    
    @Column(name="NOMBREREMITENTE", length=100)
    public String getNombreremitente() {
        return this.nombreremitente;
    }
    
    public void setNombreremitente(String nombreremitente) {
        this.nombreremitente = nombreremitente;
    }
    
    @Column(name="ESTADO", length=20)
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    @Column(name="ESTADODGAI", length=10)
    public String getEstadodgai() {
        return this.estadodgai;
    }
    
    public void setEstadodgai(String estadodgai) {
        this.estadodgai = estadodgai;
    }
    
    
    
    @Column(name="RESPUESTA", length=20)
    public String getRespuesta() {
        return this.respuesta;
    }
    
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    
    @Column(name="ASUNTO", length=50)
    public String getAsunto() {
        return this.asunto;
    }
    
    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }
    
    @Column(name="IDACCION")
    public Integer getIdaccion() {
        return this.idaccion;
    }
    
    public void setIdaccion(Integer idaccion) {
        this.idaccion = idaccion;
    }
    
    @Column(name="IDASUNTO")
    public Integer getIdasunto() {
        return this.idasunto;
    }
    
    public void setIdasunto(Integer idasunto) {
        this.idasunto = idasunto;
    }
    
    @Column(name="IDESTADO")
    public Integer getIdestado() {
        return this.idestado;
    }
    
    public void setIdestado(Integer idestado) {
        this.idestado = idestado;
    }
    
    @Column(name="IDREMITENTE")
    public Integer getIdremitente() {
        return this.idremitente;
    }
    
    public void setIdremitente(Integer idremitente) {
        this.idremitente = idremitente;
    }
    
    @Column(name="IDTIPODOCUMENTO")
    public Integer getIdtipodocumento() {
        return this.idtipodocumento;
    }
    
    public void setIdtipodocumento(Integer idtipodocumento) {
        this.idtipodocumento = idtipodocumento;
    }
    
    @Column(name="COMENTARIO", length=100)
    public String getComentario() {
        return this.comentario;
    }
    
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="documento")
    public Set<Archivodocumento> getArchivodocumentos() {
        return this.archivodocumentos;
    }
    
    public void setArchivodocumentos(Set<Archivodocumento> archivodocumentos) {
        this.archivodocumentos = archivodocumentos;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="documento")
    public Set<Flujodocumento> getFlujodocumentos() {
        return this.flujodocumentos;
    }
    
    public void setFlujodocumentos(Set<Flujodocumento> flujodocumentos) {
        this.flujodocumentos = flujodocumentos;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="FECHADERIVACIONDGAI", length=23)
	public Date getFechaderivaciondgai() {
		return fechaderivaciondgai;
	}


	public void setFechaderivaciondgai(Date fechaderivaciondgai) {
		this.fechaderivaciondgai = fechaderivaciondgai;
	}

	  @Temporal(TemporalType.TIMESTAMP)
	    @Column(name="FECHARESPUESTADGAI", length=23)
	public Date getFecharespuestadgai() {
		return fecharespuestadgai;
	}


	public void setFecharespuestadgai(Date fecharespuestadgai) {
		this.fecharespuestadgai = fecharespuestadgai;
	}

	  @Temporal(TemporalType.TIMESTAMP)
	    @Column(name="FECHAAPROBACIONRECHAZO", length=23)
	public Date getFechaaprobacionrechazo() {
		return fechaaprobacionrechazo;
	}


	public void setFechaaprobacionrechazo(Date fechaaprobacionrechazo) {
		this.fechaaprobacionrechazo = fechaaprobacionrechazo;
	}

}
