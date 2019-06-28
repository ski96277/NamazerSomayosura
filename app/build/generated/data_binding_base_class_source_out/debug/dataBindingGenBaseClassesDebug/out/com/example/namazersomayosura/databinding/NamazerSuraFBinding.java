package com.example.namazersomayosura.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class NamazerSuraFBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton quranWebViewButtonID;

  @NonNull
  public final MaterialButton suraAlFatahButtonID;

  @NonNull
  public final MaterialButton suraEkhlasButtonID;

  @NonNull
  public final MaterialButton suraFalakButtonID;

  @NonNull
  public final MaterialButton suraFeilButtonID;

  @NonNull
  public final MaterialButton suraKadorButtonID;

  @NonNull
  public final MaterialButton suraKafirunButtonID;

  @NonNull
  public final MaterialButton suraKausarButtonID;

  @NonNull
  public final MaterialButton suraKoraisButtonID;

  @NonNull
  public final MaterialButton suraLahabButtonID;

  @NonNull
  public final MaterialButton suraMaunButtonID;

  @NonNull
  public final MaterialButton suraNasButtonID;

  @NonNull
  public final MaterialButton suraNosorButtonID;

  @NonNull
  public final MaterialButton suraZilzahalButtonID;

  protected NamazerSuraFBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialButton quranWebViewButtonID, MaterialButton suraAlFatahButtonID,
      MaterialButton suraEkhlasButtonID, MaterialButton suraFalakButtonID,
      MaterialButton suraFeilButtonID, MaterialButton suraKadorButtonID,
      MaterialButton suraKafirunButtonID, MaterialButton suraKausarButtonID,
      MaterialButton suraKoraisButtonID, MaterialButton suraLahabButtonID,
      MaterialButton suraMaunButtonID, MaterialButton suraNasButtonID,
      MaterialButton suraNosorButtonID, MaterialButton suraZilzahalButtonID) {
    super(_bindingComponent, _root, _localFieldCount);
    this.quranWebViewButtonID = quranWebViewButtonID;
    this.suraAlFatahButtonID = suraAlFatahButtonID;
    this.suraEkhlasButtonID = suraEkhlasButtonID;
    this.suraFalakButtonID = suraFalakButtonID;
    this.suraFeilButtonID = suraFeilButtonID;
    this.suraKadorButtonID = suraKadorButtonID;
    this.suraKafirunButtonID = suraKafirunButtonID;
    this.suraKausarButtonID = suraKausarButtonID;
    this.suraKoraisButtonID = suraKoraisButtonID;
    this.suraLahabButtonID = suraLahabButtonID;
    this.suraMaunButtonID = suraMaunButtonID;
    this.suraNasButtonID = suraNasButtonID;
    this.suraNosorButtonID = suraNosorButtonID;
    this.suraZilzahalButtonID = suraZilzahalButtonID;
  }

  @NonNull
  public static NamazerSuraFBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.namazer_sura_f, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static NamazerSuraFBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<NamazerSuraFBinding>inflateInternal(inflater, com.example.namazersomayosura.R.layout.namazer_sura_f, root, attachToRoot, component);
  }

  @NonNull
  public static NamazerSuraFBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.namazer_sura_f, null, false, component)
   */
  @NonNull
  @Deprecated
  public static NamazerSuraFBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<NamazerSuraFBinding>inflateInternal(inflater, com.example.namazersomayosura.R.layout.namazer_sura_f, null, false, component);
  }

  public static NamazerSuraFBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static NamazerSuraFBinding bind(@NonNull View view, @Nullable Object component) {
    return (NamazerSuraFBinding)bind(component, view, com.example.namazersomayosura.R.layout.namazer_sura_f);
  }
}
