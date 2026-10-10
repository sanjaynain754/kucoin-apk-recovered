package com.kubi.sdk.util;

import android.widget.TextView;
import androidx.core.view.GravityCompat;
import com.blankj.utilcode.util.C5303w0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.util.n1 */
/* JADX INFO: compiled from: TextViewEx.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"autoFitRTLGravityStart", "", "Landroid/widget/TextView;", "autoFitRTLGravityEnd", "autoFitRtl", "autoFitRTLDrawableStart", "iconResId", "", "LComponent_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C24256n1 {
    /* JADX INFO: renamed from: a */
    public static final void m58511a(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setGravity(C5303w0.m6511a() ? GravityCompat.START : GravityCompat.END);
    }

    /* JADX INFO: renamed from: b */
    public static final void m58512b(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setGravity(C5303w0.m6511a() ? GravityCompat.END : GravityCompat.START);
    }

    /* JADX INFO: renamed from: c */
    public static final void m58513c(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setTextDirection(C5303w0.m6511a() ? 4 : 3);
    }
}
