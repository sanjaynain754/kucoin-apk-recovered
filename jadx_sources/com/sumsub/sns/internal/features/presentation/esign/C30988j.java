package com.sumsub.sns.internal.features.presentation.esign;

import com.sumsub.sns.internal.core.analytics.Screen;
import java.util.Map;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.esign.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30988j {

    /* JADX INFO: renamed from: a */
    public final Screen f62619a;

    /* JADX INFO: renamed from: b */
    public final Map f62620b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30988j)) {
            return false;
        }
        C30988j c30988j = (C30988j) obj;
        return this.f62619a == c30988j.f62619a && Intrinsics.areEqual(this.f62620b, c30988j.f62620b);
    }

    public final int hashCode() {
        return this.f62620b.hashCode() + (this.f62619a.hashCode() * 31);
    }

    public final String toString() {
        return "Analytics(screen=" + this.f62619a + ", payload=" + this.f62620b + ")";
    }

    public C30988j(Screen screen, Map map) {
        this.f62619a = screen;
        this.f62620b = map;
    }
}
