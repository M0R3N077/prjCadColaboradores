package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Colaborador;
import com.example.demo.repositories.ColaboradorRepository;

@Service
public class ColaboradorServices {
	
	private final ColaboradorRepository colaboradorrepository;
	
	@Autowired
	public ColaboradorServices(ColaboradorRepository colaboradorrepository) {
		this.colaboradorrepository = colaboradorrepository;
	}
	
	//criação do colaborador
	public Colaborador saveColaborador(Colaborador colaborador) {
		return colaboradorrepository.save(colaborador);
	}
	public Colaborador getColaboradorById(Long id) {
		return colaboradorrepository.findById(id).orElse(null);
	}
	public List<Colaborador> getAllColaborador(){
		return colaboradorrepository.findAll();
	}
	public void deleteColaborador(Long id) {
		colaboradorrepository.deleteById(id);
	}

}


