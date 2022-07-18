package com.PortLuisGMartinez.LGM.Repository;

import com.PortLuisGMartinez.LGM.Entity.persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository <persona,Long>{
    
}
