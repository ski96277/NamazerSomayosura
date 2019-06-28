package com.example.namazersomayosura.databinding;
import com.example.namazersomayosura.R;
import com.example.namazersomayosura.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class HomeFragmentBindingImpl extends HomeFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearlayout_header, 1);
        sViewsWithIds.put(R.id.fozorer_namazer_time_linear, 2);
        sViewsWithIds.put(R.id.fozor_time_TV, 3);
        sViewsWithIds.put(R.id.sunrise_namazer_time_linear, 4);
        sViewsWithIds.put(R.id.sunrise_time_TV, 5);
        sViewsWithIds.put(R.id.zohorer_namazer_time_linear, 6);
        sViewsWithIds.put(R.id.dhuhur_time_TV, 7);
        sViewsWithIds.put(R.id.achor_namazer_time_linear, 8);
        sViewsWithIds.put(R.id.achor_time_TV, 9);
        sViewsWithIds.put(R.id.magrib_namazer_time_linear, 10);
        sViewsWithIds.put(R.id.magrib_time_TV, 11);
        sViewsWithIds.put(R.id.eshar_namazer_time_linear, 12);
        sViewsWithIds.put(R.id.isha_time_TV, 13);
        sViewsWithIds.put(R.id.rozar_somay_Button_ID, 14);
        sViewsWithIds.put(R.id.kalima_somuho_Button_ID, 15);
        sViewsWithIds.put(R.id.namazer_sura_Button_ID, 16);
        sViewsWithIds.put(R.id.namazer_gurutto_hadis_Button_ID, 17);
        sViewsWithIds.put(R.id.allah_er_99_Nam_Button_ID, 18);
        sViewsWithIds.put(R.id.tasbih_Button_ID, 19);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public HomeFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private HomeFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (com.google.android.material.button.MaterialButton) bindings[18]
            , (android.widget.TextView) bindings[7]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.TextView) bindings[3]
            , (android.widget.LinearLayout) bindings[2]
            , (android.widget.TextView) bindings[13]
            , (com.google.android.material.button.MaterialButton) bindings[15]
            , (android.widget.LinearLayout) bindings[1]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (com.google.android.material.button.MaterialButton) bindings[17]
            , (com.google.android.material.button.MaterialButton) bindings[16]
            , (com.google.android.material.button.MaterialButton) bindings[14]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (com.google.android.material.button.MaterialButton) bindings[19]
            , (android.widget.LinearLayout) bindings[6]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}