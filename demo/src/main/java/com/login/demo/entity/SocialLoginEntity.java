package com.login.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class SocialLoginEntity {

    @OneToOne
    private UserEntity userId;
    private String email;

    @Id
    @Column(name = "social_login_id")
    private Long socialLoginId;
}
