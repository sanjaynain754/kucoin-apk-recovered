package com.blankj.utilcode.util;

import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;

/* JADX INFO: renamed from: com.blankj.utilcode.util.h */
/* JADX INFO: compiled from: ColorUtils.java */
/* JADX INFO: loaded from: classes34.dex */
public final class C5272h {
    /* JADX INFO: renamed from: a */
    public static int m6229a(@ColorInt int i11, @FloatRange(from = 0.0d, m1552to = 1.0d) float f11) {
        return (i11 & 16777215) | (((int) ((f11 * 255.0f) + 0.5f)) << 24);
    }

    /* JADX INFO: renamed from: b */
    public static int m6230b(@ColorInt int i11, @IntRange(from = 0, m1553to = 255) int i12) {
        return (i11 & 16777215) | (i12 << 24);
    }
}
