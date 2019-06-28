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

public abstract class NamazerGuruttoHadisBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton hazzHadithButtonID;

  @NonNull
  public final MaterialButton imanHadithButtonID;

  @NonNull
  public final MaterialButton jakatHadithButtonID;

  @NonNull
  public final MaterialButton salatHadithButtonID;

  @NonNull
  public final MaterialButton siamHadithButtonID;

  protected NamazerGuruttoHadisBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialButton hazzHadithButtonID, MaterialButton imanHadithButtonID,
      MaterialButton jakatHadithButtonID, MaterialButton salatHadithButtonID,
      MaterialButton siamHadithButtonID) {
    super(_bindingComponent, _root, _localFieldCount);
    this.hazzHadithButtonID = hazzHadithButtonID;
    this.imanHadithButtonID = imanHadithButtonID;
    this.jakatHadithButtonID = jakatHadithButtonID;
    this.salatHadithButtonID = salatHadithButtonID;
    this.siamHadithButtonID = siamHadithButtonID;
  }

  @NonNull
  public static NamazerGuruttoHadisBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.namazer_gurutto_hadis, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static NamazerGuruttoHadisBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<NamazerGuruttoHadisBinding>inflateInternal(inflater, com.example.namazersomayosura.R.layout.namazer_gurutto_hadis, root, attachToRoot, component);
  }

  @NonNull
  public static NamazerGuruttoHadisBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.namazer_gurutto_hadis, null, false, component)
   */
  @NonNull
  @Deprecated
  public static NamazerGuruttoHadisBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<NamazerGuruttoHadisBinding>inflateInternal(inflater, com.example.namazersomayosura.R.layout.namazer_gurutto_hadis, null, false, component);
  }

  public static NamazerGuruttoHadisBinding bind(@NonNull View view) {
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
  public static NamazerGuruttoHadisBinding bind(@NonNull View view, @Nullable Object component) {
    return (NamazerGuruttoHadisBinding)bind(component, view, com.example.namazersomayosura.R.layout.namazer_gurutto_hadis);
  }
}
