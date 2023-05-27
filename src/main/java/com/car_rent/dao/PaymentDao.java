package com.car_rent.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.car_rent.model.Payment;

@Repository
public interface PaymentDao extends JpaRepository<Payment, Integer> {

}
