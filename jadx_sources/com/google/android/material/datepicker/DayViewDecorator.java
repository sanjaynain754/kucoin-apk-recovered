package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes45.dex */
public abstract class DayViewDecorator implements Parcelable {
    @Nullable
    public ColorStateList getBackgroundColor(@NonNull Context context, int i11, int i12, int i13, boolean z11, boolean z12) {
        return null;
    }

    @Nullable
    public Drawable getCompoundDrawableBottom(@NonNull Context context, int i11, int i12, int i13, boolean z11, boolean z12) {
        return null;
    }

    @Nullable
    public Drawable getCompoundDrawableLeft(@NonNull Context context, int i11, int i12, int i13, boolean z11, boolean z12) {
        return null;
    }

    @Nullable
    public Drawable getCompoundDrawableRight(@NonNull Context context, int i11, int i12, int i13, boolean z11, boolean z12) {
        return null;
    }

    @Nullable
    public Drawable getCompoundDrawableTop(@NonNull Context context, int i11, int i12, int i13, boolean z11, boolean z12) {
        return null;
    }

    @Nullable
    public ColorStateList getTextColor(@NonNull Context context, int i11, int i12, int i13, boolean z11, boolean z12) {
        return null;
    }

    public void initialize(@NonNull Context context) {
    }

    @Nullable
    public CharSequence getContentDescription(@NonNull Context context, int i11, int i12, int i13, boolean z11, boolean z12, @Nullable CharSequence charSequence) {
        return charSequence;
    }
}
