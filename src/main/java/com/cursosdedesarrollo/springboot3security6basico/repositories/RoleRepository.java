package com.cursosdedesarrollo.springboot3security6basico.repositories;


import com.cursosdedesarrollo.springboot3security6basico.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
public interface RoleRepository extends JpaRepository<Role, Long>
{
    Role findByName(String name);
}
