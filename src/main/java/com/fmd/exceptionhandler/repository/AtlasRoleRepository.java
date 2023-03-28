package com.fmd.exceptionhandler.repository;

import com.fmd.exceptionhandler.entity.AtlasRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AtlasRoleRepository extends JpaRepository<AtlasRole, UUID> {
}
