package com.car_rent.service;

import java.util.List;

import com.car_rent.model.LogIn;


public interface LogInService {
void add(LogIn login);
List<LogIn>getAll();
LogIn getByUsername(String username);
}
