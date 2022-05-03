package com.example.lektion_8_networking_exercise_starwars.webservice;

public class PlanetResponse {
    private String name, climate, gravity, terrain;
    private int rotation_period, orbital_period, diameter, surface_water;
    private double population;


    public Planet getPlanet() {
        return new Planet(name, climate, gravity, terrain, rotation_period,
                orbital_period, diameter, surface_water, population);
    }
}
