package com.dany.apirest.Clients;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Genera los getters y setters
@Data
// Genera todos los constructores
@AllArgsConstructor
// Un constructor que no reciba parametris
@NoArgsConstructor
//Modelaje a través de entidades
@Entity
public class Client {
    // Annotations: 
    @Id
    // Especificar la estrategia que va a ocupar
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue
 private Integer id; 
 @Basic
 private String firstName; 
 private String lastName;
 private String email;  
}
