package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.sebet;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SebetViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public SebetViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}