package com.example.lektion_8_networking_exercise_starwars.webservice;

public class PersonResponse {
    private String name, hair_color, skin_color, eye_color, birth_year, gender;
    private int height, mass;
    private String homeworld;

    public Person getPerson() {
        Person person = new Person(name, hair_color, skin_color, eye_color, birth_year, gender, height, mass);
        person.setHomeworld(homeworld);
        return person;
        //return new Person(name, hair_color, skin_color, eye_color, birth_year, gender, height, mass);
    }
}
