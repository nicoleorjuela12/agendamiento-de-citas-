package com.citas.java.entities;

public class Consultorio {
    private Integer id;
    private String direccion;
    private int numero;


    public Consultorio() {
    }


    public Consultorio(Integer id, String direccion, int numero) {
        this.id = id;
        this.direccion = direccion;
        this.numero = numero;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getDireccion() {
        return direccion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public int getNumero() {
        return numero;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }


    

    


    

}
