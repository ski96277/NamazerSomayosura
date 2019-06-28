package com.example.namazersomayosura.fragment_class;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.namazersomayosura.R;
import com.example.namazersomayosura.databinding.NamazerSuraFBinding;
import com.example.namazersomayosura.javaClass.CheckNetwork;
import com.kinda.alert.KAlertDialog;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import es.dmoral.toasty.Toasty;

public class Namazer_Sura_F extends Fragment implements View.OnClickListener {
    NamazerSuraFBinding namazerSuraFBinding;
    Fragment fragment = null;
    Bundle bundle;
    KAlertDialog alertDialog;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        namazerSuraFBinding = DataBindingUtil.inflate(inflater, R.layout.namazer_sura_f, container, false);
        View view = namazerSuraFBinding.getRoot();
        getActivity().setTitle("সূরা লিস্ট");
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        bundle = new Bundle();

        namazerSuraFBinding.suraAlFatahButtonID.setOnClickListener(this);
        namazerSuraFBinding.suraNasButtonID.setOnClickListener(this);
        namazerSuraFBinding.suraFalakButtonID.setOnClickListener(this);
        namazerSuraFBinding.suraEkhlasButtonID.setOnClickListener(this);
        namazerSuraFBinding.suraLahabButtonID.setOnClickListener(this);
        namazerSuraFBinding.suraKafirunButtonID.setOnClickListener(this);
        namazerSuraFBinding.suraMaunButtonID.setOnClickListener(this);
        namazerSuraFBinding.suraZilzahalButtonID.setOnClickListener(this);
        namazerSuraFBinding.suraFeilButtonID.setOnClickListener(this);
        namazerSuraFBinding.suraNosorButtonID.setOnClickListener(this);
        namazerSuraFBinding.suraKausarButtonID.setOnClickListener(this);
        namazerSuraFBinding.suraKoraisButtonID.setOnClickListener(this);
        namazerSuraFBinding.suraKadorButtonID.setOnClickListener(this);
        namazerSuraFBinding.quranWebViewButtonID.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.sura_al_fatah_Button_ID:
                fragment = new Sura_Details_F();
                bundle.putString("value", "1");
                fragment.setArguments(bundle);
                replaceFragment(fragment);
                break;

            case R.id.sura_nas_Button_ID:

                fragment = new Sura_Details_F();
                bundle.putString("value", "2");
                fragment.setArguments(bundle);
                replaceFragment(fragment);
                break;
            case R.id.sura_falak_Button_ID:
                fragment = new Sura_Details_F();
                bundle.putString("value", "3");
                fragment.setArguments(bundle);
                replaceFragment(fragment);
                break;
            case R.id.sura_ekhlas_Button_ID:
                fragment = new Sura_Details_F();
                bundle.putString("value", "4");
                fragment.setArguments(bundle);
                replaceFragment(fragment);
                break;
            case R.id.sura_lahab_Button_ID:

                fragment = new Sura_Details_F();
                bundle.putString("value", "5");
                fragment.setArguments(bundle);
                replaceFragment(fragment);
                break;
            case R.id.sura_kafirun_Button_ID:

                fragment = new Sura_Details_F();
                bundle.putString("value", "6");
                fragment.setArguments(bundle);
                replaceFragment(fragment);
                break;
            case R.id.sura_maun_Button_ID:
                fragment = new Sura_Details_F();
                bundle.putString("value", "7");
                fragment.setArguments(bundle);
                replaceFragment(fragment);
                break;
            case R.id.sura_zilzahal_Button_ID:
                fragment = new Sura_Details_F();
                bundle.putString("value", "8");
                fragment.setArguments(bundle);
                replaceFragment(fragment);
                break;
            case R.id.sura_feil_Button_ID:
                fragment = new Sura_Details_F();
                bundle.putString("value", "9");
                fragment.setArguments(bundle);
                replaceFragment(fragment);
                break;
            case R.id.sura_nosor_Button_ID:
                fragment = new Sura_Details_F();
                bundle.putString("value", "10");
                fragment.setArguments(bundle);
                replaceFragment(fragment);
                break;
            case R.id.sura_kausar_Button_ID:
                fragment = new Sura_Details_F();
                bundle.putString("value", "11");
                fragment.setArguments(bundle);
                replaceFragment(fragment);
                break;
            case R.id.sura_korais_Button_ID:
                fragment = new Sura_Details_F();
                bundle.putString("value", "12");
                fragment.setArguments(bundle);
                replaceFragment(fragment);
                break;
            case R.id.sura_kador_Button_ID:
                fragment = new Sura_Details_F();
                bundle.putString("value", "13");
                fragment.setArguments(bundle);
                replaceFragment(fragment);
                break;
            case R.id.quran_webView_Button_ID:
                if (CheckNetwork.isInternetAvailable(getContext())) {
                    fragment = new QuranWebView_F();
                    replaceFragment(fragment);
                } else {
                     alertDialog = new KAlertDialog(getContext(), KAlertDialog.ERROR_TYPE);
                    alertDialog.setTitleText("Oops...")
                            .setContentText("Internet Error !")
                            .setConfirmClickListener(new KAlertDialog.OnSweetClickListener() {
                                @Override
                                public void onClick(KAlertDialog kAlertDialog) {
                                    alertDialog.dismissWithAnimation();
                                }
                            })
                            .show();

                    Toasty.error(getContext(), "Check Internet", Toasty.LENGTH_SHORT);
                }
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
