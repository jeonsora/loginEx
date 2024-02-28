package com.login.demo.entity;

import jakarta.persistence.*;

@Entity
public class UserEntity {

    @Id
    private Long userId;

    @Enumerated(EnumType.STRING)
    private Auth auth;

    @Enumerated(EnumType.STRING)
    private UserType userType;

}
