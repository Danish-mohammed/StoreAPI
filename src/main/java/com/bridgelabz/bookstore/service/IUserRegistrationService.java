package com.bridgelabz.bookstore.service;

import com.bridgelabz.bookstore.dto.LoginDto;
import com.bridgelabz.bookstore.dto.UserRegistrationDto;
import com.bridgelabz.bookstore.model.UserRegistrationData;

import java.util.List;
import java.util.Optional;

public interface IUserRegistrationService {
    List<UserRegistrationData> getUserDeatils();

    UserRegistrationData userRegistration(UserRegistrationDto userDTO);

    UserRegistrationData getUserById(int userId);

    UserRegistrationData updateUserRegistrationData(int userId, UserRegistrationDto userDTO);

    void deleteUser(int userId);

    List<UserRegistrationData> getAllUsersData();

    String verifyUser();

    Optional<UserRegistrationData> UserLogin(LoginDto logindto);

//    String forgotPassword(ForgotPasswordDto forgotpass);

//    UserRegistrationData resetPassword(ResetPassword resetPassword, String token);

    String deleteAll();
}
