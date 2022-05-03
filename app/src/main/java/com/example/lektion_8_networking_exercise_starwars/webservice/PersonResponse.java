package com.example.lektion_8_networking_exercise_starwars.webservice;

public class PersonResponse {
    private String name, hair_color, skin_color, eye_color, birth_year, gender;
    private int height, mass;

    public Person getPerson() {
        return new Person(name, hair_color, skin_color, eye_color, birth_year, gender, height, mass);
    }
}
