package com.swmansion.rnscreens.ext;

import p852kotlin.Metadata;

/* JADX INFO: compiled from: NumericExt.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0000¨\u0006\u0005"}, m90084d2 = {"equalWithRespectToEps", "", "", "other", "eps", "react-native-screens_release"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class NumericExtKt {
    public static final boolean equalWithRespectToEps(float f11, float f12, float f13) {
        return Math.abs(f11 - f12) <= f13;
    }

    public static /* synthetic */ boolean equalWithRespectToEps$default(float f11, float f12, float f13, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f13 = 1.0E-4f;
        }
        return equalWithRespectToEps(f11, f12, f13);
    }
}
