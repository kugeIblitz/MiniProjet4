package com.rayen.SpringBoot_TP01.repos;

import com.rayen.SpringBoot_TP01.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByRole(String role);
}