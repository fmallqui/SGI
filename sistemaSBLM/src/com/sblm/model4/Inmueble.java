package com.sblm.model4;

// Generated 06-nov-2013 11:43:21 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
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
 * Inmueble generated by hbm2java
 */
@Entity
@Table(name = "INMUEBLE", schema = "dbo", catalog = "beneficenciadba")
public class Inmueble implements java.io.Serializable {

	private int idinmueble;
	private Tipovia tipovia;
	private Materialpredominante materialpredominante;
	private Titularidad titularidad;
	private Tipointerior tipointerior;
	private Ubigeo ubigeo;
	private Tipotitularidad tipotitularidad;
	private String clave;
	private String numregistrosbn;
	private String denominacion;
	private String nombrevia;
	private String direccion;
	private String numeroprincipal;
	private String numerogrupal;
	private String zona;
	private String sector;
	private String manzana;
	private String lote;
	private String etapa;
	private String sublote;
	private String numnombreinterior;
	private String nombrenumzona;
	private String nombrenumsector;
	private String nombrenumetapa;
	private String referenciainmueble;
	private String ubicacionpiso;
	private String nombretitular;
	private String tipomonumento;
	private String resolucion;
	private Date fecharesolucion;
	private String asiento;
	private String fojas;
	private String partidaelectronica;
	private String tomo;
	private String ficha;
	private String partidaregistral;
	private Date fechainscripcion;
	private Boolean opcsaneamiento;
	private String situacion;
	private String idensituacioninmueble;
	private String idenmaterialestrucpredom;
	private String anhoconstruccion;
	private Integer numpisos;
	private BigDecimal areaterreno;
	private BigDecimal areaconstruida;
	private Boolean opcpartidaregistral;
	private Boolean opcplanoperimetrico;
	private Boolean opcplanoubicacion;
	private Boolean opcmemoriadescrip;
	private Boolean opcfotos;
	private Boolean opctasacion;
	private Date fechatasacion;
	private BigDecimal valorterreno;
	private BigDecimal valoredificacion;
	private BigDecimal valorobracomplementaria;
	private BigDecimal valorcomercial;
	private String monedavalorterreno;
	private String monedavaloredificacion;
	private String monedavalorobracomple;
	private String monedavalorcomercial;
	private Boolean opcinmuebledatodepurado;
	private Boolean opcinmueblehabilitado;
	private String usrcre;
	private String usrmod;
	private Date fechcre;
	private Date fechmod;
	private String nombrehabilitacionurbana;
	private Boolean habilitacionurbana;
	private String codigopredio;
	private Integer idhabilitacionurbana;
	private String urbanizacion;
	private Integer idtipohabilitacionurbana;
	private Set<Upa> upas = new HashSet<Upa>(0);
	private Set<Detallecartera> detallecarteras = new HashSet<Detallecartera>(0);
	private Set<Archivodocumento> archivodocumentos = new HashSet<Archivodocumento>(
			0);

	public Inmueble() {
	}

	public Inmueble(int idinmueble) {
		this.idinmueble = idinmueble;
	}

