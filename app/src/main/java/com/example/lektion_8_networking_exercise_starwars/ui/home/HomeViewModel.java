package com.example.lektion_8_networking_exercise_starwars.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("HOME PAGE FOR STAR WARS FANS");
    }

    public LiveData<String> getText() {
        return mText;
    }
}