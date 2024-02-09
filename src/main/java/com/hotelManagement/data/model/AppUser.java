package com.hotelManagement.data.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private String username;
    private String phoneNumber;
    private  String emailAddress;
    private String nameOfCompany;
    private  String country;
    @Enumerated(EnumType.STRING)
    private Role role;
    private String password;
    private LocalDateTime dateOfCreation;

}