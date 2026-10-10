package com.google.android.material.sidesheet;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
final class SheetUtils {
    private SheetUtils() {
    }

    public static boolean isSwipeMostlyHorizontal(float f11, float f12) {
        if (Math.abs(f11) > Math.abs(f12)) {
            return true;
        }
        return false;
    }
}
