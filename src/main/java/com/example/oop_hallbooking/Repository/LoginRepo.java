package com.example.oop_hallbooking.Repository;

import com.example.oop_hallbooking.Model.Login;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoginRepo extends JpaRepository<Login, Long> {

}
