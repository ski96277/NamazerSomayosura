package com.example.namazersomayosura.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class TasbihFBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton incrementBtn;

  @NonNull
  public final MaterialButton incrementBtnShow;

  @NonNull
  public final TextView totalCountTV;

  protected TasbihFBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialButton incrementBtn, MaterialButton incrementBtnShow, TextView totalCountTV) {
    super(_bindingComponent, _root, _localFieldCount);
    this.incrementBtn = incrementBtn;
    this.incrementBtnShow = incrementBtnShow;
    this.totalCountTV = totalCountTV;
  }

  @NonNull
  public static TasbihFBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.tasbih_f, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static TasbihFBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<TasbihFBinding>inflateInternal(inflater, com.example.namazersomayosura.R.layout.tasbih_f, root, attachToRoot, component);
  }

  @NonNull
  public static TasbihFBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.tasbih_f, null, false, component)
   */
  @NonNull
  @Deprecated
  public static TasbihFBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<TasbihFBinding>inflateInternal(inflater, com.example.namazersomayosura.R.layout.tasbih_f, null, false, component);
  }

  public static TasbihFBinding bind(@NonNull View view) {
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
  public static TasbihFBinding bind(@NonNull View view, @Nullable Object component) {
    return (TasbihFBinding)bind(component, view, com.example.namazersomayosura.R.layout.tasbih_f);
  }
}
