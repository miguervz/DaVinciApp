package com.example.davinciapp.ui.Escultor;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EscultorHomeView extends ViewModel {

    private MutableLiveData<String> mText;

    public EscultorHomeView() {
        mText = new MutableLiveData<>();
        mText.setValue("La única escultura que Leonardo Da Vinci habría realizado lleva cerca de 50 años a la vista de todos. Unas cuatro millones de personas la visitan cada año en el Museo Victoria & Albert de Londres, donde se exhibe como una de sus piezas más célebres bajo la autoría del artista Antonio Rossellino. ");
    }

    public LiveData<String> getText() {
        return mText;
    }
}