package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.aksiyalar;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AksiyalarViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public AksiyalarViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
