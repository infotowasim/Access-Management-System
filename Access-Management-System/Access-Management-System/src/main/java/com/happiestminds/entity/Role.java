//package com.happiestminds.entity;
//
//import lombok.Data;
//import org.hibernate.annotations.CreationTimestamp;
//import org.hibernate.annotations.UpdateTimestamp;
//
//import javax.persistence.*;
//import java.util.Date;
//
//@Entity
//@Table(name = "role")
//@Data
//public class Role {
//
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ID")
//    private Long id;
//
//    @Column(name = "NAME")
//    private String name;
//
//    @Column(name = "DESCRIPTION")
//    private String description;
//
//    @Column(name = "FEATURE")
//    private String feature;
//
//    @Column(name = "TYPE")
//    private int type;
//
//    @Column(name = "STATUS")
//    private char status;
//
//    @CreationTimestamp
//    @Column(name = "CREATE_DATE")
//    private Date createDate;
//
//    @UpdateTimestamp
//    @Column(name = "LAST_UPDATE_DATE")
//    private Date lastUpdateDate;
//}
