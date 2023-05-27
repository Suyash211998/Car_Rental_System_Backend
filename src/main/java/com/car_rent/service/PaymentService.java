package com.car_rent.service;

import java.util.List;

import com.car_rent.model.Payment;

public interface PaymentService {
	void add(Payment payment);
	void removeByid(int id);
	Payment getById(int id);
	List<Payment> getAll();
}
