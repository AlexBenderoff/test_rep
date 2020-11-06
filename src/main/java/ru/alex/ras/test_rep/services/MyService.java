package ru.alex.ras.test_rep.services;

import org.springframework.http.ResponseEntity;
import ru.alex.ras.test_rep.domain.SimpleClass;

public interface MyService {
    SimpleClass getSayHello();
}
