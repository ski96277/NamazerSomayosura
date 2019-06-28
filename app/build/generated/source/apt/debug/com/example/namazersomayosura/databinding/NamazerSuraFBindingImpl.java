package com.example.namazersomayosura.databinding;
import com.example.namazersomayosura.R;
import com.example.namazersomayosura.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class NamazerSuraFBindingImpl extends NamazerSuraFBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.sura_al_fatah_Button_ID, 1);
        sViewsWithIds.put(R.id.sura_nas_Button_ID, 2);
        sViewsWithIds.put(R.id.sura_falak_Button_ID, 3);
        sViewsWithIds.put(R.id.sura_ekhlas_Button_ID, 4);
        sViewsWithIds.put(R.id.sura_lahab_Button_ID, 5);
        sViewsWithIds.put(R.id.sura_kafirun_Button_ID, 6);
        sViewsWithIds.put(R.id.sura_maun_Button_ID, 7);
        sViewsWithIds.put(R.id.sura_zilzahal_Button_ID, 8);
        sViewsWithIds.put(R.id.sura_feil_Button_ID, 9);
        sViewsWithIds.put(R.id.sura_nosor_Button_ID, 10);
        sViewsWithIds.put(R.id.sura_kausar_Button_ID, 11);
        sViewsWithIds.put(R.id.sura_korais_Button_ID, 12);
        sViewsWithIds.put(R.id.sura_kador_Button_ID, 13);
        sViewsWithIds.put(R.id.quran_webView_Button_ID, 14);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public NamazerSuraFBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private NamazerSuraFBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[14]
            , (com.google.android.material.button.MaterialButton) bindings[1]
            , (com.google.android.material.button.MaterialButton) bindings[4]
            , (com.google.android.material.button.MaterialButton) bindings[3]
            , (com.google.android.material.button.MaterialButton) bindings[9]
            , (com.google.android.material.button.MaterialButton) bindings[13]
            , (com.google.android.material.button.MaterialButton) bindings[6]
            , (com.google.android.material.button.MaterialButton) bindings[11]
            , (com.google.android.material.button.MaterialButton) bindings[12]
            , (com.google.android.material.button.MaterialButton) bindings[5]
            , (com.google.android.material.button.MaterialButton) bindings[7]
            , (com.google.android.material.button.MaterialButton) bindings[2]
            , (com.google.android.material.button.MaterialButton) bindings[10]
            , (com.google.android.material.button.MaterialButton) bindings[8]
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
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