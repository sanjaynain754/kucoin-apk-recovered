package com.sumsub.sns.internal.core.presentation.theme;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.theme.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28955c extends AbstractC28962j {

    /* JADX INFO: renamed from: a */
    public final Integer f58858a;

    /* JADX INFO: renamed from: b */
    public final Integer f58859b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28955c)) {
            return false;
        }
        C28955c c28955c = (C28955c) obj;
        return Intrinsics.areEqual(this.f58858a, c28955c.f58858a) && Intrinsics.areEqual(this.f58859b, c28955c.f58859b);
    }

    public final int hashCode() {
        Integer num = this.f58858a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f58859b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "Color(dark=" + this.f58858a + ", light=" + this.f58859b + ")";
    }

    public C28955c(Integer num, Integer num2) {
        this.f58858a = num;
        this.f58859b = num2;
    }
}
