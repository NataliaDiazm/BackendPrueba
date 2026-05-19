package com.cohorte11.primerProyecto.service;


import com.cohorte11.primerProyecto.model.Cliente;
import com.cohorte11.primerProyecto.model.Orden;
import com.cohorte11.primerProyecto.repository.ClienteRepository;
import com.cohorte11.primerProyecto.repository.OrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdenService {

    private final OrdenRepository ordenRepository;
    private final ClienteRepository clienteRepository;

    @Autowired
    public OrdenService(OrdenRepository ordenRepository, ClienteRepository clienteRepository) {
        this.ordenRepository = ordenRepository;
        this.clienteRepository = clienteRepository;
    }

    public List<Orden> findAll() {
        return ordenRepository.findAll();
    }

    public Orden findById(Long id) {
        return ordenRepository.findById(id).orElse(null);
    }

    public Orden save(Orden orden) {
        return ordenRepository.save(orden);
    }
//    public Orden save(Orden orden) {
//        Cliente cliente = clienteRepository.findById(orden.getCliente().getId()).orElse(null);
//        orden.setCliente(cliente);
//        return ordenRepository.save(orden);
//    }

    public Orden update(Long id, Orden datos) {
        Orden existente = ordenRepository.findById(id).orElse(null);
        if (existente == null) return null;
        existente.setFecha(datos.getFecha());
        existente.setEstado(datos.getEstado());
        existente.setCliente(datos.getCliente());
        return ordenRepository.save(existente);
    }

    public void delete(Long id) {
        ordenRepository.deleteById(id);
    }
}
