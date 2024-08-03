package com.example.examen.Controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen.Modelos.PrestamosModelos;
import com.example.examen.Servicios.PrestamosServicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RequestMapping("/prestamo")
@RestController
public class PrestamoController {

    @Autowired
    private PrestamosServicio prestamosServicio;

    @GetMapping("/ver")
    public List<PrestamosModelos> mostrar() {
        return prestamosServicio.ver();
    }

    @PostMapping("/crear/{dni}")
    public PrestamosModelos postMethodName(@RequestBody PrestamosModelos p, @PathVariable String dni) {
        return prestamosServicio.crear(dni, p);

    }

    @GetMapping("/buscarid/{dni}")
    public PrestamosModelos postMethodName(@PathVariable Integer id) {
        return prestamosServicio.buscarporId(id);

    }

}
