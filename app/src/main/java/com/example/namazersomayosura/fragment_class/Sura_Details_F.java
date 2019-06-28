package com.example.namazersomayosura.fragment_class;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.namazersomayosura.Adapter_Class.Sura_details_Adapter;
import com.example.namazersomayosura.R;
import com.example.namazersomayosura.databinding.SuraDetailsFBinding;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Sura_Details_F extends Fragment {

    SuraDetailsFBinding suraDetailsFBinding;

    String sura_name;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        suraDetailsFBinding = DataBindingUtil.inflate(inflater, R.layout.sura_details_f, container, false);
        View view = suraDetailsFBinding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Bundle bundle = getArguments();
        String value = bundle.getString("value");

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        suraDetailsFBinding.recyclerViewIDSuraDetailsID.setLayoutManager(linearLayoutManager);

        if (value.equals("1")) {
            sura_name = "সূরা আল ফাতিহা";
            getActivity().setTitle(sura_name);

            callAdapterForRecycler(getContext(),
                    getResources().getStringArray(R.array.sura_fateha_aiyat),
                    getResources().getStringArray(R.array.sura_fatiha_english_ortho),
                    getResources().getStringArray(R.array.sura_fatiha_bangla_ortho));
        }
        if (value.equals("2")) {
            sura_name = "সূরা নাস";
            getActivity().setTitle(sura_name);
            callAdapterForRecycler(getContext(),
                    getResources().getStringArray(R.array.sura_nas_aiyat),
                    getResources().getStringArray(R.array.sura_nas_english),
                    getResources().getStringArray(R.array.sura_nas_bangla));
        }
        if (value.equals("3")) {
            sura_name = " সূরা ফালাক্ব ";
            getActivity().setTitle(sura_name);
            callAdapterForRecycler(getContext(),
                    getResources().getStringArray(R.array.sura_falak_aiyat),
                    getResources().getStringArray(R.array.sura_falak_english_ortho),
                    getResources().getStringArray(R.array.sura_falak_bangla_ortho));
        }
        if (value.equals("4")) {
            sura_name = "সূরা এখলাছ";
            getActivity().setTitle(sura_name);
            callAdapterForRecycler(getContext(),
                    getResources().getStringArray(R.array.sura_ikhlas_aiyat),
                    getResources().getStringArray(R.array.sura_ikhlas_english_ortho),
                    getResources().getStringArray(R.array.sura_ikhlas_bangla_ortho));
        }
        if (value.equals("5")) {
            sura_name = "সূরা লাহাব ";
            getActivity().setTitle(sura_name);

            callAdapterForRecycler(getContext(),
                    getResources().getStringArray(R.array.sura_lahab_aiyat),
                    getResources().getStringArray(R.array.sura_lahab_english_ortho),
                    getResources().getStringArray(R.array.sura_lahab_bangla_ortho));
        }
        if (value.equals("6")) {
            sura_name = "সূরা কাফিরুন";
            getActivity().setTitle(sura_name);
            callAdapterForRecycler(getContext(),
                    getResources().getStringArray(R.array.sura_kafirun_aiyat),
                    getResources().getStringArray(R.array.sura_kafirun_english_ortho),
                    getResources().getStringArray(R.array.sura_kafirun_bangla_ortho));

        }
        if (value.equals("7")) {
            sura_name = " সূরা মাউন ";
            getActivity().setTitle(sura_name);
            callAdapterForRecycler(getContext(),
                    getResources().getStringArray(R.array.sura_maun_aiyat),
                    getResources().getStringArray(R.array.sura_maun_english_ortho),
                    getResources().getStringArray(R.array.sura_maun_bangla_ortho));
        }
        if (value.equals("8")) {
            sura_name = "সূরা যিলযাল";
            getActivity().setTitle(sura_name);
            callAdapterForRecycler(getContext(),
                    getResources().getStringArray(R.array.sura_zilzalah_aiyat),
                    getResources().getStringArray(R.array.sura_zilzalah_english_ortho),
                    getResources().getStringArray(R.array.sura_zilzal_bangla_ortho));
        }
        if (value.equals("9")) {
            sura_name = "সূরা ফীল ";
            getActivity().setTitle(sura_name);
            callAdapterForRecycler(getContext(),
                    getResources().getStringArray(R.array.sura_fil_aiyat),
                    getResources().getStringArray(R.array.sura_fil_english_ortho),
                    getResources().getStringArray(R.array.sura_fil_bangla_ortho));
        }
        if (value.equals("10")) {
            sura_name = " সূরা নছর ";
            getActivity().setTitle(sura_name);
            callAdapterForRecycler(getContext(),
                    getResources().getStringArray(R.array.sura_nasr_aiyat),
                    getResources().getStringArray(R.array.sura_nasr_english_ortho),
                    getResources().getStringArray(R.array.sura_nasr_bangla_ortho));
        }
        if (value.equals("11")) {
            sura_name = "সূরা কাওসার";
            getActivity().setTitle(sura_name);
            callAdapterForRecycler(getContext(),
                    getResources().getStringArray(R.array.sura_kauchar_aiyat),
                    getResources().getStringArray(R.array.sura_kauchar_english_ortho),
                    getResources().getStringArray(R.array.sura_kauchar_bangla_ortho));
        }
        if (value.equals("12")) {
            sura_name = "সূরা কোরাইশ";
            getActivity().setTitle(sura_name);
            callAdapterForRecycler(getContext(),
                    getResources().getStringArray(R.array.sura_quraish_aiyat),
                    getResources().getStringArray(R.array.sura_quraish_english_ortho),
                    getResources().getStringArray(R.array.sura_quraish_bangla_ortho));
        }
        if (value.equals("13")) {
            sura_name = "সূরা কদর";
            getActivity().setTitle(sura_name);
            callAdapterForRecycler(getContext(),
                    getResources().getStringArray(R.array.sura_qadr_aiyat),
                    getResources().getStringArray(R.array.sura_qadr_english_ortho),
                    getResources().getStringArray(R.array.sura_qadr_bangla_ortho));
        }
    }

    private void callAdapterForRecycler(Context context, String[] sura_aiyat, String[] sura_english_ortho,
                                        String[] sura_bangla_ortho) {

        Sura_details_Adapter sura_details_adapter = new Sura_details_Adapter(context,
                sura_aiyat,
                sura_english_ortho,
                sura_bangla_ortho);
        suraDetailsFBinding.recyclerViewIDSuraDetailsID.setAdapter(sura_details_adapter);
        sura_details_adapter.setOnItemClickListener(new Sura_details_Adapter.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

            }

            @Override
            public void onItemLongClick(int position, View v) {

            }
        });
    }
}
