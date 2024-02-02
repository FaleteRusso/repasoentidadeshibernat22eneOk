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
@Table(name = "movimientos")
public class Movimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMovimiento;
    @Column(nullable = false)
    private double cantidad;
    @Column(length = 20,nullable = false)
    private String tipoMovimiento;
    private LocalDate fecha;
    @ManyToOne
    @JoinColumn(name = "id_cuenta",nullable = false,foreignKey = @ForeignKey(name = "FK_movimientos_cuentas"))
    private Cuenta cuenta;

}
