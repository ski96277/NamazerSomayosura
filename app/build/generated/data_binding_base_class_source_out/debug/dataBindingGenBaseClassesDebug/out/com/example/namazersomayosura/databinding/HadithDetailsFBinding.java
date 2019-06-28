package com.example.namazersomayosura.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class HadithDetailsFBinding extends ViewDataBinding {
  @NonNull
  public final TextView hadithDetailsTVID;

  protected HadithDetailsFBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView hadithDetailsTVID) {
    super(_bindingComponent, _root, _localFieldCount);
    this.hadithDetailsTVID = hadithDetailsTVID;
  }

  @NonNull
  public static HadithDetailsFBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.hadith_details_f, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static HadithDetailsFBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<HadithDetailsFBinding>inflateInternal(inflater, com.example.namazersomayosura.R.layout.hadith_details_f, root, attachToRoot, component);
  }

  @NonNull
  public static HadithDetailsFBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.hadith_details_f, null, false, component)
   */
  @NonNull
  @Deprecated
  public static HadithDetailsFBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<HadithDetailsFBinding>inflateInternal(inflater, com.example.namazersomayosura.R.layout.hadith_details_f, null, false, component);
  }

  public static HadithDetailsFBinding bind(@NonNull View view) {
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
  public static HadithDetailsFBinding bind(@NonNull View view, @Nullable Object component) {
    return (HadithDetailsFBinding)bind(component, view, com.example.namazersomayosura.R.layout.hadith_details_f);
  }
}
