package com.example.excelProj.util;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConversationUtil {

    @Autowired
    private ModelMapper modelMapper;

    public <T> T mapDtoToEntity(Object dtoObject, Class<T> entityObject) {
        return modelMapper.map(dtoObject, entityObject);
    }
}
