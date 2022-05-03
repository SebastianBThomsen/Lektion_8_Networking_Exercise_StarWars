package com.example.lektion_8_networking_exercise_starwars.webservice;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class StarWarsServiceGenerator {
    private static StarWarsAPI starwarsAPI;

    public static StarWarsAPI getStarwarsAPI() {
        if (starwarsAPI == null) {
            starwarsAPI = new Retrofit.Builder()
                    .baseUrl("https://swapi.dev")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(StarWarsAPI.class);
        }
        return starwarsAPI;
    }
}
