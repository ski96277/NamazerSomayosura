package com.example.namazersomayosura.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class HomeFragmentBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout achorNamazerTimeLinear;

  @NonNull
  public final TextView achorTimeTV;

  @NonNull
  public final MaterialButton allahEr99NamButtonID;

  @NonNull
  public final TextView dhuhurTimeTV;

  @NonNull
  public final LinearLayout esharNamazerTimeLinear;

  @NonNull
  public final TextView fozorTimeTV;

  @NonNull
  public final LinearLayout fozorerNamazerTimeLinear;

  @NonNull
  public final TextView ishaTimeTV;

  @NonNull
  public final MaterialButton kalimaSomuhoButtonID;

  @NonNull
  public final LinearLayout linearlayoutHeader;

  @NonNull
  public final LinearLayout magribNamazerTimeLinear;

  @NonNull
  public final TextView magribTimeTV;

  @NonNull
  public final MaterialButton namazerGuruttoHadisButtonID;

  @NonNull
  public final MaterialButton namazerSuraButtonID;

  @NonNull
  public final MaterialButton rozarSomayButtonID;

  @NonNull
  public final LinearLayout sunriseNamazerTimeLinear;

  @NonNull
  public final TextView sunriseTimeTV;

  @NonNull
  public final MaterialButton tasbihButtonID;

  @NonNull
  public final LinearLayout zohorerNamazerTimeLinear;

  protected HomeFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LinearLayout achorNamazerTimeLinear, TextView achorTimeTV,
      MaterialButton allahEr99NamButtonID, TextView dhuhurTimeTV,
      LinearLayout esharNamazerTimeLinear, TextView fozorTimeTV,
      LinearLayout fozorerNamazerTimeLinear, TextView ishaTimeTV,
      MaterialButton kalimaSomuhoButtonID, LinearLayout linearlayoutHeader,
      LinearLayout magribNamazerTimeLinear, TextView magribTimeTV,
      MaterialButton namazerGuruttoHadisButtonID, MaterialButton namazerSuraButtonID,
      MaterialButton rozarSomayButtonID, LinearLayout sunriseNamazerTimeLinear,
      TextView sunriseTimeTV, MaterialButton tasbihButtonID,
      LinearLayout zohorerNamazerTimeLinear) {
    super(_bindingComponent, _root, _localFieldCount);
    this.achorNamazerTimeLinear = achorNamazerTimeLinear;
    this.achorTimeTV = achorTimeTV;
    this.allahEr99NamButtonID = allahEr99NamButtonID;
    this.dhuhurTimeTV = dhuhurTimeTV;
    this.esharNamazerTimeLinear = esharNamazerTimeLinear;
    this.fozorTimeTV = fozorTimeTV;
    this.fozorerNamazerTimeLinear = fozorerNamazerTimeLinear;
    this.ishaTimeTV = ishaTimeTV;
    this.kalimaSomuhoButtonID = kalimaSomuhoButtonID;
    this.linearlayoutHeader = linearlayoutHeader;
    this.magribNamazerTimeLinear = magribNamazerTimeLinear;
    this.magribTimeTV = magribTimeTV;
    this.namazerGuruttoHadisButtonID = namazerGuruttoHadisButtonID;
    this.namazerSuraButtonID = namazerSuraButtonID;
    this.rozarSomayButtonID = rozarSomayButtonID;
    this.sunriseNamazerTimeLinear = sunriseNamazerTimeLinear;
    this.sunriseTimeTV = sunriseTimeTV;
    this.tasbihButtonID = tasbihButtonID;
    this.zohorerNamazerTimeLinear = zohorerNamazerTimeLinear;
  }

  @NonNull
  public static HomeFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.home_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static HomeFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<HomeFragmentBinding>inflateInternal(inflater, com.example.namazersomayosura.R.layout.home_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static HomeFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.home_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static HomeFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<HomeFragmentBinding>inflateInternal(inflater, com.example.namazersomayosura.R.layout.home_fragment, null, false, component);
  }

  public static HomeFragmentBinding bind(@NonNull View view) {
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
  public static HomeFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (HomeFragmentBinding)bind(component, view, com.example.namazersomayosura.R.layout.home_fragment);
  }
}
