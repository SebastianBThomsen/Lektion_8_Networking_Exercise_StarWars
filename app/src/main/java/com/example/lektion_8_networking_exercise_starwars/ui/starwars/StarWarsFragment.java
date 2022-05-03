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

    private StarWarsViewModel starWarsViewModel;
    private FragmentStarWarsBinding binding;

    private Button searchButton;
    private TextView name, hairColour, skinColour, gender, eyeColour, birthYear;
    private TextView height, mass;
    private EditText searchField;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        starWarsViewModel = new ViewModelProvider(this).get(StarWarsViewModel.class);

        binding = FragmentStarWarsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        bindings();

        starWarsViewModel.getSearchedPerson().observe(getViewLifecycleOwner(), person -> {
            name.setText(person.getName());
            hairColour.setText(person.getHair_color());
            skinColour.setText(person.getSkin_color());
            gender.setText(person.getGender());
            //Glide.with(this).load(dog.getImageURL()).into(imageView);

        });


        searchButton.setOnClickListener(view -> {
            starWarsViewModel.searchForPerson(Integer.parseInt(searchField.getText().toString()));
        });


        return root;
    }

    private void bindings() {
        searchButton = binding.buttonSearch;
        searchField = binding.editTextSearchText;

        name = binding.textViewName;
        hairColour = binding.textViewHairColour;
        skinColour = binding.textViewSkinColour;
        gender = binding.textViewGender;
        eyeColour = binding.;
        birthYear = binding.;
        height = binding.;
        mass = binding.;
    }

}