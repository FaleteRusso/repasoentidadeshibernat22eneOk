package com.corenetworks.repasoentidadeshibernat22ene.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cuentas_ahorro")
public class CuentaAhorro {
    @Id
    @Column(nullable = false)
    private double interesMensual;
    @ManyToOne
    @JoinColumn(name = "id_Cuenta",nullable = false,foreignKey = @ForeignKey(name = "FK_cuentas_ahorro_cuentas"))
    private Cuenta cuenta;
}
