package org.example.animals;

import org.example.plants.Plant;

import java.util.List;

public class Herbivore extends Animal<Plant>{


    @Override
    public boolean isEating(double tempEcosystem, double waterEcosystem, List<Plant> allPlantsEcosystem) {
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