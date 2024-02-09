package com.hotelManagement.utils;

import com.hotelManagement.Dto.request.UserRequest;
import com.hotelManagement.Dto.response.AppUserResponse;
import com.hotelManagement.data.model.AppUser;
import com.hotelManagement.data.model.Role;
import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
public class Mapper {

    public static AppUser map( UserRequest userRequest) {
        AppUser appUser = new AppUser();
        appUser.setUsername(userRequest.getUsername());
        appUser.setPassword(userRequest.getPassword());
        appUser.setCountry(userRequest.getCountry());
        appUser.setPhoneNumber(userRequest.getPhoneNumber());
        appUser.setEmailAddress(userRequest.getEmailAddress());
        appUser.setNameOfCompany(userRequest.getNameOfCompany());
        appUser.setDateOfCreation(LocalDateTime.now());
        return appUser;

    }

    public static AppUserResponse map(AppUser saveUser) {
        AppUserResponse    appUserResponse = new AppUserResponse();
                appUserResponse.setUsername(appUserResponse.getUsername());
                appUserResponse.setEmailAddress(appUserResponse.getEmailAddress());
                appUserResponse.setPhoneNumber(appUserResponse.getPhoneNumber());
               appUserResponse.setNameOfCompany(appUserResponse.getNameOfCompany());
               appUserResponse.setCountry(appUserResponse.getCountry());
                return appUserResponse;
    }
}
