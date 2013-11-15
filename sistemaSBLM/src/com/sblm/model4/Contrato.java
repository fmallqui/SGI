package com.sblm.model4;

// Generated 06-nov-2013 11:43:21 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
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
 * Contrato generated by hbm2java
 */
@Entity
@Table(name = "CONTRATO", schema = "dbo", catalog = "beneficenciadba")
public class Contrato implements java.io.Serializable {

	private int idcontrato;
	private Inquilino inquilino;
	private Representante representanteByIdrepresentanteaval;
	private Representante representanteByIdrepresentante;
	private Institucion institucion;
	private Upa upa;
	private Cliente cliente;
	private String tipo;
	private Double montosolesgarantia;
	private Double montodolargarantia;
	private Double plazomeses;
	private Date iniciocontrato;
	private Date fincontrato;
	private String nrocontrato;
	private Integer aniocontrato;
	private String usoespecifico;
	private Double montototalsoles;
	private Double montototaldolar;
	private Integer numerocuotas;
	private String clave;
	private Double montocuotasoles;
	private Double montocuotadolar;
	private String tipomoneda;
	private Boolean siocupante;
	private String sinombreocupante;
	private Boolean siresolucion;
	private String factrenovacion;
	private Boolean sisuscrito;
	private Date sifechasuscrito;
	private Boolean siactaentrega;
	private Date sifechaactaentrega;
	private String estado;
	private String resolucioninstitucion;
	private Date fechacreacion;
	private Date fechamodificacion;
	private String usuariocreador;
	private String usuariomodificador;
	private String aval;
	private String tipoaval;
	private String telefonoaval;
	private String motivorechazo;
	private Set<Arbitrio> arbitrios = new HashSet<Arbitrio>(0);
	private Set<Carta> cartas = new HashSet<Carta>(0);
	private Set<Cuota> cuotas = new HashSet<Cuota>(0);
	private Set<Detallecartera> detallecarteras = new HashSet<Detallecartera>(0);

	public Contrato() {
	}

	public Contrato(int idcontrato) {
		this.idcontrato = idcontrato;
	}

	public Contrato(int idcontrato, Inquilino inquilino,
			Representante representanteByIdrepresentanteaval,
			Representante representanteByIdrepresentante,
			Institucion institucion, Upa upa, Cliente cliente, String tipo,
			Double montosolesgarantia, Double montodolargarantia,
			Double plazomeses, Date iniciocontrato, Date fincontrato,
			String nrocontrato, Integer aniocontrato, String usoespecifico,
			Double montototalsoles, Double montototaldolar,
			Integer numerocuotas, String clave, Double montocuotasoles,
			Double montocuotadolar, String tipomoneda, Boolean siocupante,
			String sinombreocupante, Boolean siresolucion,
			String factrenovacion, Boolean sisuscrito, Date sifechasuscrito,
			Boolean siactaentrega, Date sifechaactaentrega, String estado,
			String resolucioninstitucion, Date fechacreacion,
			Date fechamodificacion, String usuariocreador,
			String usuariomodificador, String aval, String tipoaval,
			String telefonoaval, String motivorechazo, Set<Arbitrio> arbitrios,
			Set<Carta> cartas, Set<Cuota> cuotas,
			Set<Detallecartera> detallecarteras) {
		this.idcontrato = idcontrato;
		this.inquilino = inquilino;
		this.representanteByIdrepresentanteaval = representanteByIdrepresentanteaval;
		this.representanteByIdrepresentante = representanteByIdrepresentante;
		this.institucion = institucion;
		this.upa = upa;
		this.cliente = cliente;
		this.tipo = tipo;
		this.montosolesgarantia = montosolesgarantia;
		this.montodolargarantia = montodolargarantia;
		this.plazomeses = plazomeses;
		this.iniciocontrato = iniciocontrato;
		this.fincontrato = fincontrato;
		this.nrocontrato = nrocontrato;
		this.aniocontrato = aniocontrato;
		this.usoespecifico = usoespecifico;
		this.montototalsoles = montototalsoles;
		this.montototaldolar = montototaldolar;
		this.numerocuotas = numerocuotas;
		this.clave = clave;
		this.montocuotasoles = montocuotasoles;
		this.montocuotadolar = montocuotadolar;
		this.tipomoneda = tipomoneda;
		this.siocupante = siocupante;
		this.sinombreocupante = sinombreocupante;
		this.siresolucion = siresolucion;
		this.factrenovacion = factrenovacion;
		this.sisuscrito = sisuscrito;
		this.sifechasuscrito = sifechasuscrito;
		this.siactaentrega = siactaentrega;
		this.sifechaactaentrega = sifechaactaentrega;
		this.estado = estado;
		this.resolucioninstitucion = resolucioninstitucion;
		this.fechacreacion = fechacreacion;
		this.fechamodificacion = fechamodificacion;
		this.usuariocreador = usuariocreador;
		this.usuariomodificador = usuariomodificador;
		this.aval = aval;
		this.tipoaval = tipoaval;
		this.telefonoaval = telefonoaval;
		this.motivorechazo = motivorechazo;
		this.arbitrios = arbitrios;
		this.cartas = cartas;
		this.cuotas = cuotas;
		this.detallecarteras = detallecarteras;
	}

