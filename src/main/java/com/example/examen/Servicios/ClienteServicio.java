package com.example.examen.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen.Modelos.ClienteModelo;
import com.example.examen.Modelos.CuotaModelo;
import com.example.examen.Modelos.PrestamosModelos;
import com.example.examen.Repositorios.ClienteRepositorio;
import com.example.examen.Repositorios.CuotaRepositorio;

@Service
public class ClienteServicio {
    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Autowired
    private CuotaRepositorio cuotaRepositorio;

    public ClienteModelo crear(ClienteModelo c) {
        if (!clienteRepositorio.existsById(c.getDni())) {

            ClienteModelo clientenuevo = new ClienteModelo();
            List<PrestamosModelos> P = c.getPrestamos();
            for (PrestamosModelos p : P) {
                if (p != null) {
                    p.setCliente(c);

                }

            }

            clientenuevo = c;
            return clienteRepositorio.save(clientenuevo);
        }
        return null;
    }

    public List<ClienteModelo> mostrar() {
        return this.clienteRepositorio.findAll();
    }

}
