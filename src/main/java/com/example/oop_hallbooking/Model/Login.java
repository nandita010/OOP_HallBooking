package com.example.oop_hallbooking.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
    private Long id;
    private long reservationId;

    @NotBlank
    private int time;

    @NotBlank
    private String date;

    @NotBlank
    private String sport;

    @NotBlank
    private String user;

}
