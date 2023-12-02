package br.com.escola.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.escola.model.entity.Professor;

public interface ProfRepo extends JpaRepository<Professor, Integer>{

}
