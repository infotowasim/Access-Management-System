package com.happiestminds.controller;

import com.happiestminds.dto.PermissionDTO;
import com.happiestminds.entity.Permission;
import com.happiestminds.service.PermissionService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import jakarta.inject.Inject;

import java.util.List;
import java.util.Map;

@Controller("idm/api/permissions")
public class PermissionController {

    @Inject
    PermissionService permissionService;


    @Get
    public Map<String,List<PermissionDTO>> getAllPermissions(){
        return permissionService.getAllPermissions();
    }


    @Get("/search/{feature}")
    public Map<String, List<PermissionDTO>> getPermissionBySpecificFeature(@PathVariable String feature){
        return permissionService.getPermissionByFeature(feature);
    }
}
