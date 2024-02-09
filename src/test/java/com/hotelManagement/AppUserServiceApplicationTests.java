package com.hotelManagement;

import com.hotelManagement.Dto.request.UserRequest;
import com.hotelManagement.service.UserService;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AppUserServiceApplicationTests {
	@Autowired
	private UserService userService;


	private UserRequest userRequest1;
	private UserRequest userRequest2;

	@BeforeEach
	void setUp() {

		userRequest1 = new UserRequest();
		userRequest1.setUsername("best Ugo");
		userRequest1.setPassword("password");
		userRequest1.setCountry("Nigeria");
		userRequest1.setEmailAddress("bestUgo@gmail.com");
		userRequest1.setPhoneNumber("081065445678");
		userRequest1.setNameOfCompany("kMG");

		userRequest2 = new UserRequest();
		userRequest2.setUsername("dera girl");
		userRequest2.setPassword("password");
		userRequest2.setCountry("Nigeria");
		userRequest2.setEmailAddress("deraDelight@gmail.com");
		userRequest2.setPhoneNumber("090123456");
		userRequest2.setNameOfCompany("semicolon");
	}


	@Test
	void registerUser() {
		assertDoesNotThrow(() -> {
        userService.createUser(userRequest2);

		});

	}
 @Test
	void  deleteAllUser(){
		assertEquals(1,userService.deleteAllUser());
 }
  @Test
	void loginInUser(){
		assertEquals("YmVzdFVnb0BnbWFpbC5jb20uVVNFUg==",
				userService.simpleLogin("password","bestUgo@gmail.com"));

  }
}
