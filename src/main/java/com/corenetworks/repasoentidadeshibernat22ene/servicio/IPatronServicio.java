package com.corenetworks.repasoentidadeshibernat22ene.servicio;

import com.corenetworks.repasoentidadeshibernat22ene.modelo.Patron;

import java.util.List;

public interface IPatronServicio {
    List<Patron>mostrarTodos();
    Patron mostrarUno(String dni);
    Patron insert(Patron p1);
    Patron modificar(Patron p1);
    void eliminar(String dni);
}
