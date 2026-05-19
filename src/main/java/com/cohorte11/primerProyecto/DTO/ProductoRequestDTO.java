package com.cohorte11.primerProyecto.DTO;

import com.cohorte11.primerProyecto.model.CategoriaProducto;

public class ProductoRequestDTO {
    private String nombre;
    private Double precio;
    private Integer stock;
    private CategoriaProducto categoria;

    public ProductoRequestDTO() {}

    public ProductoRequestDTO(String nombre, Double precio, Integer stock, CategoriaProducto categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Double getPrecio() { return precio; }
    public void setPrecio(Double precio) { this.precio = precio; }

    public Integer getStock() { return stock; }
    public void setStock(Integer stock) { this.stock = stock; }

    public CategoriaProducto getCategoria() { return categoria; }
    public void setCategoria(CategoriaProducto categoria) { this.categoria = categoria; }
}
