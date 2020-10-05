package com.mydfmax.my.AbsenQR.ui.dashboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DashboardViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DashboardViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Proses Update\nTunggu Update Selajutnya");
    }

    public LiveData<String> getText() {
        return mText;
    }
}