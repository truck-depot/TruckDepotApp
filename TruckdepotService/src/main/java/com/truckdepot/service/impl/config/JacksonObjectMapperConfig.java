package com.truckdepot.service.impl.config;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
 
@Provider
public class JacksonObjectMapperConfig
        implements ContextResolver<ObjectMapper> {
 
    private static final ObjectMapper OBJECT_MAPPER
        = new ObjectMapper()
        .disable(MapperFeature.AUTO_DETECT_CREATORS)
        .disable(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS);
 
    @Override
    public ObjectMapper getContext(Class<?> aClass) {
        return OBJECT_MAPPER;
    }
}
