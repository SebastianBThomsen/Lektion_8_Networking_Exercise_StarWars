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

    private PersonRepository() {
        searchedPerson = new MutableLiveData<>();
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

    public void searchForPerson(int personId) {
        PersonAPI personAPI = StarwarsServiceGenerator.getPersonAPI();
        Call<PersonResponse> call = personAPI.getPerson(personId);
        call.enqueue(new Callback<PersonResponse>() {
            @EverythingIsNonNull
            @Override
            public void onResponse(Call<PersonResponse> call, Response<PersonResponse> response) {
                if (response.isSuccessful()) {
                    searchedPerson.setValue(response.body().getPerson());
                }
            }

            @EverythingIsNonNull
            @Override
            public void onFailure(Call<PersonResponse> call, Throwable t) {
                Log.i("Retrofit", "Something went wrong :(");
            }
        });
    }
}
