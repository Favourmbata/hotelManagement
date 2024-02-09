package com.hotelManagement.service;

import com.hotelManagement.Dto.request.UserRequest;
import com.hotelManagement.Dto.response.AppUserResponse;
import com.hotelManagement.data.model.AppUser;

import java.util.List;

public interface UserService {

   String simpleLogin(String password, String email);
     AppUser findByEmail(String email);
     List<AppUser>  findAllUser(String token);
     String bookRoom(String token, int money);

    AppUserResponse createUser(UserRequest userRequest);

    long deleteAllUser();
}