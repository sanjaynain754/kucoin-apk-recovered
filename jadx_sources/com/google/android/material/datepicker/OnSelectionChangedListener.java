package com.google.android.material.datepicker;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class OnSelectionChangedListener<S> {
    public abstract void onSelectionChanged(@NonNull S s11);

    public void onIncompleteSelectionChanged() {
    }
}
