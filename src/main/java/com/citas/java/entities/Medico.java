package com.citas.java.entities;


public class Medico extends Usuario {

    

    private int registroMedico;
    private Especialidad especialidad;

    
    public Medico(int id, String nombres, String apellidos, String tipoIdentificacion, int numeroDocumento,
            int registroMedico, Especialidad especialidad) {
        super(id, nombres, apellidos, tipoIdentificacion, numeroDocumento);
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }


    public int getRegistroMedico() {
        return registroMedico;
    }


    public void setRegistroMedico(int registroMedico) {
        this.registroMedico = registroMedico;
    }


    public Especialidad getEspecialidad() {
        return especialidad;
    }


    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }


    
   

   

    

    




    

    


    
    


    





}
