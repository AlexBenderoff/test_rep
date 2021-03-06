package ru.alex.ras.test_rep.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.alex.ras.test_rep.domain.SimpleClass;
import ru.alex.ras.test_rep.services.MyService;

@RestController
@RequestMapping("/v1")
public class SimpleRestController {

    private final MyService myService;

    public SimpleRestController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping(path = "/test")
    public ResponseEntity<SimpleClass> getSayHelloMethod()
    {
        return new ResponseEntity<>(myService.getSayHello(), HttpStatus.OK);
    }


}
