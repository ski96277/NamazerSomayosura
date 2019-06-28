package com.example.namazersomayosura.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class Allahr99NameBinding extends ViewDataBinding {
  @NonNull
  public final ListView namleListRecyclerViewID;

  protected Allahr99NameBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ListView namleListRecyclerViewID) {
    super(_bindingComponent, _root, _localFieldCount);
    this.namleListRecyclerViewID = namleListRecyclerViewID;
  }

  @NonNull
  public static Allahr99NameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.allahr_99_name, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static Allahr99NameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<Allahr99NameBinding>inflateInternal(inflater, com.example.namazersomayosura.R.layout.allahr_99_name, root, attachToRoot, component);
  }

  @NonNull
  public static Allahr99NameBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.allahr_99_name, null, false, component)
   */
  @NonNull
  @Deprecated
  public static Allahr99NameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<Allahr99NameBinding>inflateInternal(inflater, com.example.namazersomayosura.R.layout.allahr_99_name, null, false, component);
  }

  public static Allahr99NameBinding bind(@NonNull View view) {
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
  public static Allahr99NameBinding bind(@NonNull View view, @Nullable Object component) {
    return (Allahr99NameBinding)bind(component, view, com.example.namazersomayosura.R.layout.allahr_99_name);
  }
}
