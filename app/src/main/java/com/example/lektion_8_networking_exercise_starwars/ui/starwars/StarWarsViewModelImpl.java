package com.example.lektion_8_networking_exercise_starwars.ui.starwars;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.lektion_8_networking_exercise_starwars.webservice.Person;
import com.example.lektion_8_networking_exercise_starwars.webservice.StarWarsRepository;
import com.example.lektion_8_networking_exercise_starwars.webservice.Planet;

public class StarWarsViewModelImpl extends ViewModel implements StarWarsViewModel{
    StarWarsRepository starWarsRepository;

    public StarWarsViewModelImpl() {
        starWarsRepository = StarWarsRepository.getInstance();
    }

    public LiveData<Person> getSearchedPerson() {
        return starWarsRepository.getSearchedPerson();
    }

    @Override
    public LiveData<Planet> getSearchedPlanet() {
        Log.i("Retrofit", "getSearchedPlanet: " + starWarsRepository.getSearchedPlanet());
        return starWarsRepository.getSearchedPlanet();
    }

    public void searchForPerson(int number) {
        starWarsRepository.searchForPerson(number);
    }
}