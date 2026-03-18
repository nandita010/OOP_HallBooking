package com.example.oop_hallbooking.Service;

import com.example.oop_hallbooking.Model.Reservation;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PaymentService {
    final private ArrayList<Payment> reservations = new ArrayList<>();
    private long nextID = 1;
    public Reservation payReservation(long reservationId) {

        reservation.setReservationID(nextID++);
        Reservation.add(reservation);
        return reservation;




}

    public Reservation payReservation(long reservationId) {
    return null;
    }

