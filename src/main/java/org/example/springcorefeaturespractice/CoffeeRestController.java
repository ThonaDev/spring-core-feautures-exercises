package org.example.springcorefeaturespractice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/v1/coffees")

public class CoffeeRestController {
    // inject repository in order to return the data
    private final CoffeeRepository coffeeRepository;
    public CoffeeRestController(CoffeeRepository coffeeRepository){
        this.coffeeRepository = coffeeRepository;
    }
    @GetMapping("")
    public Map<String, Object> getAllCoffees(){
        Map<String, Object> response = new HashMap<>();

        response.put("message", "Get coffees success!");
        response.put("status_code", HttpStatus.OK.value());
        response.put("payLoad", coffeeRepository.getCoffees());
        return response;
    }
}
