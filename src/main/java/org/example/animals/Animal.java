package org.example.animals;

import org.example.plants.Plant;

import java.util.List;

public abstract class Animal<T> implements Eatable<T> {
    protected String name;
    protected int population;
    protected T food;
    protected double optimalTemp;
    protected double optimalWater;

    public Animal(String name, int population, T food, double optimalTemp, double optimalWater) {
        this.name = name;
        this.population = population;
        this.food = food;
        this.optimalTemp = optimalTemp;
        this.optimalWater = optimalWater;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean isEating(double tempEcosystem, double waterEcosystem, List<T> allPlantsEcosystem) {
        if (tempEcosystem <= optimalTemp + 20
                && tempEcosystem >= optimalTemp - 20
                && waterEcosystem <= optimalWater + 20
                && waterEcosystem >= optimalWater - 20
                && waterEcosystem >= 1
                && allPlantsEcosystem.contains(food)

        ){
            return true;
        }
        else return false;
    }
}
