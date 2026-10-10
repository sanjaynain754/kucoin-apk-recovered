package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class DislikeAnalyzer {
    private DislikeAnalyzer() {
        throw new UnsupportedOperationException();
    }

    public static Hct fixIfDisliked(Hct hct) {
        if (isDisliked(hct)) {
            return Hct.from(hct.getHue(), hct.getChroma(), 70.0d);
        }
        return hct;
    }

    public static boolean isDisliked(Hct hct) {
        boolean z11;
        boolean z12;
        boolean z13;
        if (Math.round(hct.getHue()) >= 90.0d && Math.round(hct.getHue()) <= 111.0d) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (Math.round(hct.getChroma()) > 16.0d) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (Math.round(hct.getTone()) < 65.0d) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z11 || !z12 || !z13) {
            return false;
        }
        return true;
    }
}
