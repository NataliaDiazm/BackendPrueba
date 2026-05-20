package com.cohorte11.primerProyecto.DTO;

public class OrdenItemRequestDTO {

    private Long ordenId;
    private Long productoId;
    private Integer cantidad;
    private Double precioUnitario;

    public OrdenItemRequestDTO() {}

    public Long getOrdenId() { return ordenId; }
    public void setOrdenId(Long ordenId) { this.ordenId = ordenId; }

    public Long getProductoId() { return productoId; }
    public void setProductoId(Long productoId) { this.productoId = productoId; }

    public Integer getCantidad() { return cantidad; }
    public void setCantidad(Integer cantidad) { this.cantidad = cantidad; }

    public Double getPrecioUnitario() { return precioUnitario; }
    public void setPrecioUnitario(Double precioUnitario) { this.precioUnitario = precioUnitario; }
}
