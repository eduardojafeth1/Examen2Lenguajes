package com.example.examen.Modelos;

import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "prestamos")
public class PrestamosModelos {
    @Id
    @Column(name = "codigoprestamo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoPrestamos;
    private Date fechaapertura;
    private Float monto;
    private Float cuota;
    private Integer plazo;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "dni", referencedColumnName = "dni")
    private ClienteModelo cliente;

    // @OneToMany(mappedBy = "Prestamo")
    // private List<CuotaModelo> cuotas;

}
