package com.java_api.java_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java_api.java_api.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> { }