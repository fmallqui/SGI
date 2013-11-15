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
 * Valuacion generated by hbm2java
 */
@Entity
@Table(name = "VALUACION", schema = "dbo", catalog = "beneficenciadba")
public class Valuacion implements java.io.Serializable {

	private int idvaluacion;
	private String descripcion;
	private byte[] usrcre;
	private String usrmod;
	private Date feccre;
	private Date fecmod;
	private Set<Upa> upas = new HashSet<Upa>(0);

	public Valuacion() {
	}

	public Valuacion(int idvaluacion) {
		this.idvaluacion = idvaluacion;
	}

	public Valuacion(int idvaluacion, String descripcion, byte[] usrcre,
			String usrmod, Date feccre, Date fecmod, Set<Upa> upas) {
		this.idvaluacion = idvaluacion;
		this.descripcion = descripcion;
		this.usrcre = usrcre;
		this.usrmod = usrmod;
		this.feccre = feccre;
		this.fecmod = fecmod;
		this.upas = upas;
	}

	@Id @GeneratedValue
	@Column(name = "IDVALUACION", unique = true, nullable = false)
	public int getIdvaluacion() {
		return this.idvaluacion;
	}

	public void setIdvaluacion(int idvaluacion) {
		this.idvaluacion = idvaluacion;
	}

	@Column(name = "DESCRIPCION", length = 50)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "USRCRE")
	public byte[] getUsrcre() {
		return this.usrcre;
	}

	public void setUsrcre(byte[] usrcre) {
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "valuacion")
	public Set<Upa> getUpas() {
		return this.upas;
	}

	public void setUpas(Set<Upa> upas) {
		this.upas = upas;
	}

}