	@Id
	@Column(name = "IDCONTRATO", unique = true, nullable = false)
	public int getIdcontrato() {
		return this.idcontrato;
	}

	public void setIdcontrato(int idcontrato) {
		this.idcontrato = idcontrato;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDINQUILINO")
	public Inquilino getInquilino() {
		return this.inquilino;
	}

	public void setInquilino(Inquilino inquilino) {
		this.inquilino = inquilino;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDREPRESENTANTEAVAL")
	public Representante getRepresentanteByIdrepresentanteaval() {
		return this.representanteByIdrepresentanteaval;
	}

	public void setRepresentanteByIdrepresentanteaval(
			Representante representanteByIdrepresentanteaval) {
		this.representanteByIdrepresentanteaval = representanteByIdrepresentanteaval;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDREPRESENTANTE")
	public Representante getRepresentanteByIdrepresentante() {
		return this.representanteByIdrepresentante;
	}

	public void setRepresentanteByIdrepresentante(
			Representante representanteByIdrepresentante) {
		this.representanteByIdrepresentante = representanteByIdrepresentante;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDINSTITUCION")
	public Institucion getInstitucion() {
		return this.institucion;
	}

	public void setInstitucion(Institucion institucion) {
		this.institucion = institucion;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDUPA")
	public Upa getUpa() {
		return this.upa;
	}

	public void setUpa(Upa upa) {
		this.upa = upa;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDCLIENTE")
	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Column(name = "TIPO", length = 20)
	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Column(name = "MONTOSOLESGARANTIA", precision = 53, scale = 0)
	public Double getMontosolesgarantia() {
		return this.montosolesgarantia;
	}

	public void setMontosolesgarantia(Double montosolesgarantia) {
		this.montosolesgarantia = montosolesgarantia;
	}

	@Column(name = "MONTODOLARGARANTIA", precision = 53, scale = 0)
	public Double getMontodolargarantia() {
		return this.montodolargarantia;
	}

	public void setMontodolargarantia(Double montodolargarantia) {
		this.montodolargarantia = montodolargarantia;
	}

	@Column(name = "PLAZOMESES", precision = 53, scale = 0)
	public Double getPlazomeses() {
		return this.plazomeses;
	}

	public void setPlazomeses(Double plazomeses) {
		this.plazomeses = plazomeses;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "INICIOCONTRATO", length = 23)
	public Date getIniciocontrato() {
		return this.iniciocontrato;
	}

	public void setIniciocontrato(Date iniciocontrato) {
		this.iniciocontrato = iniciocontrato;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FINCONTRATO", length = 23)
	public Date getFincontrato() {
		return this.fincontrato;
	}

	public void setFincontrato(Date fincontrato) {
		this.fincontrato = fincontrato;
	}

	@Column(name = "NROCONTRATO", length = 15)
	public String getNrocontrato() {
		return this.nrocontrato;
	}

	public void setNrocontrato(String nrocontrato) {
		this.nrocontrato = nrocontrato;
	}

	@Column(name = "ANIOCONTRATO")
	public Integer getAniocontrato() {
		return this.aniocontrato;
	}

	public void setAniocontrato(Integer aniocontrato) {
		this.aniocontrato = aniocontrato;
	}

	@Column(name = "USOESPECIFICO", length = 100)
	public String getUsoespecifico() {
		return this.usoespecifico;
	}

	public void setUsoespecifico(String usoespecifico) {
		this.usoespecifico = usoespecifico;
	}

	@Column(name = "MONTOTOTALSOLES", precision = 53, scale = 0)
	public Double getMontototalsoles() {
		return this.montototalsoles;
	}

	public void setMontototalsoles(Double montototalsoles) {
		this.montototalsoles = montototalsoles;
	}

	@Column(name = "MONTOTOTALDOLAR", precision = 53, scale = 0)
	public Double getMontototaldolar() {
		return this.montototaldolar;
	}

	public void setMontototaldolar(Double montototaldolar) {
		this.montototaldolar = montototaldolar;
	}

	@Column(name = "NUMEROCUOTAS")
	public Integer getNumerocuotas() {
		return this.numerocuotas;
	}

	public void setNumerocuotas(Integer numerocuotas) {
		this.numerocuotas = numerocuotas;
	}

	@Column(name = "CLAVE", length = 15)
	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	@Column(name = "MONTOCUOTASOLES", precision = 53, scale = 0)
	public Double getMontocuotasoles() {
		return this.montocuotasoles;
	}

	public void setMontocuotasoles(Double montocuotasoles) {
		this.montocuotasoles = montocuotasoles;
	}

	@Column(name = "MONTOCUOTADOLAR", precision = 53, scale = 0)
	public Double getMontocuotadolar() {
		return this.montocuotadolar;
	}

	public void setMontocuotadolar(Double montocuotadolar) {
		this.montocuotadolar = montocuotadolar;
	}

	@Column(name = "TIPOMONEDA", length = 10)
	public String getTipomoneda() {
		return this.tipomoneda;
	}

	public void setTipomoneda(String tipomoneda) {
		this.tipomoneda = tipomoneda;
	}

	@Column(name = "SIOCUPANTE")
	public Boolean getSiocupante() {
		return this.siocupante;
	}

	public void setSiocupante(Boolean siocupante) {
		this.siocupante = siocupante;
	}

	@Column(name = "SINOMBREOCUPANTE", length = 50)
	public String getSinombreocupante() {
		return this.sinombreocupante;
	}

	public void setSinombreocupante(String sinombreocupante) {
		this.sinombreocupante = sinombreocupante;
	}

	@Column(name = "SIRESOLUCION")
	public Boolean getSiresolucion() {
		return this.siresolucion;
	}

	public void setSiresolucion(Boolean siresolucion) {
		this.siresolucion = siresolucion;
	}

	@Column(name = "FACTRENOVACION", length = 100)
	public String getFactrenovacion() {
		return this.factrenovacion;
	}

	public void setFactrenovacion(String factrenovacion) {
		this.factrenovacion = factrenovacion;
	}

	@Column(name = "SISUSCRITO")
	public Boolean getSisuscrito() {
		return this.sisuscrito;
	}

	public void setSisuscrito(Boolean sisuscrito) {
		this.sisuscrito = sisuscrito;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SIFECHASUSCRITO", length = 23)
	public Date getSifechasuscrito() {
		return this.sifechasuscrito;
	}

	public void setSifechasuscrito(Date sifechasuscrito) {
		this.sifechasuscrito = sifechasuscrito;
	}

	@Column(name = "SIACTAENTREGA")
	public Boolean getSiactaentrega() {
		return this.siactaentrega;
	}

	public void setSiactaentrega(Boolean siactaentrega) {
		this.siactaentrega = siactaentrega;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SIFECHAACTAENTREGA", length = 23)
	public Date getSifechaactaentrega() {
		return this.sifechaactaentrega;
	}

	public void setSifechaactaentrega(Date sifechaactaentrega) {
		this.sifechaactaentrega = sifechaactaentrega;
	}

	@Column(name = "ESTADO", length = 10)
	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Column(name = "RESOLUCIONINSTITUCION", length = 100)
	public String getResolucioninstitucion() {
		return this.resolucioninstitucion;
	}

	public void setResolucioninstitucion(String resolucioninstitucion) {
		this.resolucioninstitucion = resolucioninstitucion;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FECHACREACION", length = 23)
	public Date getFechacreacion() {
		return this.fechacreacion;
	}

	public void setFechacreacion(Date fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FECHAMODIFICACION", length = 23)
	public Date getFechamodificacion() {
		return this.fechamodificacion;
	}

	public void setFechamodificacion(Date fechamodificacion) {
		this.fechamodificacion = fechamodificacion;
	}

	@Column(name = "USUARIOCREADOR", length = 100)
	public String getUsuariocreador() {
		return this.usuariocreador;
	}

	public void setUsuariocreador(String usuariocreador) {
		this.usuariocreador = usuariocreador;
	}

	@Column(name = "USUARIOMODIFICADOR", length = 100)
	public String getUsuariomodificador() {
		return this.usuariomodificador;
	}

	public void setUsuariomodificador(String usuariomodificador) {
		this.usuariomodificador = usuariomodificador;
	}

	@Column(name = "AVAL", length = 100)
	public String getAval() {
		return this.aval;
	}

	public void setAval(String aval) {
		this.aval = aval;
	}

	@Column(name = "TIPOAVAL", length = 50)
	public String getTipoaval() {
		return this.tipoaval;
	}

	public void setTipoaval(String tipoaval) {
		this.tipoaval = tipoaval;
	}

	@Column(name = "TELEFONOAVAL", length = 20)
	public String getTelefonoaval() {
		return this.telefonoaval;
	}

	public void setTelefonoaval(String telefonoaval) {
		this.telefonoaval = telefonoaval;
	}

	@Column(name = "MOTIVORECHAZO", length = 200)
	public String getMotivorechazo() {
		return this.motivorechazo;
	}

	public void setMotivorechazo(String motivorechazo) {
		this.motivorechazo = motivorechazo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "contrato")
	public Set<Arbitrio> getArbitrios() {
		return this.arbitrios;
	}

	public void setArbitrios(Set<Arbitrio> arbitrios) {
		this.arbitrios = arbitrios;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "contrato")
	public Set<Carta> getCartas() {
		return this.cartas;
	}

	public void setCartas(Set<Carta> cartas) {
		this.cartas = cartas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "contrato")
	public Set<Cuota> getCuotas() {
		return this.cuotas;
	}

	public void setCuotas(Set<Cuota> cuotas) {
		this.cuotas = cuotas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "contrato")
	public Set<Detallecartera> getDetallecarteras() {
		return this.detallecarteras;
	}

	public void setDetallecarteras(Set<Detallecartera> detallecarteras) {
		this.detallecarteras = detallecarteras;
	}

}