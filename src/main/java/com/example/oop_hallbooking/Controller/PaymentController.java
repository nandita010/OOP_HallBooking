package com.example.oop_hallbooking.Controller;

import com.example.oop_hallbooking.Model.Reservation;
import com.example.oop_hallbooking.Service.LoginService;
import com.example.oop_hallbooking.Service.PaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payment/{reservationId}")
    public Reservation payReservation(@PathVariable long reservationId) {
            return paymentService.payReservation(reservationId);
    }

}
