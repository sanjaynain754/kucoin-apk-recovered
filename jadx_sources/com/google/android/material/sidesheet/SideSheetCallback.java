package com.google.android.material.sidesheet;

import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes45.dex */
public abstract class SideSheetCallback implements SheetCallback {
    @Override // com.google.android.material.sidesheet.SheetCallback
    public abstract void onSlide(@NonNull View view, float f11);

    @Override // com.google.android.material.sidesheet.SheetCallback
    public abstract void onStateChanged(@NonNull View view, int i11);

    public void onLayout(@NonNull View view) {
    }
}
