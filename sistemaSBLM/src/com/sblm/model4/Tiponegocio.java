package com.sblm.model4;

// Generated 06-nov-2013 11:43:21 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Tiponegocio generated by hbm2java
 */
@Entity
@Table(name = "TIPONEGOCIO", schema = "dbo", catalog = "beneficenciadba")
public class Tiponegocio implements java.io.Serializable {

	private int idtiponegocio;
	private String descripcion;
	private String usrcre;
	private String usrmod;
	private Date feccre;
	private Date fecmod;

	public Tiponegocio() {
	}

	public Tiponegocio(int idtiponegocio) {
		this.idtiponegocio = idtiponegocio;
	}

	public Tiponegocio(int idtiponegocio, String descripcion, String usrcre,
			String usrmod, Date feccre, Date fecmod) {
		this.idtiponegocio = idtiponegocio;
		this.descripcion = descripcion;
		this.usrcre = usrcre;
		this.usrmod = usrmod;
		this.feccre = feccre;
		this.fecmod = fecmod;
	}

	@Id
	@Column(name = "idtiponegocio", unique = true, nullable = false)
	public int getIdtiponegocio() {
		return this.idtiponegocio;
	}

	public void setIdtiponegocio(int idtiponegocio) {
		this.idtiponegocio = idtiponegocio;
	}

	@Column(name = "descripcion", length = 100)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "usrcre", length = 50)
	public String getUsrcre() {
		return this.usrcre;
	}

	public void setUsrcre(String usrcre) {
		this.usrcre = usrcre;
	}

	@Column(name = "usrmod", length = 50)
	public String getUsrmod() {
		return this.usrmod;
	}

	public void setUsrmod(String usrmod) {
		this.usrmod = usrmod;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "feccre", length = 23)
	public Date getFeccre() {
		return this.feccre;
	}

	public void setFeccre(Date feccre) {
		this.feccre = feccre;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecmod", length = 23)
	public Date getFecmod() {
		return this.fecmod;
	}

	public void setFecmod(Date fecmod) {
		this.fecmod = fecmod;
	}

}
