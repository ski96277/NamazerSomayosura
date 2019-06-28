package com.example.namazersomayosura.fragment_class;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.namazersomayosura.Activity.MainActivity;
import com.example.namazersomayosura.R;
import com.example.namazersomayosura.databinding.HomeFragmentBinding;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class HomeFragment extends Fragment implements View.OnClickListener {

    HomeFragmentBinding homeFragmentBinding;
    Fragment fragment = null;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        homeFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.home_fragment, container, false);
        View view = homeFragmentBinding.getRoot();
        getActivity().setTitle(getResources().getString(R.string.app_name));
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//set onclcik in button
        homeFragmentBinding.rozarSomayButtonID.setOnClickListener(this);
        homeFragmentBinding.kalimaSomuhoButtonID.setOnClickListener(this);
        homeFragmentBinding.namazerSuraButtonID.setOnClickListener(this);
        homeFragmentBinding.namazerGuruttoHadisButtonID.setOnClickListener(this);
        homeFragmentBinding.tasbihButtonID.setOnClickListener(this);
        homeFragmentBinding.allahEr99NamButtonID.setOnClickListener(this);
//set onclcik in button END

//Load data From SharedPreferences
        SharedPreferences prefs = getActivity().getSharedPreferences("jsonSave", 0);
        homeFragmentBinding.fozorTimeTV.setText(prefs.getString("fajr", null));
        homeFragmentBinding.sunriseTimeTV.setText(prefs.getString("sunrise", null));
        homeFragmentBinding.dhuhurTimeTV.setText(prefs.getString("dhur", null));
        homeFragmentBinding.achorTimeTV.setText(prefs.getString("achor", null));
        homeFragmentBinding.magribTimeTV.setText(prefs.getString("magrib", null));
        homeFragmentBinding.ishaTimeTV.setText(prefs.getString("isha", null));
//Load data From SharedPreferences END


    }

    @Override
    public void onClick(View v) {

        int id = v.getId();
        switch (id) {
            case R.id.rozar_somay_Button_ID:
                fragment = new Rozar_somay_2019();
                replaceFragment(fragment);
                break;
            case R.id.kalima_somuho_Button_ID:
                fragment = new Kalima_somuho_List_F();
                replaceFragment(fragment);
                break;
            case R.id.namazer_sura_Button_ID:
                fragment = new Namazer_Sura_F();
                replaceFragment(fragment);

                break;
            case R.id.namazer_gurutto_hadis_Button_ID:

                fragment = new Namazer_Gurutto_Hadis();
                replaceFragment(fragment);
                break;
            case R.id.allah_er_99_Nam_Button_ID:
                fragment = new Allahr_99_Name_F();
                replaceFragment(fragment);
                break;
            case R.id.tasbih_Button_ID:
                MainActivity.fab.hide();
                fragment = new Tasbih_F();
                replaceFragment(fragment);
                break;
        }

    }
//Replace Fragment

    private void replaceFragment(Fragment fragment) {

        if (fragment != null) {
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
            fragmentTransaction.replace(R.id.screen_Area_main, fragment);
            fragmentTransaction.addToBackStack("");
            fragmentTransaction.commit();

        }

    }
//Replace Fragment END

}
