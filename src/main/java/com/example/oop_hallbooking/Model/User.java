package com.example.oop_hallbooking.Model;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class User {

    private long id;
    private String name;
    private String email;
    private String dob;
    private String password;


}
