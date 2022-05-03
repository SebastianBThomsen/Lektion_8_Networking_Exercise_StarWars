package com.example.lektion_8_networking_exercise_starwars.ui.starwars;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.lektion_8_networking_exercise_starwars.databinding.FragmentStarWarsBinding;

public class StarWarsFragment extends Fragment {

    private StarWarsViewModelImpl starWarsViewModelImpl;
    private FragmentStarWarsBinding binding;

    private Button searchButton;
    private EditText searchField;
    //Person
    private TextView name, hairColour, skinColour, gender, eyeColour, birthYear;
    private TextView height, mass;
    //Planet
    private TextView planetName;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        starWarsViewModelImpl = new ViewModelProvider(this).get(StarWarsViewModelImpl.class);

        binding = FragmentStarWarsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        bindings();

        starWarsViewModelImpl.getSearchedPerson().observe(getViewLifecycleOwner(), person -> {
            name.setText(person.getName());
            hairColour.setText(person.getHair_color());
            skinColour.setText("Skin:" + person.getSkin_color());
            gender.setText(person.getGender());

            eyeColour.setText(person.getEye_color());
            birthYear.setText(person.getBirth_year());
            height.setText(String.valueOf(person.getHeight()));
            mass.setText(String.valueOf(person.getMass()));
            //Glide.with(this).load(dog.getImageURL()).into(imageView);
        });

        starWarsViewModelImpl.getSearchedPlanet().observe(getViewLifecycleOwner(), planet -> {
            planetName.setText(planet.getName());
        });


        searchButton.setOnClickListener(view -> {
            starWarsViewModelImpl.searchForPerson(Integer.parseInt(searchField.getText().toString()));
        });


        return root;
    }

    private void bindings() {
        searchButton = binding.buttonSearch;
        searchField = binding.editTextSearchText;

        //Person
        name = binding.textViewName;
        hairColour = binding.textViewHairColour;
        skinColour = binding.textViewSkinColour;
        gender = binding.textViewGender;
        eyeColour = binding.textViewEyeColour;
        birthYear = binding.textViewBirthYear;
        height = binding.textViewHeight;
        mass = binding.textViewMass;

        //Planet
        planetName = binding.textViewPlanetName;

    }

}