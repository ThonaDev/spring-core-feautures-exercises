package org.example.springcorefeaturespractice;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CoffeeRepository {
    private final static ArrayList<Coffee> coffees = new ArrayList<>(){{
        add(new Coffee(101, "Ice Latte", 4500.0, true));
        add(new Coffee(102, "Iced Americano", 6000.0, false ));
        add(new Coffee(103, "Coconut Iced Coffee", 5000.0, true));

    }};


    // return all the coffee for rest controller
    public List<Coffee> getCoffees(){
        return coffees;
    }
}
