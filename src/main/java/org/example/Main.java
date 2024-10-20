package org.example;

import org.example.Ecosystems.Ecosystem;
import org.example.animals.Animal;
import org.example.animals.Herbivore;
import org.example.plants.Plant;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Plant plant = new Plant("grass",1500,"rock", 15,50,15,70);
        Plant plant1 = new Plant("grass1",1500,"aaa", 15,50,15,70);
        Plant plant2 = new Plant("grass2",1500,"rock", 15,50,15,70);
        Plant plant3 = new Plant("grass3",1500,"ddd", 15,50,15,70);

        List<String> resources = Arrays.asList("aaa", "ddd","rock");

        Herbivore deer = new Herbivore("deer", 100, plant, 20,15);
        Herbivore cow = new Herbivore("cow", 80, plant3, 20,15);

        List<Plant> plants = Arrays.asList(plant,plant1,plant2,plant3);

        List<Animal> animals = Arrays.asList(deer,cow);

        Ecosystem ecosystem = new Ecosystem(plants, animals,resources,15, 45, 20,78);

        ecosystem.getStatus();

        //plants.stream().forEach(x -> x.isGrowing());

    }
}