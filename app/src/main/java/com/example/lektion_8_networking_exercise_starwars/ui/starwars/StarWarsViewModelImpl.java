package com.example.lektion_8_networking_exercise_starwars.ui.starwars;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.lektion_8_networking_exercise_starwars.webservice.Person;
import com.example.lektion_8_networking_exercise_starwars.webservice.StarWarsRepositoryImpl;
import com.example.lektion_8_networking_exercise_starwars.webservice.Planet;

public class StarWarsViewModelImpl extends ViewModel implements StarWarsViewModel{
    StarWarsRepositoryImpl starWarsRepositoryImpl;

    public StarWarsViewModelImpl() {
        starWarsRepositoryImpl = StarWarsRepositoryImpl.getInstance();
    }

    public LiveData<Person> getSearchedPerson() {
        return starWarsRepositoryImpl.getSearchedPerson();
    }

    @Override
    public LiveData<Planet> getSearchedPlanet() {
        Log.i("Retrofit", "getSearchedPlanet: " + starWarsRepositoryImpl.getSearchedPlanet());
        return starWarsRepositoryImpl.getSearchedPlanet();
    }

    public void searchForPerson(int number) {
        starWarsRepositoryImpl.searchForPerson(number);
    }
}