	public Inmueble(int idinmueble, Tipovia tipovia,
			Materialpredominante materialpredominante, Titularidad titularidad,
			Tipointerior tipointerior, Ubigeo ubigeo,
			Tipotitularidad tipotitularidad, String clave,
			String numregistrosbn, String denominacion, String nombrevia,
			String direccion, String numeroprincipal, String numerogrupal,
			String zona, String sector, String manzana, String lote,
			String etapa, String sublote, String numnombreinterior,
			String nombrenumzona, String nombrenumsector,
			String nombrenumetapa, String referenciainmueble,
			String ubicacionpiso, String nombretitular, String tipomonumento,
			String resolucion, Date fecharesolucion, String asiento,
			String fojas, String partidaelectronica, String tomo, String ficha,
			String partidaregistral, Date fechainscripcion,
			Boolean opcsaneamiento, String situacion,
			String idensituacioninmueble, String idenmaterialestrucpredom,
			String anhoconstruccion, Integer numpisos, BigDecimal areaterreno,
			BigDecimal areaconstruida, Boolean opcpartidaregistral,
			Boolean opcplanoperimetrico, Boolean opcplanoubicacion,
			Boolean opcmemoriadescrip, Boolean opcfotos, Boolean opctasacion,
			Date fechatasacion, BigDecimal valorterreno,
			BigDecimal valoredificacion, BigDecimal valorobracomplementaria,
			BigDecimal valorcomercial, String monedavalorterreno,
			String monedavaloredificacion, String monedavalorobracomple,
			String monedavalorcomercial, Boolean opcinmuebledatodepurado,
			Boolean opcinmueblehabilitado, String usrcre, String usrmod,
			Date fechcre, Date fechmod, String nombrehabilitacionurbana,
			Boolean habilitacionurbana, String codigopredio,
			Integer idhabilitacionurbana, String urbanizacion,
			Integer idtipohabilitacionurbana, Set<Upa> upas,
			Set<Detallecartera> detallecarteras,
			Set<Archivodocumento> archivodocumentos) {
		this.idinmueble = idinmueble;
		this.tipovia = tipovia;
		this.materialpredominante = materialpredominante;
		this.titularidad = titularidad;
		this.tipointerior = tipointerior;
		this.ubigeo = ubigeo;
		this.tipotitularidad = tipotitularidad;
		this.clave = clave;
		this.numregistrosbn = numregistrosbn;
		this.denominacion = denominacion;
		this.nombrevia = nombrevia;
		this.direccion = direccion;
		this.numeroprincipal = numeroprincipal;
		this.numerogrupal = numerogrupal;
		this.zona = zona;
		this.sector = sector;
		this.manzana = manzana;
		this.lote = lote;
		this.etapa = etapa;
		this.sublote = sublote;
		this.numnombreinterior = numnombreinterior;
		this.nombrenumzona = nombrenumzona;
		this.nombrenumsector = nombrenumsector;
		this.nombrenumetapa = nombrenumetapa;
		this.referenciainmueble = referenciainmueble;
		this.ubicacionpiso = ubicacionpiso;
		this.nombretitular = nombretitular;
		this.tipomonumento = tipomonumento;
		this.resolucion = resolucion;
		this.fecharesolucion = fecharesolucion;
		this.asiento = asiento;
		this.fojas = fojas;
		this.partidaelectronica = partidaelectronica;
		this.tomo = tomo;
		this.ficha = ficha;
		this.partidaregistral = partidaregistral;
		this.fechainscripcion = fechainscripcion;
		this.opcsaneamiento = opcsaneamiento;
		this.situacion = situacion;
		this.idensituacioninmueble = idensituacioninmueble;
		this.idenmaterialestrucpredom = idenmaterialestrucpredom;
		this.anhoconstruccion = anhoconstruccion;
		this.numpisos = numpisos;
		this.areaterreno = areaterreno;
		this.areaconstruida = areaconstruida;
		this.opcpartidaregistral = opcpartidaregistral;
		this.opcplanoperimetrico = opcplanoperimetrico;
		this.opcplanoubicacion = opcplanoubicacion;
		this.opcmemoriadescrip = opcmemoriadescrip;
		this.opcfotos = opcfotos;
		this.opctasacion = opctasacion;
		this.fechatasacion = fechatasacion;
		this.valorterreno = valorterreno;
		this.valoredificacion = valoredificacion;
		this.valorobracomplementaria = valorobracomplementaria;
		this.valorcomercial = valorcomercial;
		this.monedavalorterreno = monedavalorterreno;
		this.monedavaloredificacion = monedavaloredificacion;
		this.monedavalorobracomple = monedavalorobracomple;
		this.monedavalorcomercial = monedavalorcomercial;
		this.opcinmuebledatodepurado = opcinmuebledatodepurado;
		this.opcinmueblehabilitado = opcinmueblehabilitado;
		this.usrcre = usrcre;
		this.usrmod = usrmod;
		this.fechcre = fechcre;
		this.fechmod = fechmod;
		this.nombrehabilitacionurbana = nombrehabilitacionurbana;
		this.habilitacionurbana = habilitacionurbana;
		this.codigopredio = codigopredio;
		this.idhabilitacionurbana = idhabilitacionurbana;
		this.urbanizacion = urbanizacion;
		this.idtipohabilitacionurbana = idtipohabilitacionurbana;
		this.upas = upas;
		this.detallecarteras = detallecarteras;
		this.archivodocumentos = archivodocumentos;
	}

	@Id
	@Column(name = "IDINMUEBLE", unique = true, nullable = false)
	public int getIdinmueble() {
		return this.idinmueble;
	}

