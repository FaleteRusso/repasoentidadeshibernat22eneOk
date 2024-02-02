package com.corenetworks.repasoentidadeshibernat22ene.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cdts")
public class Cdt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInversion;
    private LocalDate mesApertura;
    @Column(nullable = false)
    private double interresMensual;
    @Column(nullable = false)
    private double velorInversion;
    @Column(length = 5,nullable = false)
    private String estadoCdt;
    @ManyToOne
    @JoinColumn(name = "id_cuenta",nullable = false,foreignKey = @ForeignKey(name = "FK_cdts_cuenta"))
    private Cuenta cuenta;
}
