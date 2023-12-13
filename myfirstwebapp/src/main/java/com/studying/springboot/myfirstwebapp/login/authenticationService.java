package com.studying.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class authenticationService {

    public boolean authenticate(String username, String password){
        boolean isValidUserName = username.equalsIgnoreCase("harshit");
        boolean isValidPassword = password.equalsIgnoreCase("random");

        return isValidUserName && isValidPassword;
    }
}
