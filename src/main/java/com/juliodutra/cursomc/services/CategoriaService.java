package com.juliodutra.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juliodutra.cursomc.domain.Categoria;
import com.juliodutra.cursomc.repositories.CategoriaRepository;
import com.juliodutra.cursomc.services.expections.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id  + ", Tipo:" + Categoria.class.getName()));
	}
}
