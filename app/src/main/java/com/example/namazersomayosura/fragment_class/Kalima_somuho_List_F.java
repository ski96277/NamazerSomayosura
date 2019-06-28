package com.example.namazersomayosura.fragment_class;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.namazersomayosura.R;
import com.example.namazersomayosura.databinding.KalimaSomuhoListFBinding;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import es.dmoral.toasty.Toasty;

public class Kalima_somuho_List_F extends Fragment implements View.OnClickListener {

    KalimaSomuhoListFBinding kalimaSomuhoFBinding;

    Fragment fragment=null;
    Bundle bundle;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        kalimaSomuhoFBinding = DataBindingUtil.inflate(inflater, R.layout.kalima_somuho_list_f, container, false);
        View view = kalimaSomuhoFBinding.getRoot();
        getActivity().setTitle("কালেমার লিস্ট");
        return view;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


         bundle = new Bundle();

        kalimaSomuhoFBinding.kalimaiTaiyebaTV.setOnClickListener(this);
        kalimaSomuhoFBinding.kalimaiShahadatTV.setOnClickListener(this);
        kalimaSomuhoFBinding.kalimaiTauhidTV.setOnClickListener(this);
        kalimaSomuhoFBinding.kalimaiTamjidTV.setOnClickListener(this);
        kalimaSomuhoFBinding.kalimaiAsTagfirTV.setOnClickListener(this);
        kalimaSomuhoFBinding.kalimaiKufurTV.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.kalimai_taiyeba_TV:

                fragment = new Kalima_Show();
                bundle.putString("text", "1");
                bundle.putString("kalima_name", "কালিমায়ে তাইয়্যেবা");
                fragment.setArguments(bundle);
                replaceFragment(fragment);
                break;
            case R.id.kalimai_shahadat_TV:

                fragment = new Kalima_Show();
                bundle.putString("text", "2");
                bundle.putString("kalima_name", "কালিমায়ে শাহাদাত");
                fragment.setArguments(bundle);
                replaceFragment(fragment);
                break;
            case R.id.kalimai_tauhid_TV:


                fragment = new Kalima_Show();
                bundle.putString("text", "3");
                bundle.putString("kalima_name", "কালিমায়ে তাওহীদ");
                fragment.setArguments(bundle);
                replaceFragment(fragment);
                break;
            case R.id.kalimai_tamjid_TV:


                fragment = new Kalima_Show();
                bundle.putString("text", "4");
                bundle.putString("kalima_name", "কালিমায়ে তামযীদ");
                fragment.setArguments(bundle);
                replaceFragment(fragment);
                break;
            case R.id.kalimai_as_Tagfir_TV:


                fragment = new Kalima_Show();
                bundle.putString("text", "5");
                bundle.putString("kalima_name", "কালেমা-ই-আস্তাগফের");
                fragment.setArguments(bundle);
                replaceFragment(fragment);
                break;
            case R.id.kalimai_kufur_TV:


                fragment = new Kalima_Show();
                bundle.putString("text", "6");
                bundle.putString("kalima_name", "কালেমা-ই-রুদ-ই-কুফর");
                fragment.setArguments(bundle);
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
            fragmentTransaction.addToBackStack("");
            fragmentTransaction.replace(R.id.screen_Area_main, fragment);
            fragmentTransaction.commit();

        }

    }
//Replace Fragment END
}
