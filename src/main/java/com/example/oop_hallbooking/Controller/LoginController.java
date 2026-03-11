package com.example.oop_hallbooking.Controller;

import com.example.oop_hallbooking.Service.LoginService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    private final LoginService LoginService;

    public LoginController(LoginService logInService) {
        this.LoginService = logInService;
    }

    @GetMapping("/Name/{name}")
    public String getName(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    @GetMapping("/Email/{email}")
    public String getEmail(@PathVariable String email) {
        return "Email" + email + ": ";
    }

    @GetMapping("/DOB/{dob}")
    public String getDob(@PathVariable String dob) {
        return "Date of birth" + dob + ": ";
    }

    @GetMapping("/Pass/{pass}")
    public String getPass(@PathVariable String pass) {
        return "Password" + pass + " : ";
    }

}
    //confirm password

