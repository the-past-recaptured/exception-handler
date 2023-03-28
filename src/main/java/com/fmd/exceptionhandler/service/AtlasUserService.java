package com.fmd.exceptionhandler.service;

import com.fmd.exceptionhandler.dto.AtlasUserDto;
import com.fmd.exceptionhandler.dto.DtoAtlasUserIU;

public interface AtlasUserService {
    AtlasUserDto createAtlasUser(DtoAtlasUserIU dtoAtlasUserIU);
}
