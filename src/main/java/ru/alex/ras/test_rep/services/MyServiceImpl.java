package ru.alex.ras.test_rep.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {

    @Override
    public String getSayHello() {
        return "Hello Java World";
    }
}