package com.Team2Java12.MechAppoint.controllers.DTO.Magazzino;

public class UpdateMagazzinoRequestDTO {
    private String nomeMagazzino;
    private Integer inventario;
    private  Integer id;

    public String getNomeMagazzino() {
        return nomeMagazzino;
    }

    public void setNomeMagazzino(String nomeMagazzino) {
        this.nomeMagazzino = nomeMagazzino;
    }

    public Integer getInventario() {
        return inventario;
    }

    public void setInventario(Integer inventario) {
        this.inventario = inventario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
