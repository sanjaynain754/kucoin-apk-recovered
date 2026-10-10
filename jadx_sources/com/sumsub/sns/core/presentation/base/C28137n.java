package com.sumsub.sns.core.presentation.base;

import com.sumsub.sns.internal.core.common.AbstractC28503w;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28137n implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final AbstractC28503w f57368a;

    /* JADX INFO: renamed from: b */
    public final Object f57369b;

    /* JADX INFO: renamed from: c */
    public final Long f57370c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28137n)) {
            return false;
        }
        C28137n c28137n = (C28137n) obj;
        return Intrinsics.areEqual(this.f57368a, c28137n.f57368a) && Intrinsics.areEqual(this.f57369b, c28137n.f57369b) && Intrinsics.areEqual(this.f57370c, c28137n.f57370c);
    }

    public final int hashCode() {
        int iHashCode = this.f57368a.hashCode() * 31;
        Object obj = this.f57369b;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Long l11 = this.f57370c;
        return iHashCode2 + (l11 != null ? l11.hashCode() : 0);
    }

    public final String toString() {
        return "FinishEvent(reason=" + this.f57368a + ", payload=" + this.f57369b + ", delay=" + this.f57370c + ")";
    }

    public C28137n(AbstractC28503w abstractC28503w, Object obj, Long l11) {
        this.f57368a = abstractC28503w;
        this.f57369b = obj;
        this.f57370c = l11;
    }
}
