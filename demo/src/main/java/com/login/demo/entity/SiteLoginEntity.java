package com.login.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class SiteLoginEntity {

    @OneToOne
    private  UserEntity Userid;
    private Long pwd;
    private String siteId;
    private String name;
    private String phone;

    @Id
    @Column(name = "site_Login_Id")
    private Long id;
}
