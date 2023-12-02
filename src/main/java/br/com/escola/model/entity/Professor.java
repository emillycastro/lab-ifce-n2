package br.com.escola.model.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.escola.model.enun.Materia;


@Entity
public class Professor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	private String email;
	private Double salario;
	@Enumerated(EnumType.STRING)
    private Materia materia;
	
	/*
	 * @OneToMany
	 * 
	 * @JoinColumn(name = "qtdalunos", referencedColumnName="aluno_ra") private Long
	 * qtdAlunos;
	 */
	
	public Professor() {
		
	}
	
	public Professor(String nome, String email, Double salario, Materia materia) {
		super();
		this.nome = nome;
		this.email = email;
		this.salario = salario;
		this.materia = materia;
		/* this.qtdAlunos = qtdAlunos; */
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	/*
	 * public Long getQtdAlunos() { return qtdAlunos; }
	 * 
	 * public void setQtdAlunos(Long qtdAlunos) { this.qtdAlunos = qtdAlunos; }
	 */

}
