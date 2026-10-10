package com.kubi.app.bizcontrol;

import android.view.View;
import org.jetbrains.annotations.NotNull;
import p294gz.C38057a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.app.bizcontrol.b */
/* JADX INFO: compiled from: BizControlExt.kt */
/* JADX INFO: loaded from: classes64.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0001¨\u0006\u0006"}, m90084d2 = {"visibilityWithBizControl", "", "Landroid/view/View;", "spmId", "", "defaultHideVisible", "LBizControl_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C9415b {
    /* JADX INFO: renamed from: a */
    public static final int m15003a(@NotNull View view, @NotNull String spmId, int i11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(spmId, "spmId");
        if (C38057a.f85671a.m85928a(spmId, true)) {
            i11 = 0;
        }
        view.setVisibility(i11);
        return view.getVisibility();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m15004b(View view, String str, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 8;
        }
        return m15003a(view, str, i11);
    }
}
