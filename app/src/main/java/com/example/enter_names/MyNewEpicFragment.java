package com.example.enter_names;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.enter_names.databinding.FragmentLayoutEpicBinding;
import com.example.enter_names.libraries.DialogFragmentHelper;

public class MyNewEpicFragment extends DialogFragmentHelper {

    private FragmentLayoutEpicBinding binder;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binder = FragmentLayoutEpicBinding.inflate(inflater);

        return binder.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binder.closebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyNewEpicFragment.this.dismiss();
            }
        });
    }
}
