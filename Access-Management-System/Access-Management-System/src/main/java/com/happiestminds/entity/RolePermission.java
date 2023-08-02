//package com.happiestminds.entity;
//
//import lombok.Data;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "role_permission")
//@Data
//public class RolePermission {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ID", length = 20)
//    private Long id;
//
//    @ManyToOne
//    @JoinColumn(name = "ROLE_ID")
//    private Role role;
//
//    @ManyToOne
//    @JoinColumn(name = "PERMISSION_ID")
//    private Permission permission;
//
//}
