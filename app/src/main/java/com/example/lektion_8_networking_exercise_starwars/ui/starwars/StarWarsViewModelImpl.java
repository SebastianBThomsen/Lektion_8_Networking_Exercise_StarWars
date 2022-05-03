package com.example.lektion_8_networking_exercise_starwars.ui.starwars;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.lektion_8_networking_exercise_starwars.webservice.Person;
import com.example.lektion_8_networking_exercise_starwars.webservice.PersonRepository;
import com.example.lektion_8_networking_exercise_starwars.webservice.Planet;

public class StarWarsViewModelImpl extends ViewModel implements StarWarsViewModel{
    PersonRepository personRepository;

    public StarWarsViewModelImpl() {
        personRepository = PersonRepository.getInstance();
    }

    public LiveData<Person> getSearchedPerson() {
        return personRepository.getSearchedPerson();
    }

    @Override
    public LiveData<Planet> getSearchedPlanet() {
        Log.i("Retrofit", "getSearchedPlanet: " + personRepository.getSearchedPlanet());
        return personRepository.getSearchedPlanet();
    }

    public void searchForPerson(int number) {
        personRepository.searchForPerson(number);
    }
}