package com.juliodutra.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juliodutra.cursomc.domain.Pedido;
import com.juliodutra.cursomc.repositories.PedidoRepository;
import com.juliodutra.cursomc.services.expections.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;

	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException("Obejto não encontrado, Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}
}
