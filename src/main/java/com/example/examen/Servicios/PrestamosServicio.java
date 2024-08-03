package com.example.examen.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen.Modelos.PrestamosModelos;
import com.example.examen.Repositorios.ClienteRepositorio;
import com.example.examen.Repositorios.PrestamoRepositorio;

@Service
public class PrestamosServicio {

    @Autowired
    private PrestamoRepositorio prestamoRepositorio;

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    public PrestamosModelos crear(String dni, PrestamosModelos prestamo) {
        PrestamosModelos nuevoPrestamo = new PrestamosModelos();
        nuevoPrestamo = prestamo;
        nuevoPrestamo.setCliente(clienteRepositorio.getById(dni));
        return prestamoRepositorio.save(nuevoPrestamo);

    }

    public List<PrestamosModelos> ver() {
        return prestamoRepositorio.findAll();
    }
}
