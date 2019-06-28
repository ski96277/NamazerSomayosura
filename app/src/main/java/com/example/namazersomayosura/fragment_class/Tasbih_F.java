package com.example.namazersomayosura.fragment_class;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.namazersomayosura.R;
import com.example.namazersomayosura.databinding.TasbihFBinding;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

public class Tasbih_F extends Fragment {
    TasbihFBinding tasbihFBinding;
    Vibrator vibe;
    int i = 0;
    int total_count = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        tasbihFBinding = DataBindingUtil.inflate(inflater, R.layout.tasbih_f, container, false);
        View view = tasbihFBinding.getRoot();
        getActivity().setTitle(R.string.tasbi);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        vibe = (Vibrator) getActivity().getSystemService(Context.VIBRATOR_SERVICE);

        tasbihFBinding.incrementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i == 100) {
                    i = 0;
                }
                i++;
                tasbihFBinding.incrementBtnShow.setText(String.valueOf(i));
                vibe.vibrate(100);
                total_count++;
                tasbihFBinding.totalCountTV.setText("Total  :- " + String.valueOf(total_count));

            }
        });
    }
}
