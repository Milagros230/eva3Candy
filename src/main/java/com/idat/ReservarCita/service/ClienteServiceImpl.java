package com.idat.ReservarCita.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.ReservarCita.model.Cliente;
import com.idat.ReservarCita.repository.ClienteRepository;

public class ClienteServiceImpl implements ClienteService {

	
	@Autowired
	private ClienteRepository repository;
	
	@Override
	public void guardarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		repository.save(cliente);
	}

	@Override
	public void actualizaeCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(cliente);
	}

	@Override
	public void eliminarCliente(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public List<Cliente> listarCliente() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Cliente obtenerClienteId(Integer id) {
		// TODO Auto-generated method stub
		
		return repository.getById(id);
	}
	
	
}
































