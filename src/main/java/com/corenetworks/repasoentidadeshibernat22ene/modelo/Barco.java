package com.corenetworks.repasoentidadeshibernat22ene.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "barcos")
public class Barco {
    @Id
    @Column(length = 7)
    private String matricula;
    @Column(nullable = false)
    private int amarre;
    @Column(length = 60,nullable = false)
    private String nombre;
    @Column(nullable = false)
    private double cuota;
    @ManyToOne
    @JoinColumn(name = "dni",nullable = false,foreignKey = @ForeignKey(name = "FK_barcos_socios"))
    private Socio socio;

    @Override
    public String toString() {
        return "Barco{" +
                "matricula='" + matricula + '\'' +
                ", amarre=" + amarre +
                ", nombre='" + nombre + '\'' +
                ", cuota=" + cuota +
                '}';
    }

    public Barco(String matricula, int amarre, String nombre, double cuota) {
        this.matricula = matricula;
        this.amarre = amarre;
        this.nombre = nombre;
        this.cuota = cuota;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }
}
