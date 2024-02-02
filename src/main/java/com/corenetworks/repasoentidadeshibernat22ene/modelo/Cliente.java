package com.corenetworks.repasoentidadeshibernat22ene.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @Column(length = 9,nullable = false)
    private String nif;
    @Column(length = 60,nullable = false)
    private String nombre;
    private LocalDate mes;
    @Column(length = 120,nullable = false)
    private String direccion;
}
