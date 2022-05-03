package com.example.lektion_8_networking_exercise_starwars.webservice;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface StarWarsAPI {
    //API:
    //https://swapi.dev/

    @GET("api/people/{number}")
    Call<PersonResponse> getPerson(@Path("number") int number);

    @GET("api/planets/{number}")
    Call<PlanetResponse> getPlanet(@Path("number") int number);
}
