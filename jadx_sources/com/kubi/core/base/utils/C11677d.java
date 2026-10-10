package com.kubi.core.base.utils;

import android.view.View;
import cn.jiguang.privates.push.constants.JPushConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.core.base.utils.d */
/* JADX INFO: compiled from: TradeCoreViewExt.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¨\u0006\u0007"}, m90084d2 = {"setSafeClickListener", "", "Landroid/view/View;", JPushConstants.Geofence.KEY_INTERVAL, "", "onClick", "Lkotlin/Function1;", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C11677d {
    /* JADX INFO: renamed from: e */
    public static final void m21217e(Function1 function1, long j11, final View view) {
        view.setEnabled(false);
        Intrinsics.checkNotNull(view);
        function1.invoke(view);
        view.postDelayed(new Runnable() { // from class: com.kubi.core.base.utils.c
            @Override // java.lang.Runnable
            public final void run() {
                C11677d.m21218f(view);
            }
        }, j11);
    }

    /* JADX INFO: renamed from: f */
    public static final void m21218f(View view) {
        view.setEnabled(true);
    }

    /* JADX INFO: renamed from: c */
    public static final void m21215c(@NotNull View view, final long j11, @NotNull final Function1<? super View, Unit> onClick) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        view.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.core.base.utils.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C11677d.m21217e(onClick, j11, view2);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m21216d(View view, long j11, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 600;
        }
        m21215c(view, j11, function1);
    }
}
