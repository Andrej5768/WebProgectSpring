package com.andrewCorp.webProject.repository;

import com.andrewCorp.webProject.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
