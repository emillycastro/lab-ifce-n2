package br.com.escola.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.escola.model.entity.Aluno;

public interface AlunoRepo extends JpaRepository<Aluno, Integer>{

}
