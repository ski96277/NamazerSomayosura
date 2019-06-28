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

public abstract class KalimaShowBinding extends ViewDataBinding {
  @NonNull
  public final TextView arbiShowTV;

  @NonNull
  public final TextView banglaOrthoTV;

  @NonNull
  public final TextView uccharonTV;

  protected KalimaShowBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView arbiShowTV, TextView banglaOrthoTV, TextView uccharonTV) {
    super(_bindingComponent, _root, _localFieldCount);
    this.arbiShowTV = arbiShowTV;
    this.banglaOrthoTV = banglaOrthoTV;
    this.uccharonTV = uccharonTV;
  }

  @NonNull
  public static KalimaShowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.kalima_show, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static KalimaShowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<KalimaShowBinding>inflateInternal(inflater, com.example.namazersomayosura.R.layout.kalima_show, root, attachToRoot, component);
  }

  @NonNull
  public static KalimaShowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.kalima_show, null, false, component)
   */
  @NonNull
  @Deprecated
  public static KalimaShowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<KalimaShowBinding>inflateInternal(inflater, com.example.namazersomayosura.R.layout.kalima_show, null, false, component);
  }

  public static KalimaShowBinding bind(@NonNull View view) {
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
  public static KalimaShowBinding bind(@NonNull View view, @Nullable Object component) {
    return (KalimaShowBinding)bind(component, view, com.example.namazersomayosura.R.layout.kalima_show);
  }
}
