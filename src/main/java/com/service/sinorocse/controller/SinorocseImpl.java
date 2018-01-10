package com.service.sinorocse.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-01-10T07:39:11.980Z")

@RestSchema(schemaId = "sinorocse")
@RequestMapping(path = "/sinorocse", produces = MediaType.APPLICATION_JSON)
public class SinorocseImpl {

    @Autowired
    private SinorocseDelegate userSinorocseDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userSinorocseDelegate.helloworld(name);
    }

}
