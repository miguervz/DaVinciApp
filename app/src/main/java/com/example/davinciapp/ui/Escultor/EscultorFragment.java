package com.example.davinciapp.ui.Escultor;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.davinciapp.R;

public class EscultorFragment extends Fragment {

    private EscultorHomeView escultorHomeView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        escultorHomeView =
                new ViewModelProvider(this).get(EscultorHomeView.class);
        View root = inflater.inflate(R.layout.fragment_escultor, container, false);
        final TextView textView = root.findViewById(R.id.text_escultor);
        escultorHomeView.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}