package ru.alex.ras.test_rep.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.alex.ras.test_rep.domain.SimpleClass;

@Service
public class MyServiceImpl implements MyService {

    @Override
    public SimpleClass getSayHello() {

        return SimpleClass.builder().hello("Hello Java World").build();
    }
}
