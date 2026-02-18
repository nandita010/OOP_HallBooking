package Service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
    private String name;
    private String email;

    public LoginService(String name) {
        this.name = name;
        this.email = email;
    }
}
