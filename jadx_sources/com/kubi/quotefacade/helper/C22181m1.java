package com.kubi.quotefacade.helper;

import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.quotefacade.service.BQuoteFacadeDepend;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.quotefacade.helper.m1 */
/* JADX INFO: compiled from: HoldingsLoginHelper.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0003*\u0004\u0018\u00010\u0004\u001a\u0006\u0010\u0005\u001a\u00020\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"CODE_USER_NOT_LOGIN", "", "isHoldingsNotLoginError", "", "", "isHoldingsUserNotLogin", "QuoteFacadeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C22181m1 {
    /* JADX INFO: renamed from: a */
    public static final boolean m51969a(@Nullable Throwable th2) {
        return (th2 instanceof ApiException) && Intrinsics.areEqual(((ApiException) th2).code, "401");
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m51970b() {
        return !BQuoteFacadeDepend.f42592a.m53025e().c();
    }
}
