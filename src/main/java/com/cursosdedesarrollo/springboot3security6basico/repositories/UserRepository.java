package com.cursosdedesarrollo.springboot3security6basico.repositories;

import com.cursosdedesarrollo.springboot3security6basico.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
public interface UserRepository extends JpaRepository<User, Long>
{
    Optional<User> findByUsernameOrEmail(String username, String
            email);
}
