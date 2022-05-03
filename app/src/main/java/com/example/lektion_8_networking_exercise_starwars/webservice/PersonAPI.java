package com.example.lektion_8_networking_exercise_starwars.webservice;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PersonAPI {
    @GET("api/people/{number}")
    Call<PersonResponse> getPerson(@Path("number") int number);
}
