package com.rentstore.model;

// Generated 11/07/2013 17:45:57 by Hibernate Tools 3.4.0.CR1

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Pessoafisica generated by hbm2java
 */
@Entity
@Table(name = "pessoafisica", catalog = "concessionaria")
public class Pessoafisica implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 989218264163507875L;
	private Integer idpessoafisica;
	private Endereco endereco;
	private String nome;
	private Date datanascimento;
	private String cpf;
	private String rg;
	private String telefone1;
	private String telefone2;
	private Set<Motorista> motoristas = new HashSet<Motorista>(0);
	private Set<Cliente> clientes = new HashSet<Cliente>(0);
	private Set<Funcionario> funcionarios = new HashSet<Funcionario>(0);

	public Pessoafisica() {
		this.endereco = new Endereco();		
	}

	public Pessoafisica(Endereco endereco, String nome, Date datanascimento,
			String cpf, String rg, String telefone1, String telefone2,
			Set<Motorista> motoristas, Set<Cliente> clientes,
			Set<Funcionario> funcionarios) {
		this.endereco = endereco;
		this.nome = nome;
		this.datanascimento = datanascimento;
		this.cpf = cpf;
		this.rg = rg;
		this.telefone1 = telefone1;
		this.telefone2 = telefone2;
		this.motoristas = motoristas;
		this.clientes = clientes;
		this.funcionarios = funcionarios;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idpessoafisica", unique = true, nullable = false)
	public Integer getIdpessoafisica() {
		return this.idpessoafisica;
	}

	public void setIdpessoafisica(Integer idpessoafisica) {
		this.idpessoafisica = idpessoafisica;
	}

	@ManyToOne(fetch = FetchType.EAGER,cascade={CascadeType.PERSIST,CascadeType.MERGE})
	@JoinColumn(name = "idendereco")
	public Endereco getEndereco() {
		return this.endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Column(name = "nome", length = 50)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "datanascimento", length = 10)
	public Date getDatanascimento() {
		return this.datanascimento;
	}

	public void setDatanascimento(Date datanascimento) {
		this.datanascimento = datanascimento;
	}

	@Column(name = "cpf", length = 11)
	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Column(name = "rg", length = 11)
	public String getRg() {
		return this.rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	@Column(name = "telefone1", length = 15)
	public String getTelefone1() {
		return this.telefone1;
	}

	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}

	@Column(name = "telefone2", length = 15)
	public String getTelefone2() {
		return this.telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pessoafisica")
	public Set<Motorista> getMotoristas() {
		return this.motoristas;
	}

	public void setMotoristas(Set<Motorista> motoristas) {
		this.motoristas = motoristas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pessoafisica")
	public Set<Cliente> getClientes() {
		return this.clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pessoafisica")
	public Set<Funcionario> getFuncionarios() {
		return this.funcionarios;
	}

	public void setFuncionarios(Set<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

}
