package com.cohorte11.primerProyecto.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false, unique = true)
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RolCliente rol;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Orden> ordenes = new ArrayList<>();

    public Cliente() {}

    public Cliente(String nombre, String email, RolCliente rol, List<Orden> ordenes) {
        this.nombre = nombre;
        this.email = email;
        this.rol = rol;
        this.ordenes = ordenes;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Orden> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(List<Orden> ordenes) {
        this.ordenes = ordenes;
    }

    public RolCliente getRol() {
        return rol;
    }

    public void setRol(RolCliente rol) {
        this.rol = rol;
    }
}