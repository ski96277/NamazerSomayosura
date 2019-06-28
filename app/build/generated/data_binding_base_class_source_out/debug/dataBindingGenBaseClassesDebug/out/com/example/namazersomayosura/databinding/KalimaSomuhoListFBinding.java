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

public abstract class KalimaSomuhoListFBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton kalimaiAsTagfirTV;

  @NonNull
  public final MaterialButton kalimaiKufurTV;

  @NonNull
  public final MaterialButton kalimaiShahadatTV;

  @NonNull
  public final MaterialButton kalimaiTaiyebaTV;

  @NonNull
  public final MaterialButton kalimaiTamjidTV;

  @NonNull
  public final MaterialButton kalimaiTauhidTV;

  protected KalimaSomuhoListFBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialButton kalimaiAsTagfirTV, MaterialButton kalimaiKufurTV,
      MaterialButton kalimaiShahadatTV, MaterialButton kalimaiTaiyebaTV,
      MaterialButton kalimaiTamjidTV, MaterialButton kalimaiTauhidTV) {
    super(_bindingComponent, _root, _localFieldCount);
    this.kalimaiAsTagfirTV = kalimaiAsTagfirTV;
    this.kalimaiKufurTV = kalimaiKufurTV;
    this.kalimaiShahadatTV = kalimaiShahadatTV;
    this.kalimaiTaiyebaTV = kalimaiTaiyebaTV;
    this.kalimaiTamjidTV = kalimaiTamjidTV;
    this.kalimaiTauhidTV = kalimaiTauhidTV;
  }

  @NonNull
  public static KalimaSomuhoListFBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.kalima_somuho_list_f, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static KalimaSomuhoListFBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<KalimaSomuhoListFBinding>inflateInternal(inflater, com.example.namazersomayosura.R.layout.kalima_somuho_list_f, root, attachToRoot, component);
  }

  @NonNull
  public static KalimaSomuhoListFBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.kalima_somuho_list_f, null, false, component)
   */
  @NonNull
  @Deprecated
  public static KalimaSomuhoListFBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<KalimaSomuhoListFBinding>inflateInternal(inflater, com.example.namazersomayosura.R.layout.kalima_somuho_list_f, null, false, component);
  }

  public static KalimaSomuhoListFBinding bind(@NonNull View view) {
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
  public static KalimaSomuhoListFBinding bind(@NonNull View view, @Nullable Object component) {
    return (KalimaSomuhoListFBinding)bind(component, view, com.example.namazersomayosura.R.layout.kalima_somuho_list_f);
  }
}
