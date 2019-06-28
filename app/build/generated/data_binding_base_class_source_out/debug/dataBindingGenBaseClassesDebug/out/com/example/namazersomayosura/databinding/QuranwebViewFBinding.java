package com.example.namazersomayosura.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class QuranwebViewFBinding extends ViewDataBinding {
  @NonNull
  public final WebView quranWVID;

  protected QuranwebViewFBinding(Object _bindingComponent, View _root, int _localFieldCount,
      WebView quranWVID) {
    super(_bindingComponent, _root, _localFieldCount);
    this.quranWVID = quranWVID;
  }

  @NonNull
  public static QuranwebViewFBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.quranweb_view_f, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static QuranwebViewFBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<QuranwebViewFBinding>inflateInternal(inflater, com.example.namazersomayosura.R.layout.quranweb_view_f, root, attachToRoot, component);
  }

  @NonNull
  public static QuranwebViewFBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.quranweb_view_f, null, false, component)
   */
  @NonNull
  @Deprecated
  public static QuranwebViewFBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<QuranwebViewFBinding>inflateInternal(inflater, com.example.namazersomayosura.R.layout.quranweb_view_f, null, false, component);
  }

  public static QuranwebViewFBinding bind(@NonNull View view) {
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
  public static QuranwebViewFBinding bind(@NonNull View view, @Nullable Object component) {
    return (QuranwebViewFBinding)bind(component, view, com.example.namazersomayosura.R.layout.quranweb_view_f);
  }
}
