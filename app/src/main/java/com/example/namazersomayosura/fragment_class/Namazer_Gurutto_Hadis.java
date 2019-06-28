package com.example.namazersomayosura.fragment_class;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.namazersomayosura.R;
import com.example.namazersomayosura.databinding.NamazerGuruttoHadisBinding;
import com.example.namazersomayosura.databinding.NamazerSuraFBinding;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class Namazer_Gurutto_Hadis extends Fragment implements View.OnClickListener {

    NamazerGuruttoHadisBinding namazerGuruttoHadisBinding;
    Fragment fragment = null;
    Bundle bundle = null;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        namazerGuruttoHadisBinding = DataBindingUtil.inflate(inflater, R.layout.namazer_gurutto_hadis, container, false);
        View view = namazerGuruttoHadisBinding.getRoot();

        getActivity().setTitle(R.string.hadis);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        namazerGuruttoHadisBinding.salatHadithButtonID.setOnClickListener(this);
        namazerGuruttoHadisBinding.siamHadithButtonID.setOnClickListener(this);
        namazerGuruttoHadisBinding.hazzHadithButtonID.setOnClickListener(this);
        namazerGuruttoHadisBinding.jakatHadithButtonID.setOnClickListener(this);
        namazerGuruttoHadisBinding.imanHadithButtonID.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.iman_hadith_button_ID:
                fragment = new Hadith_details_F();
                bundle = new Bundle();
                bundle.putString("value", "1");
                replace_fragment(fragment,bundle);

                break;

            case R.id.salat_hadith_button_ID:
                fragment = new Hadith_details_F();
                bundle = new Bundle();
                bundle.putString("value", "2");
                replace_fragment(fragment,bundle);

                break;
            case R.id.siam_hadith_button_ID:
                fragment = new Hadith_details_F();
                bundle = new Bundle();
                bundle.putString("value", "3");
                replace_fragment(fragment,bundle);
                break;

            case R.id.hazz_hadith_button_ID:
                fragment = new Hadith_details_F();
                bundle = new Bundle();
                bundle.putString("value", "4");
                replace_fragment(fragment,bundle);

                break;

            case R.id.jakat_hadith_button_ID:
                fragment = new Hadith_details_F();
                bundle = new Bundle();
                bundle.putString("value", "5");
                replace_fragment(fragment,bundle);

                break;
        }
    }

    private void replace_fragment(Fragment fragment,Bundle bundle) {
        if (fragment != null) {
            fragment.setArguments(bundle);
            FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.screen_Area_main, fragment);
            fragmentTransaction.addToBackStack("");
            fragmentTransaction.commit();
        }
    }

}
