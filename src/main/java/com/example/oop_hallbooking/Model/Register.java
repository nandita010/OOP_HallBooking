package com.example.oop_hallbooking.Model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;


@Data
@Builder
public class Register {

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Must enter a valid Email")
    private String email;

    @NotBlank
    private LocalDate dob;

    @NotBlank(message = "Password is required")
    @Valid
    private String password;


}
