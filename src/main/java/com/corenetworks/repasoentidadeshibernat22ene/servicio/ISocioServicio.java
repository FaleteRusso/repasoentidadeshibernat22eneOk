package com.corenetworks.repasoentidadeshibernat22ene.servicio;

import com.corenetworks.repasoentidadeshibernat22ene.modelo.Socio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ISocioServicio {
    List<Socio>mostrarTodos();
    Socio mostrarUno(String dni);
    Socio insertar(Socio s1);
    Socio modificar(Socio s1);
    void eliminar (String dni);
}
