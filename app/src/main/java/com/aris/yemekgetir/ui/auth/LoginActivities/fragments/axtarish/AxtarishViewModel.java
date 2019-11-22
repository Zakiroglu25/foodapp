package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.axtarish;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AxtarishViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public AxtarishViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}

