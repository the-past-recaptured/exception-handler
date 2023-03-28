package com.fmd.exceptionhandler.api;

import com.fmd.exceptionhandler.dto.AtlasUserDto;
import com.fmd.exceptionhandler.dto.DtoAtlasUserIU;
import com.fmd.exceptionhandler.service.AtlasUserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@CrossOrigin("*")
@Log4j2
public class UserController {
    private AtlasUserService atlasUserService;

    @PostMapping
    public ResponseEntity<AtlasUserDto> createAtlasUser(@RequestBody DtoAtlasUserIU dtoAtlasUserIU) {
        return ResponseEntity.ok(atlasUserService.createAtlasUser(dtoAtlasUserIU));
    }
}
