package com.example.examen.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.examen.Modelos.ClienteModelo;
@Repository
public interface ClienteRepositorio extends JpaRepository<ClienteModelo, String> {

}
