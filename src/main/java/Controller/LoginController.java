package ie.atu.oop_hallbookingproject.Controller;

import Service.LoginService;
import ie.atu.oop_hallbookingproject.Service.LogInService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    private final LoginService LogInService;

    public LoginController(LoginService logInService) {
        this.LoginService = logInService;
    }

    @GetMapping("/Name/{name}")
    public String getName(@RequestParam String name)
    {
        return "Hello " + name + "!";
    }

    @GetMapping("/Email/{email}")
    public String getEmail(@RequestParam String email)
    {
        return "Email: " + email + "!";
    }

}


//Create project Description