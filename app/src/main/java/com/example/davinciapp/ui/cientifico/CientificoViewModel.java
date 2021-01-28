package com.example.davinciapp.ui.cientifico;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CientificoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CientificoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("El inventor y pintor Leonardo da Vinci documentó el fenómeno, conocido como salto hidráulico u onda estacionaria, en el siglo XVI. Los saltos hidráulicos son inofensivos en los fregaderos, pero pueden causar olas violentas, turbulencias y remolinos en aguas más profundas");
    }

    public LiveData<String> getText() {
        return mText;
    }
}