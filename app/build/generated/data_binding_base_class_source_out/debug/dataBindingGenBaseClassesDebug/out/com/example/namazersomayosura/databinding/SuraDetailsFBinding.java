package com.example.namazersomayosura.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class SuraDetailsFBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView recyclerViewIDSuraDetailsID;

  protected SuraDetailsFBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView recyclerViewIDSuraDetailsID) {
    super(_bindingComponent, _root, _localFieldCount);
    this.recyclerViewIDSuraDetailsID = recyclerViewIDSuraDetailsID;
  }

  @NonNull
  public static SuraDetailsFBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.sura_details_f, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static SuraDetailsFBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<SuraDetailsFBinding>inflateInternal(inflater, com.example.namazersomayosura.R.layout.sura_details_f, root, attachToRoot, component);
  }

  @NonNull
  public static SuraDetailsFBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.sura_details_f, null, false, component)
   */
  @NonNull
  @Deprecated
  public static SuraDetailsFBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<SuraDetailsFBinding>inflateInternal(inflater, com.example.namazersomayosura.R.layout.sura_details_f, null, false, component);
  }

  public static SuraDetailsFBinding bind(@NonNull View view) {
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
  public static SuraDetailsFBinding bind(@NonNull View view, @Nullable Object component) {
    return (SuraDetailsFBinding)bind(component, view, com.example.namazersomayosura.R.layout.sura_details_f);
  }
}
