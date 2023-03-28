package com.fmd.exceptionhandler.dto;

import com.fmd.exceptionhandler.entity.AtlasRole;
import lombok.Data;

@Data
public class AtlasUserDto {
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private AtlasRole atlasRole;
}
