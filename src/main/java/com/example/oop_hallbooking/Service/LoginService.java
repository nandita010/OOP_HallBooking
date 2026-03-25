package com.example.oop_hallbooking.Service;

import com.example.oop_hallbooking.Model.Login;
import com.example.oop_hallbooking.Repository.LoginRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {

    private List<Login> logins;
    private final LoginRepo loginRepo;

    public LoginService(LoginRepo loginRepo){
        this.loginRepo = loginRepo;
    }

    public Login addLogins(Login login){
        logins = loginRepo.findAll();

        loginRepo.save(login);
        return login;
    }

    //Get All
    public List<Login> getAllLogins(){
        return loginRepo.findAll();
    }

}
