package com.example.esercitazione_controller_get_completa;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2")
public class OggettoController {

    final String provincia = "Lombardia";

@GetMapping(path = "/ciao/" + provincia)
public Saluto salutami (
        @RequestParam(required = true) String nome,
        @RequestParam(required = false, defaultValue = "") String saluto
) {
    return new Saluto(nome, provincia, saluto);
}

}
