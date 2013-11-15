package com.sblm.model;

// Generated 14-oct-2013 14:58:03 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
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
 * Modulo generated by hbm2java
 */
@Entity
@Table(name = "MODULO", schema = "dbo", catalog = "beneficenciadba")
public class Modulo implements java.io.Serializable {

	private int idmodulo;
	private String nombremodulo;
	private String estado;
	private Date feccre;
	private Date fecmod;
	private String usrcre;
	private String usrmod;
	private Boolean tipopermiso;
	private Set<Perfilmodulo> perfilmodulos = new HashSet<Perfilmodulo>(0);
	private Set<Auditoria> auditorias = new HashSet<Auditoria>(0);
	private Set<Paginamodulo> paginamodulos = new HashSet<Paginamodulo>(0);

	public Modulo() {
	}

	public Modulo(int idmodulo) {
		this.idmodulo = idmodulo;
	}

	public Modulo(int idmodulo, String nombremodulo, String estado,
			Date feccre, Date fecmod, String usrcre, String usrmod,
			Boolean tipopermiso, Set<Perfilmodulo> perfilmodulos,
			Set<Auditoria> auditorias, Set<Paginamodulo> paginamodulos) {
		this.idmodulo = idmodulo;
		this.nombremodulo = nombremodulo;
		this.estado = estado;
		this.feccre = feccre;
		this.fecmod = fecmod;
		this.usrcre = usrcre;
		this.usrmod = usrmod;
		this.tipopermiso = tipopermiso;
		this.perfilmodulos = perfilmodulos;
		this.auditorias = auditorias;
		this.paginamodulos = paginamodulos;
	}

	@Id @GeneratedValue
	@Column(name = "IDMODULO", unique = true, nullable = false)
	public int getIdmodulo() {
		return this.idmodulo;
	}

	public void setIdmodulo(int idmodulo) {
		this.idmodulo = idmodulo;
	}

	@Column(name = "NOMBREMODULO", length = 50)
	public String getNombremodulo() {
		return this.nombremodulo;
	}

	public void setNombremodulo(String nombremodulo) {
		this.nombremodulo = nombremodulo;
	}

	@Column(name = "ESTADO", length = 100)
	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FECCRE", length = 23)
	public Date getFeccre() {
		return this.feccre;
	}

	public void setFeccre(Date feccre) {
		this.feccre = feccre;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FECMOD", length = 23)
	public Date getFecmod() {
		return this.fecmod;
	}

	public void setFecmod(Date fecmod) {
		this.fecmod = fecmod;
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

	@Column(name = "TIPOPERMISO")
	public Boolean getTipopermiso() {
		return this.tipopermiso;
	}

	public void setTipopermiso(Boolean tipopermiso) {
		this.tipopermiso = tipopermiso;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "modulo")
	public Set<Perfilmodulo> getPerfilmodulos() {
		return this.perfilmodulos;
	}

	public void setPerfilmodulos(Set<Perfilmodulo> perfilmodulos) {
		this.perfilmodulos = perfilmodulos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "modulo")
	public Set<Auditoria> getAuditorias() {
		return this.auditorias;
	}

	public void setAuditorias(Set<Auditoria> auditorias) {
		this.auditorias = auditorias;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "modulo")
	public Set<Paginamodulo> getPaginamodulos() {
		return this.paginamodulos;
	}

	public void setPaginamodulos(Set<Paginamodulo> paginamodulos) {
		this.paginamodulos = paginamodulos;
	}

}