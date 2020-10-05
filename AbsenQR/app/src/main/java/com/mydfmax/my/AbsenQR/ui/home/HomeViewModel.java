package com.mydfmax.my.AbsenQR.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Klik di bawah ini untuk Scann");
    }

    public LiveData<String> getText() {
        return mText;
    }
}