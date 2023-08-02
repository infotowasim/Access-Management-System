package com.happiestminds.service;

import com.happiestminds.dto.PermissionDTO;
import com.happiestminds.entity.Permission;
import com.happiestminds.repository.PermissionRepository;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Singleton
public class PermissionService {

    @Inject
    PermissionRepository permissionRepository;

    public Map<String, List<PermissionDTO>> getAllPermissions() {
        Map<String, List<PermissionDTO>> permissionMap=new HashMap<>();
        List<Permission> permissionList=permissionRepository.findAll();
        for (Permission permission : permissionList) {
            List<PermissionDTO> permissionDTO=new ArrayList<>();
            for (Permission permission1:permissionRepository.findByFeature(permission.getFeature())) {
                PermissionDTO permissionDTO1=new PermissionDTO();
                permissionDTO1.setId(permission.getId());
                permissionDTO1.setName(permission.getName());
                permissionDTO1.setDescription(permission.getDescription());
                permissionDTO1.setStatus(permission.getStatus());
                permissionDTO.add(permissionDTO1);
                permissionMap.put(permission1.getFeature(),permissionDTO);
            }
        }
        return permissionMap;
    }

    public Map<String ,List<PermissionDTO>> getPermissionByFeature(String feature) {
        Map<String, List<PermissionDTO>> permissionByFeature = new HashMap<>();
        List<Permission> byFeature = permissionRepository.findByFeature(feature);
        List<PermissionDTO> dtos = new ArrayList<>();
        for (Permission permission : byFeature) {
            PermissionDTO permissionDTOS = new PermissionDTO();
            permissionDTOS.setId(permission.getId());
            permissionDTOS.setName(permission.getName());
            permissionDTOS.setDescription(permission.getDescription());
            permissionDTOS.setStatus(permission.getStatus());
            dtos.add(permissionDTOS);
        }
        permissionByFeature.put(feature, dtos);
        return permissionByFeature;
    }
}

