package com.corenetworks.repasoentidadeshibernat22ene.servicio;

import com.corenetworks.repasoentidadeshibernat22ene.modelo.Patron;
import com.corenetworks.repasoentidadeshibernat22ene.repository.IPatronRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PatronServiciolmpl implements IPatronServicio{
    @Autowired
    private IPatronRepo repo;
    @Override
    public List<Patron> mostrarTodos() {
        return null;
    }

    @Override
    public Patron mostrarUno(String dni) {
        return repo.findById(dni).orElse(new Patron());
    }

    @Override
    public Patron insert(Patron p1) {
        return repo.save(p1);
    }

    @Override
    public Patron modificar(Patron p1) {
        return repo.save(p1);
    }

    @Override
    public void eliminar(String dni) {
        repo.deleteById(dni);

    }
}
