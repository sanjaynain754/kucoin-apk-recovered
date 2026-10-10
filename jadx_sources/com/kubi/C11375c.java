package com.kubi;

import org.jetbrains.annotations.NotNull;
import p569qq.C43847h;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.c */
/* JADX INFO: compiled from: TradeBusinessEvent.kt */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"businessEvent", "", "businessType", "Lcom/kubi/BusinessType;", "ret", "Lcom/kubi/QueryRet;", "code", "", "TradeBaseLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C11375c {
    /* JADX INFO: renamed from: a */
    public static final void m20294a(@NotNull BusinessType businessType, int i11) {
        Intrinsics.checkNotNullParameter(businessType, "businessType");
        C43847h.m96572a(businessType.getKunlunEvent(), i11);
    }

    /* JADX INFO: renamed from: b */
    public static final void m20295b(@NotNull BusinessType businessType, @NotNull QueryRet ret) {
        Intrinsics.checkNotNullParameter(businessType, "businessType");
        Intrinsics.checkNotNullParameter(ret, "ret");
        C43847h.m96572a(businessType.getKunlunEvent(), ret.ordinal());
    }
}
