package com.example.examen.Modelos;

import org.hibernate.annotations.ManyToAny;
import org.hibernate.annotations.DialectOverride.GeneratedColumns;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "cuotas")
public class CuotaModelo {

    @Id
    @Column(name = "codigocuota")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoCuota;
    private Integer mes;

    private float interes;
    private float capital;
    private float saldo;

    @ManyToOne
    @JoinColumn(name = "codigoprestamo")
    private PrestamosModelos prestamosModelos;
}
