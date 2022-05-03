package com.example.lektion_8_networking_exercise_starwars.webservice;

public class Planet {
    private String name, climate, gravity, terrain;
    private int rotation_period, orbital_period, diameter, surface_water, population;

    public Planet(String name, String climate, String gravity, String terrain, int rotation_period, int orbital_period, int diameter, int surface_water, int population) {
        this.name = name;
        this.climate = climate;
        this.gravity = gravity;
        this.terrain = terrain;
        this.rotation_period = rotation_period;
        this.orbital_period = orbital_period;
        this.diameter = diameter;
        this.surface_water = surface_water;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public String getGravity() {
        return gravity;
    }

    public void setGravity(String gravity) {
        this.gravity = gravity;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public int getRotation_period() {
        return rotation_period;
    }

    public void setRotation_period(int rotation_period) {
        this.rotation_period = rotation_period;
    }

    public int getOrbital_period() {
        return orbital_period;
    }

    public void setOrbital_period(int orbital_period) {
        this.orbital_period = orbital_period;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getSurface_water() {
        return surface_water;
    }

    public void setSurface_water(int surface_water) {
        this.surface_water = surface_water;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
