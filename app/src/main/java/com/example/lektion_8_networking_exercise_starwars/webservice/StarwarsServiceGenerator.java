package com.example.lektion_8_networking_exercise_starwars.webservice;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class StarwarsServiceGenerator {
    private static PersonAPI personAPI;
    private static PlanetAPI planetAPI;

    public static PersonAPI getPersonAPI() {
        if (personAPI == null) {
            personAPI = new Retrofit.Builder()
                    .baseUrl("https://swapi.dev")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(PersonAPI.class);
        }
        return personAPI;
    }

    public static PlanetAPI getPlanetAPI() {
        if (planetAPI == null) {
            planetAPI = new Retrofit.Builder()
                    .baseUrl("https://swapi.dev")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(PlanetAPI.class);
        }
        return planetAPI;
    }
}
