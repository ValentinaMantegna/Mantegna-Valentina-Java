package com.alphatrasporti.controller;


import com.alphatrasporti.model.Fermata;
import com.alphatrasporti.repository.FermataRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value= "fermata/")

public class FermataController {

    @GetMapping(value = "/selectAllFermate")
    public static List<Fermata> selectFermate()
    {
        return FermataRepository.selezionaAllFermate();
    }

@GetMapping"  "
}
