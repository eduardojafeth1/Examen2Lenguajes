package com.example.examen.Repositorios;

import java.io.ObjectInputStream.GetField;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.examen.Modelos.PrestamosModelos;

@Repository
public interface PrestamoRepositorio extends JpaRepository<PrestamosModelos, Integer> {
}
