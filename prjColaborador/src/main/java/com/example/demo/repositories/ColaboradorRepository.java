package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Colaborador;
import com.example.demo.services.ColaboradorServices;

public interface ColaboradorRepository extends JpaRepository<Colaborador, Long> {

	 
	

}
