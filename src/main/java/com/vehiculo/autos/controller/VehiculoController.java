package com.vehiculo.autos.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class VehiculoController {

    @GetMapping("/api/v1/home")
    public String home() {
        return "Página home vehiculos";
    }

    @GetMapping("/api/v1/obtener-tipo-vehiculo/{patente}")
    public String obtenerTipoVehiculo(@PathVariable String patente) {
        if (patente.equals("ABCD12")) {
            return "El vehiculo es municipal " + patente;
        }
        return "El vehiculo es particular " + patente;
    }

    @GetMapping("/api/v1/vehiculo/{patente}")
    public String consultarVehiculo(@PathVariable String patente) {
        return "Su patente es " + patente;
    }
    @PostMapping("/api/v1/vehiculo")
    public String guardarVehiculo() {
        return "Su vehiculo ha sido guardado";
    }
}