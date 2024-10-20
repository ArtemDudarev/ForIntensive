package org.example.animals;

import java.util.List;

public abstract class Animal<T> implements Eatable<T> {
    protected String name;
    protected int population;
    protected T food;
    protected double optimalTemp;
    protected double optimalWater;

}
