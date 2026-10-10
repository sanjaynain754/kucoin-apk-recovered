package com.kubi.sdk.util;

import android.content.Context;
import androidx.annotation.ColorInt;
import com.kubi.resources.C22890g;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.util.b */
/* JADX INFO: compiled from: ColorUtil.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\u0007"}, m90084d2 = {"getChangeRateColor", "", "context", "Landroid/content/Context;", "lastPrice", "", "thisPrice", "LComponent_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C24218b {
    @ColorInt
    /* JADX INFO: renamed from: a */
    public static final int m58391a(@NotNull Context context, double d11, double d12) {
        Intrinsics.checkNotNullParameter(context, "context");
        double d13 = d12 - d11;
        if (d13 > 0.0d) {
            return C22890g.m54291p(context);
        }
        if (d13 < 0.0d) {
            return C22890g.m54289n(context);
        }
        return -1;
    }
}
