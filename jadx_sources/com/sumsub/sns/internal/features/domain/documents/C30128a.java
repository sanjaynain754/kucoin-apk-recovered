package com.sumsub.sns.internal.features.domain.documents;

import com.sumsub.sentry.AbstractC27897U;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.documents.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30128a {

    /* JADX INFO: renamed from: a */
    public final String f60567a;

    /* JADX INFO: renamed from: b */
    public final String f60568b;

    /* JADX INFO: renamed from: c */
    public final DocumentSideness f60569c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30128a)) {
            return false;
        }
        C30128a c30128a = (C30128a) obj;
        return Intrinsics.areEqual(this.f60567a, c30128a.f60567a) && Intrinsics.areEqual(this.f60568b, c30128a.f60568b) && this.f60569c == c30128a.f60569c;
    }

    public final int hashCode() {
        return this.f60569c.hashCode() + AbstractC27897U.m68983a(this.f60568b, this.f60567a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "DocumentInfo(countryKey=" + this.f60567a + ", idDocType=" + this.f60568b + ", sideness=" + this.f60569c + ")";
    }

    public C30128a(String str, String str2, DocumentSideness documentSideness) {
        this.f60567a = str;
        this.f60568b = str2;
        this.f60569c = documentSideness;
    }
}
