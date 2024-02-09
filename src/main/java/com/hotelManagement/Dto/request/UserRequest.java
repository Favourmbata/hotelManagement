package com.hotelManagement.Dto.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserRequest {
    private String username;
    private String phoneNumber;
    private  String emailAddress;
    private String password;
    private String nameOfCompany;
    private  String country;
}
