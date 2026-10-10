package com.kubi.kumex.utils;

import android.content.Context;
import android.util.TypedValue;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import com.kubi.kumex.R$color;
import com.kubi.utils.C27017c;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kumex.utils.c */
/* JADX INFO: compiled from: ColorEx.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0001H\u0007¨\u0006\u0004"}, m90084d2 = {"getAttrColor", "", "Landroid/content/Context;", "attrid", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C17037c {
    @ColorInt
    /* JADX INFO: renamed from: a */
    public static final int m36495a(@NotNull Context context, @AttrRes int i11) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i11, typedValue, true);
        int i12 = typedValue.data;
        return i12 == 0 ? C27017c.f54310a.m66512a(R$color.primary) : i12;
    }
}
