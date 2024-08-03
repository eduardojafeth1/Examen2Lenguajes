package com.example.examen.Controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen.Modelos.ClienteModelo;
import com.example.examen.Servicios.ClienteServicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/cliente")
public class ClienteControlador {
    @Autowired
    private ClienteServicio clienteServicio;

    @GetMapping("/ver")
    public List<ClienteModelo> getMethodName() {
        return clienteServicio.mostrar();
    }

    @PostMapping("/crear")
    public ClienteModelo postMethodName(@RequestBody ClienteModelo m) {

        return clienteServicio.crear(m);
    }

}
