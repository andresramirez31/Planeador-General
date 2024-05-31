package co.com.planeador.planeador.controllers;

import co.com.planeador.planeador.services.presupuestoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class presupuestoController {

    @Autowired
    private presupuestoService presupuestoservice;


}
