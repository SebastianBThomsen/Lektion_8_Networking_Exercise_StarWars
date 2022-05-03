package com.example.lektion_8_networking_exercise_starwars.webservice;

import androidx.lifecycle.LiveData;

public interface StarWarsRepository {
    LiveData<Person> getSearchedPerson();
    LiveData<Planet> getSearchedPlanet();
    void searchForPerson(int personId);
}
