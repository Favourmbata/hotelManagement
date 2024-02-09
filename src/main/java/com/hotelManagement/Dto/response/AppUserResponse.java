package com.hotelManagement.Dto.response;

import lombok.*;

@Getter
@Setter
public class AppUserResponse {
    private String username;
    private String phoneNumber;
    private  String emailAddress;
    private String nameOfCompany;
    private  String country;
}
