package com.sumsub.sns.internal.features.presentation.preview.photo.identity;

import com.sumsub.sentry.AbstractC27897U;
import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.internal.features.data.model.common.Document;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.identity.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31809m implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final Document f64631a;

    /* JADX INFO: renamed from: b */
    public final String f64632b;

    /* JADX INFO: renamed from: c */
    public final String f64633c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31809m)) {
            return false;
        }
        C31809m c31809m = (C31809m) obj;
        return Intrinsics.areEqual(this.f64631a, c31809m.f64631a) && Intrinsics.areEqual(this.f64632b, c31809m.f64632b) && Intrinsics.areEqual(this.f64633c, c31809m.f64633c);
    }

    public final int hashCode() {
        return this.f64633c.hashCode() + AbstractC27897U.m68983a(this.f64632b, this.f64631a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "OpenEkyc(document=" + this.f64631a + ", countryKey=" + this.f64632b + ", ekycSourceId=" + this.f64633c + ")";
    }

    public C31809m(Document document, String str, String str2) {
        this.f64631a = document;
        this.f64632b = str;
        this.f64633c = str2;
    }
}
