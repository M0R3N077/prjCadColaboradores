package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Colaborador;
import com.example.demo.services.ColaboradorServices;

@RestController
@RequestMapping("/colaborador")
public class ColaboradorController {
	
	private final ColaboradorServices colaboradorservices;
	
	@Autowired
	public ColaboradorController(ColaboradorServices colaboradorservices) {
		this.colaboradorservices=colaboradorservices;
	}
	
	@PostMapping
	public Colaborador colaboradorFornecedor(@RequestBody Colaborador colaborador) {
		return colaboradorservices.saveColaborador(colaborador);
	}
	//traz todos os registros
	@GetMapping
	public List<Colaborador> getAllColaborador(){
		return colaboradorservices.getAllColaborador();
	}
	//traz somente o objeto especifico pelo id
	@GetMapping("/{id}")
	public Colaborador getColaborador(@PathVariable long id) {
		return colaboradorservices.getColaboradorById(id);
	}
	
	@DeleteMapping ("/{id}")
	public void deleteColaborador(@PathVariable long id) {
		colaboradorservices.deleteColaborador(id);
	}
}
