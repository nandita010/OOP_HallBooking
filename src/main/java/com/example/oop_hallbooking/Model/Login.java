package com.example.oop_hallbooking.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Email is required")
    @Email(message = "Must enter a valid Email")
    private String email;

    @NotBlank(message = "Password is required")
    @Valid
    private String password;

}


//    private long reservationId;
//    private int time;
//
//    @NotBlank
//    private String date;
//
//    @NotBlank
//    private String sport;
//
//    @NotBlank
//    private String user;
