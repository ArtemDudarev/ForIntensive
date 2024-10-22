package org.example.animals;

import org.example.plants.Plant;

import java.util.List;

public abstract class Animal<T> implements Eatable<T> {
    protected String name;
    protected int population;
    protected List<T> food;
    protected double optimalTemp;
    protected double optimalWater;

    public Animal(String name, int population, List<T> food, double optimalTemp, double optimalWater) {
        this.name = name;
        this.population = population;
        this.food = food;
        this.optimalTemp = optimalTemp;
        this.optimalWater = optimalWater;
    }

    public String getName() {
        return name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public boolean isEating(double tempEcosystem, double waterEcosystem, List<T> allPlantsEcosystem) {
        if (tempEcosystem <= optimalTemp + 20
                && tempEcosystem >= optimalTemp - 20
                && waterEcosystem <= optimalWater + 20
                && waterEcosystem >= optimalWater - 20
                && waterEcosystem >= 1
                && food.stream().anyMatch(allPlantsEcosystem::contains)

        ){
            return true;
        }
        else return false;
    }
}
