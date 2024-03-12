package com.citas.java;

import com.citas.java.entities.Medico;
import com.citas.java.entities.Paciente;
import com.citas.java.entities.TipoSangre;

import java.time.LocalDateTime;
import java.time.Month;
import com.citas.java.entities.Especialidad;

public class Main {
    public static void main(String[] args) {
        
        //Crear o instanciar un Medico 

        Medico medico1 = new Medico(1, "Carolina", "Forero", "CC", 145, 4, Especialidad.PEDIATRA);

        LocalDateTime fechaNacimiento =LocalDateTime.of(2006, Month.FEBRUARY, 1, 15, 30, 0);

        Paciente paciente1 = new Paciente(1, "David", "perez", "CC", 45, "HOLA@GMAIL.COM", 3148812180L, fechaNacimiento,1.40,(double) 45.7 , TipoSangre.APOSITIVO, 'N');

        
    }
}