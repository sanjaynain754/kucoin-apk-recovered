package com.google.android.material.carousel;

import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes45.dex */
interface Maskable {
    @NonNull
    RectF getMaskRectF();

    @FloatRange(from = 0.0d, m1552to = 1.0d)
    @Deprecated
    float getMaskXPercentage();

    void setMaskRectF(@NonNull RectF rectF);

    @Deprecated
    void setMaskXPercentage(@FloatRange(from = 0.0d, m1552to = 1.0d) float f11);

    void setOnMaskChangedListener(@Nullable OnMaskChangedListener onMaskChangedListener);
}
