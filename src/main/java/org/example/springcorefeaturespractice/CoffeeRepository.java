package org.example.springcorefeaturespractice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class CoffeeRepository {

    @Bean
    public Coffee coffee1() {
        return new Coffee(101, "Ice Latte", 4500.0, true);
    }

    @Bean
    public Coffee coffee2() {
        return new Coffee(102, "Ice Americano", 6000.0, false);
    }

    @Bean
    public Coffee coffee3() {
        return new Coffee(103, "Coconut Ice Coffee", 5000.0, true);
    }

    @Bean
    public ArrayList<Coffee> coffeeList() {

        ArrayList<Coffee> coffees = new ArrayList<>();

        coffees.add(coffee1());
        coffees.add(coffee2());
        coffees.add(coffee3());

        return coffees;
    }
}