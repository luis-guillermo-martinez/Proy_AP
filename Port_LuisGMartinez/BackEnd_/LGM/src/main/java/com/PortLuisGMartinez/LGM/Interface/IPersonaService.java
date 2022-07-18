package com.PortLuisGMartinez.LGM.Interface;

import com.PortLuisGMartinez.LGM.Entity.persona;
import java.util.List;

      
public interface IPersonaService {
    //Traer UNa listas de personas
    public List<persona> getpersona();
    
    //Guardar un objeto del tipo persona
    public void savepersona(persona persona);
            
    //Eliminar un objeto pero lo eliminamos por ID
    public void deletepersona(long id);
    
    //Buscar una persona por Id
    public persona findpersona(long id);
}
