package org.example.Ecosystems;

import org.example.animals.Animal;
import org.example.animals.Herbivore;
import org.example.plants.Plant;

import java.util.List;

public class Ecosystem {
    private List<Plant> plants;
    private List<Animal> animals;
    private List<String> resources;
    private double temperature;
    private double humidity;
    private double water;
    private double light;

    public Ecosystem(List<Plant> plants, List<Animal> animals, List<String> resources, double temperature, double humidity, double water, double light) {
        this.plants = plants;
        this.animals = animals;
        this.resources = resources;
        this.temperature = temperature;
        this.humidity = humidity;
        this.water = water;
        this.light = light;
    }

    public void getStatus(){
        System.out.println("\n The state of all plants in the ecosystem: ");
        plants.stream().forEach(x-> System.out.println( "The plant " + x.getName()+ " is " + (x.isGrowing(temperature, humidity, water, light, resources) ? "survived" : "died")));
        System.out.println("\n The state of all animals in the ecosystem: ");

        // Если растение не выжило, то его необходимо удалить из списка, чтобы животные, которые зависят от него, тоже вымерли

        animals.stream().forEach(x ->  {
            String result = (x instanceof Herbivore ? x.isEating(temperature, water, plants) : x.isEating(temperature, water, animals)) ? "survived" : "died";
            System.out.println("The animal " + x.getName()+ " is " + result);
        });
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
