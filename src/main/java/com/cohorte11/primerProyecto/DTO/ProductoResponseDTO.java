package com.cohorte11.primerProyecto.DTO;

import com.cohorte11.primerProyecto.model.CategoriaProducto;
import com.cohorte11.primerProyecto.model.Producto;
import com.cohorte11.primerProyecto.DTO.ProductoRequestDTO;

public class ProductoResponseDTO {
    private Long id;
    private String nombre;
    private Double precio;
    private Integer stock;
    private CategoriaProducto categoria;

    public ProductoResponseDTO(Long id, String nombre, Double precio, Integer stock, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }

    public static ProductoResponseDTO desde(Producto producto) {
        return new ProductoResponseDTO(
                producto.getId(),
                producto.getNombre(),
                producto.getPrecio(),
                producto.getStock(),
                producto.getCategoria()
        );
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Double getPrecio() { return precio; }
    public void setPrecio(Double precio) { this.precio = precio; }

    public Integer getStock() { return stock; }
    public void setStock(Integer stock) { this.stock = stock; }

    public CategoriaProducto getCategoria() { return categoria; }
    public void setCategoria(CategoriaProducto categoria) { this.categoria = categoria; }
}
