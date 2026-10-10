package com.sumsub.sns.internal.features.data.repository.dynamic;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.dynamic.L */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29969L extends AbstractC29971N {

    /* JADX INFO: renamed from: a */
    public final Throwable f60205a;

    /* JADX INFO: renamed from: b */
    public final Object f60206b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29969L)) {
            return false;
        }
        C29969L c29969l = (C29969L) obj;
        return Intrinsics.areEqual(this.f60205a, c29969l.f60205a) && Intrinsics.areEqual(this.f60206b, c29969l.f60206b);
    }

    @Override // com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N
    /* JADX INFO: renamed from: a */
    public final Throwable mo70049a() {
        return this.f60205a;
    }

    public final int hashCode() {
        int iHashCode = this.f60205a.hashCode() * 31;
        Object obj = this.f60206b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "Failure(throwable=" + this.f60205a + ", lastValue=" + this.f60206b + ")";
    }

    public C29969L(Throwable th2, Object obj) {
        this.f60205a = th2;
        this.f60206b = obj;
    }
}
