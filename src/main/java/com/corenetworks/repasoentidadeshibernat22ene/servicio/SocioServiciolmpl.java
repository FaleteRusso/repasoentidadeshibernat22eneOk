package com.corenetworks.repasoentidadeshibernat22ene.servicio;

import com.corenetworks.repasoentidadeshibernat22ene.modelo.Socio;
import com.corenetworks.repasoentidadeshibernat22ene.repository.ISocioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
@Service
public class SocioServiciolmpl implements ISocioServicio {
    @Autowired
    private ISocioRepo repo;


    @Override
    public List<Socio> mostrarTodos() {
        return null;
    }

    @Override
    public Socio mostrarUno(String dni) {
        return null;
    }

    @Override
    public Socio insertar(Socio s1) {
        return repo.save(s1);
    }

    @Override
    public Socio modificar(Socio s1) {
        return null;
    }

    @Override
    public void eliminar(String dni) {

    }
}



