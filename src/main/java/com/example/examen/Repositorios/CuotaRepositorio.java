package com.example.examen.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.examen.Modelos.CuotaModelo;
@Repository
public interface CuotaRepositorio extends JpaRepository<CuotaModelo, Integer> {

}
