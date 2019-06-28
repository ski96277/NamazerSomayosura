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

public abstract class ItemViewAllahrNameBinding extends ViewDataBinding {
  @NonNull
  public final TextView nameOrthoTVID;

  @NonNull
  public final TextView nameTVID;

  protected ItemViewAllahrNameBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView nameOrthoTVID, TextView nameTVID) {
    super(_bindingComponent, _root, _localFieldCount);
    this.nameOrthoTVID = nameOrthoTVID;
    this.nameTVID = nameTVID;
  }

  @NonNull
  public static ItemViewAllahrNameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_view_allahr_name, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemViewAllahrNameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemViewAllahrNameBinding>inflateInternal(inflater, com.example.namazersomayosura.R.layout.item_view_allahr_name, root, attachToRoot, component);
  }

  @NonNull
  public static ItemViewAllahrNameBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_view_allahr_name, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemViewAllahrNameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemViewAllahrNameBinding>inflateInternal(inflater, com.example.namazersomayosura.R.layout.item_view_allahr_name, null, false, component);
  }

  public static ItemViewAllahrNameBinding bind(@NonNull View view) {
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
  public static ItemViewAllahrNameBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemViewAllahrNameBinding)bind(component, view, com.example.namazersomayosura.R.layout.item_view_allahr_name);
  }
}
