package com.example.mashupstudyuser.user;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="darom")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //기본키
    private Long id;

    @Column(nullable = false)
    private String userId;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String name;

    public User() {

    }

    public User(String userId, String password, String name) {
        this.userId = userId;
        this.password = password;
        this.name = name;
    }
}
