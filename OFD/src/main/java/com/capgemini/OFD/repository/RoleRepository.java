package com.capgemini.OFD.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.OFD.domain.Role;
import com.capgemini.OFD.domain.Roles;

public interface RoleRepository extends JpaRepository<Role,Integer>{
	Optional<Role> findByRoleName(Roles role);
}
