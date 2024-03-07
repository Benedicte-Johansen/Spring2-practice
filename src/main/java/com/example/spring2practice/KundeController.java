package com.example.spring2practice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KundeController {
    @PostMapping("/")
    public Kunde returKunde(Kunde innKunde){
        return innKunde;
    }
}
