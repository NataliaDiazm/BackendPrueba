package com.cohorte11.primerProyecto.controller;

import com.cohorte11.primerProyecto.model.Producto;
import com.cohorte11.primerProyecto.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    private final ProductoService productoService;

    @Autowired
    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping
    public List<Producto> obtenerTodos() {
        return productoService.findAll();
    }

    @GetMapping("/{id}")
    public Producto obtenerPorId(@PathVariable Long id){
        return productoService.findById(id);
    }

    @PutMapping("/{id}")
    public Producto actualizar(@PathVariable Long id, @RequestBody Producto datos){
        return productoService.update(id, datos);
    }

    @PostMapping
    public Producto crear(@RequestBody Producto producto){
        return productoService.save(producto);
    }

    @DeleteMapping("/{id}")
    public  void eliminar(@PathVariable Long id){
        productoService.delete(id);
    }
}