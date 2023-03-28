package com.fmd.exceptionhandler.utility;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;

public class DtoBaseModel {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

   /* private <E extends DtoBaseModel>  convertToDto(T original, E destination){
        return destination;
    }

    */
}
