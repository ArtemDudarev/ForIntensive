package org.example.plants;

import org.example.Ecosystems.Ecosystem;

import java.util.List;

public class Plant implements Growable {
    private String name;
    private int population;
    private String food;
    private double optimalTemp;
    private double optimalHumidity; // от 0% до 100%
    private double optimalWater; // от 0% до 100%
    private double optimalLight; // от 0% до 100%

    public String getName() {
        return name;
    }

    public Plant(String name, int population, String food, double optimalTemp, double optimalHumidity, double optimalWater, double optimalLight) {
        this.name = name;
        this.population = population;
        this.food = food;
        this.optimalTemp = optimalTemp;
        this.optimalHumidity = optimalHumidity;
        this.optimalWater = optimalWater;
        this.optimalLight = optimalLight;
    }

    @Override
    public boolean isGrowing(double tempEcosystem, double humidityEcosystem, double waterEcosystem, double lightEcosystem, List<String> allResEcosystem) {

        // У растения есть оптимальные значения для выживания, однако,
        // если некоторые значения в окружающей среде будут немного отличатся, то растение все равно выживет
        // Для этого добавим определённый промежуток выживания

        // Проверка на возможность расти в определённой среде
        if (tempEcosystem <= optimalTemp + 5
                && tempEcosystem >= optimalTemp - 5
                && humidityEcosystem <= optimalHumidity + 10
                && humidityEcosystem >= optimalHumidity - 10
                && waterEcosystem <= optimalWater + 10
                && waterEcosystem >= optimalWater - 10
                && waterEcosystem >= 1
                && lightEcosystem <= optimalLight + 10
                && lightEcosystem >= optimalLight - 10
                && lightEcosystem >= 1
                && allResEcosystem.contains(food)

        ){
            return true;
        }
        else return false;
    }

    public void test(Ecosystem ecosystem){

    }
}
