package com.example.lektion_8_networking_exercise_starwars.webservice;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.internal.EverythingIsNonNull;

public class PersonRepository {
    private static PersonRepository instance;
    private final MutableLiveData<Person> searchedPerson;
    private final MutableLiveData<Planet> searchedPlanet;

    private PersonRepository() {
        searchedPerson = new MutableLiveData<>();
        searchedPlanet = new MutableLiveData<>();
    }

    public static synchronized PersonRepository getInstance() {
        if (instance == null) {
            instance = new PersonRepository();
        }
        return instance;
    }

    public LiveData<Person> getSearchedPerson() {
        return searchedPerson;
    }

    public LiveData<Planet> getSearchedPlanet() {
        return searchedPlanet;
    }

    public void searchForPerson(int personId) {
        PersonAPI personAPI = StarwarsServiceGenerator.getPersonAPI();
        Call<PersonResponse> call = personAPI.getPerson(personId);
        call.enqueue(new Callback<PersonResponse>() {
            @EverythingIsNonNull
            @Override
            public void onResponse(Call<PersonResponse> call, Response<PersonResponse> response) {
                if (response.isSuccessful()) {
                    searchedPerson.setValue(response.body().getPerson());
                    searchForPlanet(searchedPerson.getValue().getHomeworld());
                }
            }

            @EverythingIsNonNull
            @Override
            public void onFailure(Call<PersonResponse> call, Throwable t) {
                Log.i("Retrofit", "Something went wrong :(\n" + t.getMessage());
            }
        });


    }

    private void searchForPlanet(String homeworld) {
        Log.d("Retrofit", "Homeworld String:  " + homeworld);
        String[] split = homeworld.split("/");
        //split[5] = number!
        try {
            int planetNumber = Integer.valueOf(split[5]);

            PlanetAPI planetAPI = StarwarsServiceGenerator.getPlanetAPI();
            Call<PlanetResponse> call = planetAPI.getPlanet(planetNumber);
            call.enqueue(new Callback<PlanetResponse>() {
                @EverythingIsNonNull
                @Override
                public void onResponse(Call<PlanetResponse> call, Response<PlanetResponse> response) {
                    if (response.isSuccessful()) {
                        searchedPlanet.setValue(response.body().getPlanet());
                        Log.i("Retrofit", "SUCCESS! - Planet searched for: " + response.body().getPlanet());
                    }
                }

                @EverythingIsNonNull
                @Override
                public void onFailure(Call<PlanetResponse> call, Throwable t) {
                    Log.i("Retrofit", "Something went wrong :(\n" + t.getMessage());
                }
            });
        } catch (Exception e) {
            Log.i("Retrofit", "splitting string to integer failed! :(\n" + e.getMessage());
        }


        //Log.d("Retro", "searchForPlanet - split 1: "+ split[5]);


    }
}
