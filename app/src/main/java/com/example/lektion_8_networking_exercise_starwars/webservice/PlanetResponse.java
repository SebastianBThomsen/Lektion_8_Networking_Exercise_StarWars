package com.example.lektion_8_networking_exercise_starwars.webservice;

public class PlanetResponse {
    private String name, climate, gravity, terrain;
    private int rotation_period, orbital_period, diameter;
    //private int surface_Water //FIXME: Spørg kasper hvorfor dette ikke virker på person 33? (Linke 70-71 StarWarsRepository)
    private double population;


    public Planet getPlanet() {
        Planet planet = new Planet(name, climate, gravity, terrain, rotation_period,
                orbital_period, diameter, population);

        return planet;
    }
}
