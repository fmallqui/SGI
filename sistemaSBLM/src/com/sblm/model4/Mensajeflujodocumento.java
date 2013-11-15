package com.sblm.model4;

// Generated 06-nov-2013 11:43:21 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Mensajeflujodocumento generated by hbm2java
 */
@Entity
@Table(name = "MENSAJEFLUJODOCUMENTO", schema = "dbo", catalog = "beneficenciadba")
public class Mensajeflujodocumento implements java.io.Serializable {

	private MensajeflujodocumentoId id;

	public Mensajeflujodocumento() {
	}

	public Mensajeflujodocumento(MensajeflujodocumentoId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idmensajeflujodocumento", column = @Column(name = "IDMENSAJEFLUJODOCUMENTO")),
			@AttributeOverride(name = "idflujodocumento", column = @Column(name = "IDFLUJODOCUMENTO")),
			@AttributeOverride(name = "contenido", column = @Column(name = "CONTENIDO", length = 100)),
			@AttributeOverride(name = "estado", column = @Column(name = "ESTADO")),
			@AttributeOverride(name = "fechaenvio", column = @Column(name = "FECHAENVIO", length = 10)),
			@AttributeOverride(name = "idusuarioenvio", column = @Column(name = "IDUSUARIOENVIO")),
			@AttributeOverride(name = "nombreusuarioenvio", column = @Column(name = "NOMBREUSUARIOENVIO", length = 100)) })
	public MensajeflujodocumentoId getId() {
		return this.id;
	}

	public void setId(MensajeflujodocumentoId id) {
		this.id = id;
	}

}