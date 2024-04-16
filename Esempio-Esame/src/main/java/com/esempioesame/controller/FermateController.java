package com.esempioesame.controller;

import com.esempioesame.Model.Fermate;
import com.esempioesame.repository.FermateRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class FermateController {

    @GetMapping("/fermate")

    public List<Fermate> getFermate() {

        return FermateRepository.getFermate();
    }
}
