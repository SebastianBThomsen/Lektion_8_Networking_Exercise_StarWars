package com.example.lektion_8_networking_exercise_starwars.webservice;

public class Starship {
    private String name, model, manufacturer, consumables, starship_class, crew, passengers;
    //	"max_atmosphering_speed": "n/a",
    private int cost_in_credits, length, cargo_capacity, MGLT;
    private double hyperdrive_rating;

    public Starship(String name, String model, String manufacturer, String consumables, String starship_class, String crew, String passengers, int cost_in_credits, int length, int cargo_capacity, int MGLT, double hyperdrive_rating) {
        this.name = name;
        this.model = model;
        this.manufacturer = manufacturer;
        this.consumables = consumables;
        this.starship_class = starship_class;
        this.crew = crew;
        this.passengers = passengers;
        this.cost_in_credits = cost_in_credits;
        this.length = length;
        this.cargo_capacity = cargo_capacity;
        this.MGLT = MGLT;
        this.hyperdrive_rating = hyperdrive_rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getConsumables() {
        return consumables;
    }

    public void setConsumables(String consumables) {
        this.consumables = consumables;
    }

    public String getStarship_class() {
        return starship_class;
    }

    public void setStarship_class(String starship_class) {
        this.starship_class = starship_class;
    }

    public String getCrew() {
        return crew;
    }

    public void setCrew(String crew) {
        this.crew = crew;
    }

    public String getPassengers() {
        return passengers;
    }

    public void setPassengers(String passengers) {
        this.passengers = passengers;
    }

    public int getCost_in_credits() {
        return cost_in_credits;
    }

    public void setCost_in_credits(int cost_in_credits) {
        this.cost_in_credits = cost_in_credits;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getCargo_capacity() {
        return cargo_capacity;
    }

    public void setCargo_capacity(int cargo_capacity) {
        this.cargo_capacity = cargo_capacity;
    }

    public int getMGLT() {
        return MGLT;
    }

    public void setMGLT(int MGLT) {
        this.MGLT = MGLT;
    }

    public double getHyperdrive_rating() {
        return hyperdrive_rating;
    }

    public void setHyperdrive_rating(double hyperdrive_rating) {
        this.hyperdrive_rating = hyperdrive_rating;
    }
}
