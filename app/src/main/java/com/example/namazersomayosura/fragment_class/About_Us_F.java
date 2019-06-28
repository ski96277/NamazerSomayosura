package com.example.namazersomayosura.fragment_class;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.namazersomayosura.Activity.MainActivity;
import com.example.namazersomayosura.R;
import com.example.namazersomayosura.databinding.AboutUsFBinding;

public class About_Us_F extends Fragment {
    AboutUsFBinding aboutUsFBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        aboutUsFBinding = DataBindingUtil.inflate(inflater, R.layout.about_us_f, container, false);
        View view = aboutUsFBinding.getRoot();
        getActivity().setTitle("Developer Profile");
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        MainActivity.fab.hide();
    }
}
