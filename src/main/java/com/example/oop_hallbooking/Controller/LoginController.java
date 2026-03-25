package com.example.oop_hallbooking.Controller;

import com.example.oop_hallbooking.Service.LoginService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService logInService) {
        this.loginService = logInService;
    }

    @GetMapping("/Name/{name}")
    public String getName(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    @GetMapping("/Email")
    public String getEmail(@PathVariable String email) {
        return "Email: " + email;
    }

    @GetMapping("/DOB")
    public String getDob(@PathVariable String dob) {
        return "Date of birth: " + dob;
    }

    @GetMapping("/Pass")
    public String getPass(@PathVariable String password) {
        return "Password: " + password;
    }

}
    //confirm password

