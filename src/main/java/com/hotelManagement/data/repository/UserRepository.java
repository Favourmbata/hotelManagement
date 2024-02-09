package com.hotelManagement.data.repository;

import com.hotelManagement.data.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <AppUser,Long> {

    AppUser findByEmailAddress(String email);

    boolean existsByEmailAddress(String emailAddress);


    boolean existsByPhoneNumber(String phoneNumber);

}
