package br.com.escola.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ra;
	
	private String nome;
	private String email;
	private Integer idade;
	
	@ManyToOne
	private Professor professorResponsavel;
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, String email, Integer idade, Professor professorResponsavel) {
		super();
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.professorResponsavel = professorResponsavel;
	}

	public Integer getRa() {
		return ra;
	}
	public void setRa(Integer ra) {
		this.ra = ra;
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
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public Professor getProfessorResponsavel() {
		return professorResponsavel;
	}
	public void setProfessorResponsavel(Professor professorResponsavel) {
		this.professorResponsavel = professorResponsavel;
	}
	
	
}
