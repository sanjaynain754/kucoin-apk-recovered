package com.sumsub.sns.internal.core.presentation.intro;

import com.sumsub.sentry.AbstractC27897U;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.intro.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28891c {

    /* JADX INFO: renamed from: a */
    public final String f58740a;

    /* JADX INFO: renamed from: b */
    public final String f58741b;

    /* JADX INFO: renamed from: c */
    public final String f58742c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28891c)) {
            return false;
        }
        C28891c c28891c = (C28891c) obj;
        return Intrinsics.areEqual(this.f58740a, c28891c.f58740a) && Intrinsics.areEqual(this.f58741b, c28891c.f58741b) && Intrinsics.areEqual(this.f58742c, c28891c.f58742c);
    }

    public final int hashCode() {
        return this.f58742c.hashCode() + AbstractC27897U.m68983a(this.f58741b, this.f58740a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "SNSIntroItem(title=" + this.f58740a + ", subTitle=" + this.f58741b + ", iconKey=" + this.f58742c + ")";
    }

    public C28891c(String str, String str2, String str3) {
        this.f58740a = str;
        this.f58741b = str2;
        this.f58742c = str3;
    }
}
