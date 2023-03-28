package com.fmd.exceptionhandler.service.imp;

import com.fmd.exceptionhandler.dto.AtlasUserDto;
import com.fmd.exceptionhandler.dto.DtoAtlasUserIU;
import com.fmd.exceptionhandler.repository.AtlasUserRepository;
import com.fmd.exceptionhandler.service.AtlasUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class AtlasUserServiceImp implements AtlasUserService {

    private final AtlasUserRepository userRepository;

    @Override
    public AtlasUserDto createAtlasUser(DtoAtlasUserIU dtoAtlasUserIU) {
        return null;
    }
}
