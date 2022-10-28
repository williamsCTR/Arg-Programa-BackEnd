/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.back.back.Interface;

import com.back.back.Entity.Persona;
import java.util.List;



/**
 *
 * @author willy
 */
public interface IPersonaService {

    //Traer lista de persona
    public List <Persona> getPersona();
    
    //Guardar un objeto de tipo persona   
    public void savePersona(Persona persona) ;
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);
}
