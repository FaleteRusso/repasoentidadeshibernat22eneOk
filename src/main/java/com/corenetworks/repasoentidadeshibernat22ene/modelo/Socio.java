package com.corenetworks.repasoentidadeshibernat22ene.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "socios")
public class Socio {
    @Id
    @Column(length = 9)
    private String dni;
    @Column(length = 60, nullable = false)
    private String nombre;
    @Column(length = 120,nullable = false)
    private String direccion;

    //Opcional -- solo que lo pida el front
    @OneToMany(mappedBy = "socio",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Barco>b1;

    public Socio(String dni, String nombre, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Socio{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", b1=" + b1 +
                '}';
    }

    public List<Barco> getB1() {
        return b1;
    }

    public void setB1(List<Barco> b1) {
        this.b1 = b1;
    }
}
