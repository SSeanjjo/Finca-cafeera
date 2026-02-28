package com.uniquindio.fincaCafetera.services;

import com.uniquindio.fincaCafetera.entity.CoffeeType;
import com.uniquindio.fincaCafetera.repository.CoffeeTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeTypeService {
    private final CoffeeTypeRepository repo;

    public CoffeTypeService(CoffeeTypeRepository repo){
        this.repo = repo;
    }

    //Save a new coffee type
    public CoffeeType saveCoffeeType(CoffeeType coffeeType){
       return repo.save(coffeeType);
    }

    public List<CoffeeType> getAllCoffeeTypes(){
        return repo.findAll();
    }

}
