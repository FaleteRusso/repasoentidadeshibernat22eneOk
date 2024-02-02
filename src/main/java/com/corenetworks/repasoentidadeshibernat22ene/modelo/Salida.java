package com.corenetworks.repasoentidadeshibernat22ene.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.PrivateKey;
import java.time.LocalDate;
import java.time.LocalTime;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "salidas")
public class Salida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSalida;
    private LocalDate fSalida;
    private LocalTime hSalida;
    @Column(length = 60)
    private String destino;
    @ManyToOne
    @JoinColumn(name = "matricula",nullable = false,foreignKey = @ForeignKey(name = "FK_salidas_barcos"))
    private Barco barco;
    @ManyToOne
    @JoinColumn(name = "dni",nullable = false,foreignKey = @ForeignKey(name = "FK_salidas_patrones"))
    private Patron patron;
    

    public Salida(int idSalida, LocalDate fSalida, LocalTime hSalida, String destino, Barco barco) {
        this.idSalida = idSalida;
        this.fSalida = fSalida;
        this.hSalida = hSalida;
        this.destino = destino;
        this.barco = barco;
    }

    public void setPatron(Patron patron) {
        this.patron = patron;
    }

    public Salida(int idSalida, LocalDate fSalida, LocalTime hSalida) {
        this.idSalida = idSalida;
        this.fSalida = fSalida;
        this.hSalida = hSalida;
    }
}
