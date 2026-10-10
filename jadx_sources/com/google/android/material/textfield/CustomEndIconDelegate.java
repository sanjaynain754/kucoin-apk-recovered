package com.google.android.material.textfield;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes45.dex */
class CustomEndIconDelegate extends EndIconDelegate {
    @Override // com.google.android.material.textfield.EndIconDelegate
    public void setUp() {
        this.endLayout.setEndIconOnLongClickListener(null);
    }

    public CustomEndIconDelegate(@NonNull EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
    }
}
