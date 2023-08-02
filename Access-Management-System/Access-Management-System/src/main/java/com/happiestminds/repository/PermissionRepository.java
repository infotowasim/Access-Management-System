package com.happiestminds.repository;

import com.happiestminds.entity.Permission;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface PermissionRepository extends JpaRepository<Permission,Long> {
    List<Permission> findAll();

    List<Permission> findByFeature(String feature);
}
