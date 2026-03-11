package com.example.oop_hallbooking.Model;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {

    private long reservationId;
    @NotBlank
    private int time;
    @NotBlank
    private String date;
    @NotBlank
    private String sport;
    @NotBlank
    private User user;

}
