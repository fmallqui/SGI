package com.sblm.model4;

// Generated 06-nov-2013 11:43:21 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Mep generated by hbm2java
 */
@Entity
@Table(name = "MEP", schema = "dbo", catalog = "beneficenciadba")
public class Mep implements java.io.Serializable {

	private int idmep;
	private String descripcion;
	private String usrcre;
	private String usrmod;
	private Date feccre;
	private Date fecmod;
	private Set<Upa> upas = new HashSet<Upa>(0);

	public Mep() {
	}

	public Mep(int idmep) {
		this.idmep = idmep;
	}

	public Mep(int idmep, String descripcion, String usrcre, String usrmod,
			Date feccre, Date fecmod, Set<Upa> upas) {
		this.idmep = idmep;
		this.descripcion = descripcion;
		this.usrcre = usrcre;
		this.usrmod = usrmod;
		this.feccre = feccre;
		this.fecmod = fecmod;
		this.upas = upas;
	}

	@Id
	@Column(name = "idmep", unique = true, nullable = false)
	public int getIdmep() {
		return this.idmep;
	}

	public void setIdmep(int idmep) {
		this.idmep = idmep;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mep")
	public Set<Upa> getUpas() {
		return this.upas;
	}

	public void setUpas(Set<Upa> upas) {
		this.upas = upas;
	}

}
