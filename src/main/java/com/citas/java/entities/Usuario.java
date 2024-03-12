package com.citas.java.entities;

public class Usuario {

    //lo protected en la superclase sera privado en las clases hijas 

    protected int id;
    protected String nombres;
    protected String apellidos;
    protected String tipoIdentificacion;
    protected int numeroDocumento;


    public Usuario(int id, String nombres, String apellidos, String tipoIdentificacion, int numeroDocumento) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroDocumento = numeroDocumento;
    }



    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getNombres() {
        return nombres;
    }


    public void setNombres(String nombres) {
        this.nombres = nombres;
    }


    public String getApellidos() {
        return apellidos;
    }


    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }


    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }


    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }


    public int getNumeroDocumento() {
        return numeroDocumento;
    }


    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }


    
    

}