	public void setIdinmueble(int idinmueble) {
		this.idinmueble = idinmueble;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDTIPOVIA")
	public Tipovia getTipovia() {
		return this.tipovia;
	}

	public void setTipovia(Tipovia tipovia) {
		this.tipovia = tipovia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDMATERIALPREDOMINANTE")
	public Materialpredominante getMaterialpredominante() {
		return this.materialpredominante;
	}

	public void setMaterialpredominante(
			Materialpredominante materialpredominante) {
		this.materialpredominante = materialpredominante;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDTITULARIDAD")
	public Titularidad getTitularidad() {
		return this.titularidad;
	}

	public void setTitularidad(Titularidad titularidad) {
		this.titularidad = titularidad;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDTIPOINTERIOR")
	public Tipointerior getTipointerior() {
		return this.tipointerior;
	}

	public void setTipointerior(Tipointerior tipointerior) {
		this.tipointerior = tipointerior;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UBIGEO")
	public Ubigeo getUbigeo() {
		return this.ubigeo;
	}

	public void setUbigeo(Ubigeo ubigeo) {
		this.ubigeo = ubigeo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDTIPOTITULARIDAD")
	public Tipotitularidad getTipotitularidad() {
		return this.tipotitularidad;
	}

	public void setTipotitularidad(Tipotitularidad tipotitularidad) {
		this.tipotitularidad = tipotitularidad;
	}

	@Column(name = "CLAVE", length = 11)
	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	@Column(name = "NUMREGISTROSBN", length = 10)
	public String getNumregistrosbn() {
		return this.numregistrosbn;
	}

	public void setNumregistrosbn(String numregistrosbn) {
		this.numregistrosbn = numregistrosbn;
	}

	@Column(name = "DENOMINACION", length = 100)
	public String getDenominacion() {
		return this.denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	@Column(name = "NOMBREVIA", length = 100)
	public String getNombrevia() {
		return this.nombrevia;
	}

	public void setNombrevia(String nombrevia) {
		this.nombrevia = nombrevia;
	}

	@Column(name = "DIRECCION", length = 100)
	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Column(name = "NUMEROPRINCIPAL", length = 50)
	public String getNumeroprincipal() {
		return this.numeroprincipal;
	}

	public void setNumeroprincipal(String numeroprincipal) {
		this.numeroprincipal = numeroprincipal;
	}

	@Column(name = "NUMEROGRUPAL", length = 50)
	public String getNumerogrupal() {
		return this.numerogrupal;
	}

	public void setNumerogrupal(String numerogrupal) {
		this.numerogrupal = numerogrupal;
	}

	@Column(name = "ZONA", length = 100)
	public String getZona() {
		return this.zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	@Column(name = "SECTOR", length = 100)
	public String getSector() {
		return this.sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	@Column(name = "MANZANA", length = 10)
	public String getManzana() {
		return this.manzana;
	}

	public void setManzana(String manzana) {
		this.manzana = manzana;
	}

	@Column(name = "LOTE", length = 10)
	public String getLote() {
		return this.lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	@Column(name = "ETAPA", length = 20)
	public String getEtapa() {
		return this.etapa;
	}

	public void setEtapa(String etapa) {
		this.etapa = etapa;
	}

	@Column(name = "SUBLOTE", length = 10)
	public String getSublote() {
		return this.sublote;
	}

	public void setSublote(String sublote) {
		this.sublote = sublote;
	}

	@Column(name = "NUMNOMBREINTERIOR", length = 20)
	public String getNumnombreinterior() {
		return this.numnombreinterior;
	}

	public void setNumnombreinterior(String numnombreinterior) {
		this.numnombreinterior = numnombreinterior;
	}

	@Column(name = "NOMBRENUMZONA", length = 20)
	public String getNombrenumzona() {
		return this.nombrenumzona;
	}

	public void setNombrenumzona(String nombrenumzona) {
		this.nombrenumzona = nombrenumzona;
	}

	@Column(name = "NOMBRENUMSECTOR", length = 20)
	public String getNombrenumsector() {
		return this.nombrenumsector;
	}

	public void setNombrenumsector(String nombrenumsector) {
		this.nombrenumsector = nombrenumsector;
	}

	@Column(name = "NOMBRENUMETAPA", length = 20)
	public String getNombrenumetapa() {
		return this.nombrenumetapa;
	}

	public void setNombrenumetapa(String nombrenumetapa) {
		this.nombrenumetapa = nombrenumetapa;
	}

	@Column(name = "REFERENCIAINMUEBLE", length = 100)
	public String getReferenciainmueble() {
		return this.referenciainmueble;
	}

	public void setReferenciainmueble(String referenciainmueble) {
		this.referenciainmueble = referenciainmueble;
	}

	@Column(name = "UBICACIONPISO", length = 10)
	public String getUbicacionpiso() {
		return this.ubicacionpiso;
	}

	public void setUbicacionpiso(String ubicacionpiso) {
		this.ubicacionpiso = ubicacionpiso;
	}

	@Column(name = "NOMBRETITULAR", length = 100)
	public String getNombretitular() {
		return this.nombretitular;
	}

	public void setNombretitular(String nombretitular) {
		this.nombretitular = nombretitular;
	}

	@Column(name = "TIPOMONUMENTO", length = 10)
	public String getTipomonumento() {
		return this.tipomonumento;
	}

	public void setTipomonumento(String tipomonumento) {
		this.tipomonumento = tipomonumento;
	}

	@Column(name = "RESOLUCION", length = 100)
	public String getResolucion() {
		return this.resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FECHARESOLUCION", length = 23)
	public Date getFecharesolucion() {
		return this.fecharesolucion;
	}

	public void setFecharesolucion(Date fecharesolucion) {
		this.fecharesolucion = fecharesolucion;
	}

	@Column(name = "ASIENTO", length = 10)
	public String getAsiento() {
		return this.asiento;
	}

	public void setAsiento(String asiento) {
		this.asiento = asiento;
	}

	@Column(name = "FOJAS", length = 10)
	public String getFojas() {
		return this.fojas;
	}

	public void setFojas(String fojas) {
		this.fojas = fojas;
	}

	@Column(name = "PARTIDAELECTRONICA", length = 100)
	public String getPartidaelectronica() {
		return this.partidaelectronica;
	}

	public void setPartidaelectronica(String partidaelectronica) {
		this.partidaelectronica = partidaelectronica;
	}

	@Column(name = "TOMO", length = 10)
	public String getTomo() {
		return this.tomo;
	}

	public void setTomo(String tomo) {
		this.tomo = tomo;
	}

	@Column(name = "FICHA", length = 20)
	public String getFicha() {
		return this.ficha;
	}

	public void setFicha(String ficha) {
		this.ficha = ficha;
	}

	@Column(name = "PARTIDAREGISTRAL", length = 20)
	public String getPartidaregistral() {
		return this.partidaregistral;
	}

	public void setPartidaregistral(String partidaregistral) {
		this.partidaregistral = partidaregistral;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FECHAINSCRIPCION", length = 23)
	public Date getFechainscripcion() {
		return this.fechainscripcion;
	}

	public void setFechainscripcion(Date fechainscripcion) {
		this.fechainscripcion = fechainscripcion;
	}

	@Column(name = "OPCSANEAMIENTO")
	public Boolean getOpcsaneamiento() {
		return this.opcsaneamiento;
	}

	public void setOpcsaneamiento(Boolean opcsaneamiento) {
		this.opcsaneamiento = opcsaneamiento;
	}

	@Column(name = "SITUACION", length = 200)
	public String getSituacion() {
		return this.situacion;
	}

	public void setSituacion(String situacion) {
		this.situacion = situacion;
	}

	@Column(name = "IDENSITUACIONINMUEBLE", length = 10)
	public String getIdensituacioninmueble() {
		return this.idensituacioninmueble;
	}

	public void setIdensituacioninmueble(String idensituacioninmueble) {
		this.idensituacioninmueble = idensituacioninmueble;
	}

	@Column(name = "IDENMATERIALESTRUCPREDOM", length = 10)
	public String getIdenmaterialestrucpredom() {
		return this.idenmaterialestrucpredom;
	}

	public void setIdenmaterialestrucpredom(String idenmaterialestrucpredom) {
		this.idenmaterialestrucpredom = idenmaterialestrucpredom;
	}

	@Column(name = "ANHOCONSTRUCCION", length = 5)
	public String getAnhoconstruccion() {
		return this.anhoconstruccion;
	}

	public void setAnhoconstruccion(String anhoconstruccion) {
		this.anhoconstruccion = anhoconstruccion;
	}

	@Column(name = "NUMPISOS")
	public Integer getNumpisos() {
		return this.numpisos;
	}

	public void setNumpisos(Integer numpisos) {
		this.numpisos = numpisos;
	}

	@Column(name = "AREATERRENO", precision = 9)
	public BigDecimal getAreaterreno() {
		return this.areaterreno;
	}

	public void setAreaterreno(BigDecimal areaterreno) {
		this.areaterreno = areaterreno;
	}

	@Column(name = "AREACONSTRUIDA", precision = 9)
	public BigDecimal getAreaconstruida() {
		return this.areaconstruida;
	}

	public void setAreaconstruida(BigDecimal areaconstruida) {
		this.areaconstruida = areaconstruida;
	}

	@Column(name = "OPCPARTIDAREGISTRAL")
	public Boolean getOpcpartidaregistral() {
		return this.opcpartidaregistral;
	}

	public void setOpcpartidaregistral(Boolean opcpartidaregistral) {
		this.opcpartidaregistral = opcpartidaregistral;
	}

	@Column(name = "OPCPLANOPERIMETRICO")
	public Boolean getOpcplanoperimetrico() {
		return this.opcplanoperimetrico;
	}

	public void setOpcplanoperimetrico(Boolean opcplanoperimetrico) {
		this.opcplanoperimetrico = opcplanoperimetrico;
	}

	@Column(name = "OPCPLANOUBICACION")
	public Boolean getOpcplanoubicacion() {
		return this.opcplanoubicacion;
	}

	public void setOpcplanoubicacion(Boolean opcplanoubicacion) {
		this.opcplanoubicacion = opcplanoubicacion;
	}

	@Column(name = "OPCMEMORIADESCRIP")
	public Boolean getOpcmemoriadescrip() {
		return this.opcmemoriadescrip;
	}

	public void setOpcmemoriadescrip(Boolean opcmemoriadescrip) {
		this.opcmemoriadescrip = opcmemoriadescrip;
	}

	@Column(name = "OPCFOTOS")
	public Boolean getOpcfotos() {
		return this.opcfotos;
	}

	public void setOpcfotos(Boolean opcfotos) {
		this.opcfotos = opcfotos;
	}

	@Column(name = "OPCTASACION")
	public Boolean getOpctasacion() {
		return this.opctasacion;
	}

	public void setOpctasacion(Boolean opctasacion) {
		this.opctasacion = opctasacion;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FECHATASACION", length = 23)
	public Date getFechatasacion() {
		return this.fechatasacion;
	}

	public void setFechatasacion(Date fechatasacion) {
		this.fechatasacion = fechatasacion;
	}

	@Column(name = "VALORTERRENO", precision = 9)
	public BigDecimal getValorterreno() {
		return this.valorterreno;
	}

	public void setValorterreno(BigDecimal valorterreno) {
		this.valorterreno = valorterreno;
	}

	@Column(name = "VALOREDIFICACION", precision = 9)
	public BigDecimal getValoredificacion() {
		return this.valoredificacion;
	}

	public void setValoredificacion(BigDecimal valoredificacion) {
		this.valoredificacion = valoredificacion;
	}

	@Column(name = "VALOROBRACOMPLEMENTARIA", precision = 9)
	public BigDecimal getValorobracomplementaria() {
		return this.valorobracomplementaria;
	}

	public void setValorobracomplementaria(BigDecimal valorobracomplementaria) {
		this.valorobracomplementaria = valorobracomplementaria;
	}

	@Column(name = "VALORCOMERCIAL", precision = 9)
	public BigDecimal getValorcomercial() {
		return this.valorcomercial;
	}

	public void setValorcomercial(BigDecimal valorcomercial) {
		this.valorcomercial = valorcomercial;
	}

	@Column(name = "MONEDAVALORTERRENO", length = 10)
	public String getMonedavalorterreno() {
		return this.monedavalorterreno;
	}

	public void setMonedavalorterreno(String monedavalorterreno) {
		this.monedavalorterreno = monedavalorterreno;
	}

	@Column(name = "MONEDAVALOREDIFICACION", length = 10)
	public String getMonedavaloredificacion() {
		return this.monedavaloredificacion;
	}

	public void setMonedavaloredificacion(String monedavaloredificacion) {
		this.monedavaloredificacion = monedavaloredificacion;
	}

	@Column(name = "MONEDAVALOROBRACOMPLE", length = 10)
	public String getMonedavalorobracomple() {
		return this.monedavalorobracomple;
	}

	public void setMonedavalorobracomple(String monedavalorobracomple) {
		this.monedavalorobracomple = monedavalorobracomple;
	}

	@Column(name = "MONEDAVALORCOMERCIAL", length = 10)
	public String getMonedavalorcomercial() {
		return this.monedavalorcomercial;
	}

	public void setMonedavalorcomercial(String monedavalorcomercial) {
		this.monedavalorcomercial = monedavalorcomercial;
	}

	@Column(name = "OPCINMUEBLEDATODEPURADO")
	public Boolean getOpcinmuebledatodepurado() {
		return this.opcinmuebledatodepurado;
	}

	public void setOpcinmuebledatodepurado(Boolean opcinmuebledatodepurado) {
		this.opcinmuebledatodepurado = opcinmuebledatodepurado;
	}

	@Column(name = "OPCINMUEBLEHABILITADO")
	public Boolean getOpcinmueblehabilitado() {
		return this.opcinmueblehabilitado;
	}

	public void setOpcinmueblehabilitado(Boolean opcinmueblehabilitado) {
		this.opcinmueblehabilitado = opcinmueblehabilitado;
	}

	@Column(name = "USRCRE", length = 50)
	public String getUsrcre() {
		return this.usrcre;
	}

	public void setUsrcre(String usrcre) {
		this.usrcre = usrcre;
	}

	@Column(name = "USRMOD", length = 50)
	public String getUsrmod() {
		return this.usrmod;
	}

	public void setUsrmod(String usrmod) {
		this.usrmod = usrmod;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FECHCRE", length = 23)
	public Date getFechcre() {
		return this.fechcre;
	}

	public void setFechcre(Date fechcre) {
		this.fechcre = fechcre;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FECHMOD", length = 23)
	public Date getFechmod() {
		return this.fechmod;
	}

	public void setFechmod(Date fechmod) {
		this.fechmod = fechmod;
	}

	@Column(name = "NOMBREHABILITACIONURBANA", length = 100)
	public String getNombrehabilitacionurbana() {
		return this.nombrehabilitacionurbana;
	}

	public void setNombrehabilitacionurbana(String nombrehabilitacionurbana) {
		this.nombrehabilitacionurbana = nombrehabilitacionurbana;
	}

	@Column(name = "HABILITACIONURBANA")
	public Boolean getHabilitacionurbana() {
		return this.habilitacionurbana;
	}

	public void setHabilitacionurbana(Boolean habilitacionurbana) {
		this.habilitacionurbana = habilitacionurbana;
	}

	@Column(name = "CODIGOPREDIO", length = 20)
	public String getCodigopredio() {
		return this.codigopredio;
	}

	public void setCodigopredio(String codigopredio) {
		this.codigopredio = codigopredio;
	}

	@Column(name = "IDHABILITACIONURBANA")
	public Integer getIdhabilitacionurbana() {
		return this.idhabilitacionurbana;
	}

	public void setIdhabilitacionurbana(Integer idhabilitacionurbana) {
		this.idhabilitacionurbana = idhabilitacionurbana;
	}

	@Column(name = "URBANIZACION", length = 100)
	public String getUrbanizacion() {
		return this.urbanizacion;
	}

	public void setUrbanizacion(String urbanizacion) {
		this.urbanizacion = urbanizacion;
	}

	@Column(name = "IDTIPOHABILITACIONURBANA")
	public Integer getIdtipohabilitacionurbana() {
		return this.idtipohabilitacionurbana;
	}

	public void setIdtipohabilitacionurbana(Integer idtipohabilitacionurbana) {
		this.idtipohabilitacionurbana = idtipohabilitacionurbana;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "inmueble")
	public Set<Upa> getUpas() {
		return this.upas;
	}

	public void setUpas(Set<Upa> upas) {
		this.upas = upas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "inmueble")
	public Set<Detallecartera> getDetallecarteras() {
		return this.detallecarteras;
	}

	public void setDetallecarteras(Set<Detallecartera> detallecarteras) {
		this.detallecarteras = detallecarteras;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "inmueble")
	public Set<Archivodocumento> getArchivodocumentos() {
		return this.archivodocumentos;
	}

	public void setArchivodocumentos(Set<Archivodocumento> archivodocumentos) {
		this.archivodocumentos = archivodocumentos;
	}

}
