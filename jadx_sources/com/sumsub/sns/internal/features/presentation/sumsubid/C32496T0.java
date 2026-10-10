package com.sumsub.sns.internal.features.presentation.sumsubid;

import com.sumsub.sentry.AbstractC27897U;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.T0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32496T0 extends AbstractC32498U0 {

    /* JADX INFO: renamed from: a */
    public final String f66324a;

    /* JADX INFO: renamed from: b */
    public final String f66325b;

    /* JADX INFO: renamed from: c */
    public final String f66326c;

    /* JADX INFO: renamed from: d */
    public final Function1 f66327d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32496T0)) {
            return false;
        }
        C32496T0 c32496t0 = (C32496T0) obj;
        return Intrinsics.areEqual(this.f66324a, c32496t0.f66324a) && Intrinsics.areEqual(this.f66325b, c32496t0.f66325b) && Intrinsics.areEqual(this.f66326c, c32496t0.f66326c) && Intrinsics.areEqual(this.f66327d, c32496t0.f66327d);
    }

    public final int hashCode() {
        return this.f66327d.hashCode() + AbstractC27897U.m68983a(this.f66326c, AbstractC27897U.m68983a(this.f66325b, this.f66324a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "WebViewAccount(url=" + this.f66324a + ", baseUrl=" + this.f66325b + ", cookie=" + this.f66326c + ", openUrlIntent=" + this.f66327d + ")";
    }

    public C32496T0(String str, String str2, String str3, Function1 function1) {
        this.f66324a = str;
        this.f66325b = str2;
        this.f66326c = str3;
        this.f66327d = function1;
    }
}
