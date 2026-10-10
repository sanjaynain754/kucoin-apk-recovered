package com.google.android.material.internal;

import android.animation.TypeEvaluator;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class RectEvaluator implements TypeEvaluator<Rect> {
    private final Rect rect;

    @Override // android.animation.TypeEvaluator
    public Rect evaluate(float f11, @NonNull Rect rect, @NonNull Rect rect2) {
        int i11 = rect.left;
        int i12 = i11 + ((int) ((rect2.left - i11) * f11));
        int i13 = rect.top;
        int i14 = i13 + ((int) ((rect2.top - i13) * f11));
        int i15 = rect.right;
        int i16 = i15 + ((int) ((rect2.right - i15) * f11));
        int i17 = rect.bottom;
        this.rect.set(i12, i14, i16, i17 + ((int) ((rect2.bottom - i17) * f11)));
        return this.rect;
    }

    public RectEvaluator(@NonNull Rect rect) {
        this.rect = rect;
    }
}
