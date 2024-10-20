package org.example;

import org.example.plants.Plant;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Plant plant = new Plant("grass",1500,"rock", 15,50,15,70);
        Plant plant1 = new Plant("grass1",1500,"aaa", 15,50,15,70);
        List<String> str = Arrays.asList("aaa", "ddd","rock");
        System.out.println(plant.isGrowing(11, 55, 20, 75, str));

        List<Plant> plants = Arrays.asList(plant,plant1);
        //plants.stream().forEach(x -> x.isGrowing());

    }
}