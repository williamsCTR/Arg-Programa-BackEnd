/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.back.back.Security.Repository;

import com.back.back.Security.Entity.Rol;
import com.back.back.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author willy
 */

@Repository
public interface iRolRepository extends JpaRepository <Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
