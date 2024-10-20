package org.example.animals;

import java.util.List;

public class Carnivore extends Animal<Herbivore> {
    @Override
    public boolean isEating(double tempEcosystem, double waterEcosystem, List<Herbivore> allHerbivoreEcosystem) {
        if (tempEcosystem <= optimalTemp + 20
                && tempEcosystem >= optimalTemp - 20
                && waterEcosystem <= optimalWater + 20
                && waterEcosystem >= optimalWater - 20
                && waterEcosystem >= 1
                && allHerbivoreEcosystem.contains(food)

        ){
            return true;
        }
        else return false;
    }
}
