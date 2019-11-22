package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.anasehife;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AnaSehifeViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public AnaSehifeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is AnaShife fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
