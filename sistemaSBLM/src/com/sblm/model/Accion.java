package com.sblm.model;

// Generated 14-oct-2013 14:58:03 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Accion generated by hbm2java
 */
@Entity
@Table(name = "ACCION", schema = "dbo", catalog = "beneficenciadba")
public class Accion implements java.io.Serializable {

	private String idaccion;
	private String descripcion;
	private String grpacc;
	private Boolean habaccion;
	private String codigoaccion;

	public Accion() {
	}

	public Accion(String idaccion) {
		this.idaccion = idaccion;
	}

	public Accion(String idaccion, String descripcion, String grpacc,
			Boolean habaccion, String codigoaccion) {
		this.idaccion = idaccion;
		this.descripcion = descripcion;
		this.grpacc = grpacc;
		this.habaccion = habaccion;
		this.codigoaccion = codigoaccion;
	}

	@Id
	@Column(name = "IDACCION", unique = true, nullable = false, length = 4)
	public String getIdaccion() {
		return this.idaccion;
	}

	public void setIdaccion(String idaccion) {
		this.idaccion = idaccion;
	}

	@Column(name = "DESCRIPCION", length = 50)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "GRPACC", length = 20)
	public String getGrpacc() {
		return this.grpacc;
	}

	public void setGrpacc(String grpacc) {
		this.grpacc = grpacc;
	}

	@Column(name = "HABACCION")
	public Boolean getHabaccion() {
		return this.habaccion;
	}

	public void setHabaccion(Boolean habaccion) {
		this.habaccion = habaccion;
	}

	@Column(name = "CODIGOACCION", length = 4)
	public String getCodigoaccion() {
		return this.codigoaccion;
	}

	public void setCodigoaccion(String codigoaccion) {
		this.codigoaccion = codigoaccion;
	}

}
