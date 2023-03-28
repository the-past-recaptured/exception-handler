package com.fmd.exceptionhandler.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.rmi.server.UID;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AtlasRole {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id = UUID.randomUUID();
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private boolean isAdmin = false;

    @OneToOne(mappedBy = "atlasRole")
    private AtlasUser atlasUser;
}
