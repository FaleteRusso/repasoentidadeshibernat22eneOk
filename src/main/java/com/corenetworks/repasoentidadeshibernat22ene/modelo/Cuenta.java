package com.corenetworks.repasoentidadeshibernat22ene.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cuentas")
public class Cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCuenta;
    @Column(nullable = false)
    private double saldo;
    @Column(length = 20,nullable = false)
    private String estado;
    @ManyToOne
    @JoinColumn(name = "nif",nullable = false,foreignKey = @ForeignKey(name = "FK_cuentas_clientes"))
    private Cliente cliente;
}
