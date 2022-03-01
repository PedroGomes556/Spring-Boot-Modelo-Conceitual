package com.pedrogomes.cursmc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedrogomes.cursmc.domain.Pedido;
import com.pedrogomes.cursmc.repositories.PedidoRepository;
import com.pedrogomes.cursmc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;

	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + 
		Pedido.class.getName()));
		
	}
}
