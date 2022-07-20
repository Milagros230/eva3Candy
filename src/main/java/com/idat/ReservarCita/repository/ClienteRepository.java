package com.idat.ReservarCita.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.ReservarCita.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Integer> {


}
