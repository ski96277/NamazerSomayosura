package com.example.namazersomayosura.fragment_class;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.namazersomayosura.R;
import com.example.namazersomayosura.databinding.RozarSomay2019Binding;

public class Rozar_somay_2019 extends Fragment {

    RozarSomay2019Binding rozarSomay2019Binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        rozarSomay2019Binding = DataBindingUtil.inflate(inflater, R.layout.rozar_somay_2019, container, false);
        View view = rozarSomay2019Binding.getRoot();
        getActivity().setTitle(R.string.rozar_somay_somuho);

        return view;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
