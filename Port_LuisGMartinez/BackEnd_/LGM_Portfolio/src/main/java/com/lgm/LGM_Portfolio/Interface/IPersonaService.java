package com.lgm.LGM_Portfolio.Interface;

import com.lgm.LGM_Portfolio.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    // Traer una listas de personas
    public List <Persona> getPersona();
    
    // Gruardar un objeto del Tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un Objeto pero por ID
    public void deletePersona(Long id);
    
    // Buscar una persona por ID
    public Persona findPersona (Long id);
    
}
