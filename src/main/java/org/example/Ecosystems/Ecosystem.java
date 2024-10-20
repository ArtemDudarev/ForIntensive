package org.example.Ecosystems;

import org.example.animals.Animal;
import org.example.plants.Plant;

import java.util.List;

public class Ecosystem {
    private List<Plant> plants;
    private List<Animal> animals;
    private double temperature;
    private double humidity;
    private double water;

    public Ecosystem(List<Plant> plants, List<Animal> animals, double temperature, double humidity, double water) {
        this.plants = plants;
        this.animals = animals;
        this.temperature = temperature;
        this.humidity = humidity;
        this.water = water;
    }

    public void getStatus(){
        System.out.println("The state of all plants in the ecosystem");
        plants.stream().forEach(x->x.test(this));
        System.out.println("The state of all animals in the ecosystem");

    }
    public void predictPopulationChange(Plant plant) {
        // Прогнозирует изменение популяции растения
    }

    public void predictPopulationChange(Animal animal) {
        // Прогнозирует изменение популяции животного
    }

    public void updateEcosystem() {
        // Обновляет состояние экосистемы (рост растений, охота животных,
        // изменение климатических условий)
    }
}
