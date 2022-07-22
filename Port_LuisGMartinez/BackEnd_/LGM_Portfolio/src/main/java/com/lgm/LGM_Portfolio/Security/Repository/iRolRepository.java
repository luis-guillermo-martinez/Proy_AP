package com.lgm.LGM_Portfolio.Security.Repository;

import com.lgm.LGM_Portfolio.Security.Entity.Rol;
import com.lgm.LGM_Portfolio.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}