package com.jumio.commons.utils;

import android.content.Context;
import android.util.TypedValue;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.math.MathKt;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0006\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0007"}, m90084d2 = {"spToPx", "", "c", "Landroid/content/Context;", "pxToDp", "", "dpToPx", "jumio-core_release"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ScreenUtilKt {
    public static final int dpToPx(int i11, @NotNull Context c11) {
        Intrinsics.checkNotNullParameter(c11, "c");
        return MathKt.roundToInt(TypedValue.applyDimension(1, i11, c11.getResources().getDisplayMetrics()));
    }

    public static final int pxToDp(int i11, @NotNull Context c11) {
        Intrinsics.checkNotNullParameter(c11, "c");
        return (int) ((i11 / c11.getResources().getDisplayMetrics().densityDpi) / 160.0f);
    }

    public static final float spToPx(float f11, @NotNull Context c11) {
        Intrinsics.checkNotNullParameter(c11, "c");
        return TypedValue.applyDimension(2, f11, c11.getResources().getDisplayMetrics());
    }
}
