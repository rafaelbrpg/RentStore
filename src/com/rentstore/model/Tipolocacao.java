package com.rentstore.model;

// Generated 11/07/2013 17:45:57 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Tipolocacao generated by hbm2java
 */
@Entity
@Table(name = "tipolocacao", catalog = "concessionaria")
public class Tipolocacao implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3247758660726257047L;
	private Integer idtipolocacao;
	private String tipo;
	private String descricao;
	private Set<Locacao> locacaos = new HashSet<Locacao>(0);

	public Tipolocacao() {
	}

	public Tipolocacao(String tipo, String descricao, Set<Locacao> locacaos) {
		this.tipo = tipo;
		this.descricao = descricao;
		this.locacaos = locacaos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idtipolocacao", unique = true, nullable = false)
	public Integer getIdtipolocacao() {
		return this.idtipolocacao;
	}

	public void setIdtipolocacao(Integer idtipolocacao) {
		this.idtipolocacao = idtipolocacao;
	}

	@Column(name = "tipo", length = 20)
	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Column(name = "descricao", length = 50)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipolocacao")
	public Set<Locacao> getLocacaos() {
		return this.locacaos;
	}

	public void setLocacaos(Set<Locacao> locacaos) {
		this.locacaos = locacaos;
	}

}
