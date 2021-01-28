package com.example.davinciapp.ui.pintor;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PintorViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PintorViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("La última cena es una pintura mural original de Leonardo da Vinci ejecutada entre 1495 y 1498.Se encuentra en la pared sobre la que se pintó originalmente, en el refectorio del convento dominico de Santa Maria delle Grazie, en Milán.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}