package com.cohorte11.primerProyecto.controller;

import com.cohorte11.primerProyecto.DTO.OrdenRequestDTO;
import com.cohorte11.primerProyecto.DTO.OrdenResponseDTO;
import com.cohorte11.primerProyecto.model.Orden;
import com.cohorte11.primerProyecto.service.OrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//
//
//@RestController
//@RequestMapping("/ordenes")
//public class OrdenController {
//
//    private final OrdenService ordenService;
//
//    @Autowired
//    public OrdenController(OrdenService ordenService) {
//        this.ordenService = ordenService;
//    }
//
//    @GetMapping
//    public List<OrdenResponseDTO> obtenerTodos() {
//        return ordenService.findAll();
//    }
//
//    @GetMapping("/{id}")
//    public OrdenResponseDTO obtenerPorId(@PathVariable Long id) {
//        return ordenService.findById(id);
//    }
//
//    @PostMapping
//    public OrdenResponseDTO crear(@RequestBody OrdenRequestDTO dto) {
//        return ordenService.save(dto);
//    }
//
//    @PutMapping("/{id}")
//    public OrdenResponseDTO actualizar(@PathVariable Long id,
//                                       @RequestBody OrdenRequestDTO dto) {
//        return ordenService.update(id, dto);
//    }
//
//    @DeleteMapping("/{id}")
//    public void eliminar(@PathVariable Long id) {
//        ordenService.delete(id);
//    }
//}





@RestController
@RequestMapping("/ordenes")
public class OrdenController {

    private final OrdenService ordenService;

    @Autowired
    public OrdenController(OrdenService ordenService) {
        this.ordenService = ordenService;
    }

    @GetMapping
    public List<Orden> obtenerTodos() {
        return ordenService.findAll();
    }

    @GetMapping("/{id}")
    public Orden obtenerPorId(@PathVariable Long id) {
        return ordenService.findById(id);
    }

    @PostMapping
    public Orden crear(@RequestBody Orden orden) {
        return ordenService.save(orden);
    }

    @PutMapping("/{id}")
    public Orden actualizar(@PathVariable Long id, @RequestBody Orden datos) {
        return ordenService.update(id, datos);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        ordenService.delete(id);
    }
}

