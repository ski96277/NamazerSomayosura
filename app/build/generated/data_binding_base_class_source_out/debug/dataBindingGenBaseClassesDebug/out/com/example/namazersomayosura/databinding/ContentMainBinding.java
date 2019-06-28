package com.example.namazersomayosura.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ContentMainBinding extends ViewDataBinding {
  @NonNull
  public final FrameLayout screenAreaMain;

  protected ContentMainBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FrameLayout screenAreaMain) {
    super(_bindingComponent, _root, _localFieldCount);
    this.screenAreaMain = screenAreaMain;
  }

  @NonNull
  public static ContentMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.content_main, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ContentMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ContentMainBinding>inflateInternal(inflater, com.example.namazersomayosura.R.layout.content_main, root, attachToRoot, component);
  }

  @NonNull
  public static ContentMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.content_main, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ContentMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ContentMainBinding>inflateInternal(inflater, com.example.namazersomayosura.R.layout.content_main, null, false, component);
  }

  public static ContentMainBinding bind(@NonNull View view) {
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
  public static ContentMainBinding bind(@NonNull View view, @Nullable Object component) {
    return (ContentMainBinding)bind(component, view, com.example.namazersomayosura.R.layout.content_main);
  }
}
