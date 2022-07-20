package com.idat.ReservarCita.service;

import java.util.List;

import com.idat.ReservarCita.model.Cliente;

public interface ClienteService {
	
	void guardarCliente(Cliente cliente);
	void actualizaeCliente(Cliente cliente);
	void eliminarCliente(Integer id);
	List<Cliente> listarCliente();
	Cliente obtenerClienteId(Integer id);

}
