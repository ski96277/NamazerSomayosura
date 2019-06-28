package com.example.namazersomayosura.fragment_class;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.namazersomayosura.Activity.MainActivity;
import com.example.namazersomayosura.R;
import com.example.namazersomayosura.databinding.QuranwebViewFBinding;
import com.kinda.alert.KAlertDialog;

public class QuranWebView_F extends Fragment {
    public QuranwebViewFBinding quranwebViewFBinding;
    KAlertDialog pDialog;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        quranwebViewFBinding = DataBindingUtil.inflate(inflater, R.layout.quranweb_view_f, container, false);
        View view = quranwebViewFBinding.getRoot();
        MainActivity.fab.hide();

        pDialog = new KAlertDialog(getContext(), KAlertDialog.PROGRESS_TYPE);
        pDialog.getProgressHelper().setBarColor(Color.parseColor("#A5DC86"));
        pDialog.setTitleText("Loading...");
        pDialog.setCancelable(false);

        pDialog.show();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        quranwebViewFBinding.quranWVID.setWebViewClient(new WebViewClient());
        WebSettings webSettings = quranwebViewFBinding.quranWVID.getSettings();
        webSettings.setJavaScriptEnabled(true);
        quranwebViewFBinding.quranWVID.loadUrl("http://www.quraanshareef.org/");

        quranwebViewFBinding.quranWVID.setWebViewClient(new WebViewClient() {

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {


                getActivity().setTitle("loading...");
                super.onPageStarted(view, url, favicon);
            }

            @Override
            public void onPageFinished(WebView view, String url) {

                pDialog.dismissWithAnimation();

                getActivity().setTitle(view.getTitle());
                super.onPageFinished(view, url);
            }
        });

        quranwebViewFBinding.quranWVID.canGoBack();
        quranwebViewFBinding.quranWVID.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                if (keyCode == KeyEvent.KEYCODE_BACK
                        && event.getAction() == MotionEvent.ACTION_UP
                        && quranwebViewFBinding.quranWVID.canGoBack()) {
                    quranwebViewFBinding.quranWVID.goBack();
                    return true;
                }

                return false;
            }
        });

    }


}
