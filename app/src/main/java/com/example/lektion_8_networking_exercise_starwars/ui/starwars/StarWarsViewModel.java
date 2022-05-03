package com.example.lektion_8_networking_exercise_starwars.ui.starwars;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.lektion_8_networking_exercise_starwars.webservice.Person;
import com.example.lektion_8_networking_exercise_starwars.webservice.PersonRepository;

public class StarWarsViewModel extends ViewModel {
    PersonRepository personRepository;

    public StarWarsViewModel() {
        personRepository = PersonRepository.getInstance();
    }

    public LiveData<Person> getSearchedPerson() {
        return personRepository.getSearchedPerson();
    }

    public void searchForPerson(int number) {
        personRepository.searchForPerson(number);
    }
}