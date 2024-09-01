package com.modulo1.modulo.Modelo;
import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
//import lombok.Getter;
//import lombok.Setter;

//@Getter
//@Setter
@Data
@Entity
public class Profesor implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int idProfesor;
    private String nombre;
    private String apellido;
    private String correo;
}
