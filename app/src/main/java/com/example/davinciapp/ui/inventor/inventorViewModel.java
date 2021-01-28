package com.example.davinciapp.ui.inventor;

import android.content.res.Resources;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class inventorViewModel extends ViewModel {
    private MutableLiveData<String> mText;


    public inventorViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Aunque el primer helicóptero de la historia fue construido en el siglo XX, en la década de los 40, varios siglos antes Leonardo Da Vinci ya había pensado en un aparato en forma de hélice para surcar los cielos.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}