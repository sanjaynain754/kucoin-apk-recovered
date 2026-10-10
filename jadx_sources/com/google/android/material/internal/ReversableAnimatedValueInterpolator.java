package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ReversableAnimatedValueInterpolator implements TimeInterpolator {
    private final TimeInterpolator sourceInterpolator;

    @NonNull
    /* JADX INFO: renamed from: of */
    public static TimeInterpolator m13130of(boolean z11, @NonNull TimeInterpolator timeInterpolator) {
        return z11 ? timeInterpolator : new ReversableAnimatedValueInterpolator(timeInterpolator);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f11) {
        return 1.0f - this.sourceInterpolator.getInterpolation(f11);
    }

    public ReversableAnimatedValueInterpolator(@NonNull TimeInterpolator timeInterpolator) {
        this.sourceInterpolator = timeInterpolator;
    }
}
