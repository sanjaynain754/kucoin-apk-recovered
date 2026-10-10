package com.google.android.material.shadow;

import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes45.dex */
public interface ShadowViewDelegate {
    float getRadius();

    boolean isCompatPaddingEnabled();

    void setBackgroundDrawable(@Nullable Drawable drawable);

    void setShadowPadding(int i11, int i12, int i13, int i14);
}
