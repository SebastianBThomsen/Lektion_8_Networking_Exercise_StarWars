package com.example.lektion_8_networking_exercise_starwars.ui.starwars;

import androidx.lifecycle.LiveData;

import com.example.lektion_8_networking_exercise_starwars.webservice.Person;
import com.example.lektion_8_networking_exercise_starwars.webservice.Planet;

public interface StarWarsViewModel {
    LiveData<Person> getSearchedPerson();
    LiveData<Planet> getSearchedPlanet();
    void searchForPerson(int number);
}
