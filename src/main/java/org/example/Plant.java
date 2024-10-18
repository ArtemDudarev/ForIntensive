package org.example;

public class Plant implements Growable {
    String name;
    int population;
    String food;
    double optimalTemp;
    double optimalHumidity;
    double optimalWater;

    @Override
    public void grow() {
        //проверка на возможность расти в определённой среде
    }
}
