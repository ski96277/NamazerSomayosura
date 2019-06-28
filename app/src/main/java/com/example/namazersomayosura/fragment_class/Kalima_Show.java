package com.example.namazersomayosura.fragment_class;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.namazersomayosura.R;
import com.example.namazersomayosura.databinding.KalimaShowBinding;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

public class Kalima_Show extends Fragment {

    KalimaShowBinding kalimaShowBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        kalimaShowBinding = DataBindingUtil.inflate(inflater, R.layout.kalima_show, container, false);
        View view = kalimaShowBinding.getRoot();

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//get text from fragment
        String strtext = getArguments().getString("text");
        String kalima_name=getArguments().getString("kalima_name");
        getActivity().setTitle(kalima_name);
//get text from fragment END

        //set text in TextView

        if (strtext.equals("1")) {
            kalimaShowBinding.arbiShowTV.setText(getResources().getString(R.string.kalemai_taiyeba_arbi));
            kalimaShowBinding.uccharonTV.setText(getResources().getString(R.string.kalemai_taiyeba_uccharon));
            kalimaShowBinding.banglaOrthoTV.setText(getResources().getString(R.string.kalemai_taiyeba_ortho));
        }
        if (strtext.equals("2")) {

            kalimaShowBinding.arbiShowTV.setText(getResources().getString(R.string.kalimay_shahadat_arbi));

            kalimaShowBinding.uccharonTV.setText(getResources().getString(R.string.kalimay_shahadat_ucharon));
            kalimaShowBinding.banglaOrthoTV.setText(getResources().getString(R.string.kalimay_shahadat_ortho));
        }
        if (strtext.equals("3")) {

            kalimaShowBinding.arbiShowTV.setText(getResources().getString(R.string.kalimay_tauhid_arabic));
            kalimaShowBinding.uccharonTV.setText(getResources().getString(R.string.kalimay_tauhid_uccharon));
            kalimaShowBinding.banglaOrthoTV.setText(getResources().getString(R.string.kalimay_tauhid_ortho));
        }

        if (strtext.equals("4")) {

            kalimaShowBinding.arbiShowTV.setText(getResources().getString(R.string.kalimay_tamjid_arabic));
            kalimaShowBinding.uccharonTV.setText(getResources().getString(R.string.kalimay_tamjid_uccharon));
            kalimaShowBinding.banglaOrthoTV.setText(getResources().getString(R.string.kalimay_tamjid_ortho));
        }
        if (strtext.equals("5")) {

            kalimaShowBinding.arbiShowTV.setText(getResources().getString(R.string.kalimay_astagfer_arabic));
            kalimaShowBinding.uccharonTV.setText(getResources().getString(R.string.kalimay_astagfer_uccharon));
            kalimaShowBinding.banglaOrthoTV.setText(getResources().getString(R.string.kalimay_astagfer_ortho));
        }
        if (strtext.equals("6")) {

            kalimaShowBinding.arbiShowTV.setText(getResources().getString(R.string.kalimay_kufur_arabic));
            kalimaShowBinding.uccharonTV.setText(getResources().getString(R.string.kalimay_kufur_uccharon));
            kalimaShowBinding.banglaOrthoTV.setText(getResources().getString(R.string.kalimay_kufur_ortho));
        }
        //set text in TextView END
    }
}
