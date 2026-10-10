package com.google.android.material.slider;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface BaseOnSliderTouchListener<S> {
    void onStartTrackingTouch(@NonNull S s11);

    void onStopTrackingTouch(@NonNull S s11);
}
