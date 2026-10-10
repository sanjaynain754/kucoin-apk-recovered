package com.sumsub.sns.internal.features.domain;

import com.sumsub.sentry.AbstractC27897U;
import com.sumsub.sns.internal.features.domain.documents.DocumentSideness;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30175f {

    /* JADX INFO: renamed from: a */
    public final String f60635a;

    /* JADX INFO: renamed from: b */
    public final String f60636b;

    /* JADX INFO: renamed from: c */
    public final DocumentSideness f60637c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30175f)) {
            return false;
        }
        C30175f c30175f = (C30175f) obj;
        return Intrinsics.areEqual(this.f60635a, c30175f.f60635a) && Intrinsics.areEqual(this.f60636b, c30175f.f60636b) && this.f60637c == c30175f.f60637c;
    }

    public final int hashCode() {
        return this.f60637c.hashCode() + AbstractC27897U.m68983a(this.f60636b, this.f60635a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Result(countryKey=" + this.f60635a + ", idDocType=" + this.f60636b + ", sideness=" + this.f60637c + ")";
    }

    public C30175f(String str, String str2, DocumentSideness documentSideness) {
        this.f60635a = str;
        this.f60636b = str2;
        this.f60637c = documentSideness;
    }
}
