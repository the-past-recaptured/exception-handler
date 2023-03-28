package com.fmd.exceptionhandler.repository;

import com.fmd.exceptionhandler.entity.AtlasUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AtlasUserRepository extends JpaRepository<AtlasUser, UUID> {
}
