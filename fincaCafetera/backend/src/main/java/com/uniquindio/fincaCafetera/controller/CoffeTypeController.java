package com.uniquindio.fincaCafetera.controller;


import com.uniquindio.fincaCafetera.entity.CoffeeType;
import com.uniquindio.fincaCafetera.services.CoffeTypeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/controller")
public class CoffeTypeController {
    private final CoffeTypeService service;

    public CoffeTypeController(CoffeTypeService service){
        this.service = service;
    }

    //Post -save the new coffe type
    @PostMapping
    public CoffeeType createCoffeeType (@RequestBody CoffeeType coffeeType){
        return service.saveCoffeeType(coffeeType);
    }

    //Get - return all coffe types

    @GetMapping
    public List<CoffeeType> getAllCoffeTypes(){
        return service.getAllCoffeeTypes();
    }
}
