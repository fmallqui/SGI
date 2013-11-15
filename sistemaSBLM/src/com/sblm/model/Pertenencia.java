package com.sblm.model;

// Generated 14-oct-2013 14:58:03 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Pertenencia generated by hbm2java
 */
@Entity
@Table(name = "PERTENENCIA", schema = "dbo", catalog = "beneficenciadba")
public class Pertenencia implements java.io.Serializable {

	private int idpertenencia;
	private String descripcion;
	private String usrcre;
	private String usrmod;
	private Date feccre;
	private Date fecmod;

	public Pertenencia() {
	}

	public Pertenencia(int idpertenencia) {
		this.idpertenencia = idpertenencia;
	}

	public Pertenencia(int idpertenencia, String descripcion, String usrcre,
			String usrmod, Date feccre, Date fecmod) {
		this.idpertenencia = idpertenencia;
		this.descripcion = descripcion;
		this.usrcre = usrcre;
		this.usrmod = usrmod;
		this.feccre = feccre;
		this.fecmod = fecmod;
	}

	@Id @GeneratedValue
	@Column(name = "idpertenencia", unique = true, nullable = false)
	public int getIdpertenencia() {
		return this.idpertenencia;
	}

	public void setIdpertenencia(int idpertenencia) {
		this.idpertenencia = idpertenencia;
	}

	@Column(name = "descripcion", length = 50)
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
