package org.example;

public class Animal implements Eatable {
    String name;
    int population;
    String food;
    double optimalTemp;
    double optimalHumidity;
    double optimalWater;

    @Override
    public void eat() {
        //проверка на возможность есть в этой экосистема
    }
}
