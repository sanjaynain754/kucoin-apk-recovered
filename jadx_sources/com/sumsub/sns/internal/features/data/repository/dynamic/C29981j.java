package com.sumsub.sns.internal.features.data.repository.dynamic;

import com.sumsub.sentry.android.AbstractC27920h;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.dynamic.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29981j {

    /* JADX INFO: renamed from: a */
    public final String f60244a;

    /* JADX INFO: renamed from: b */
    public final boolean f60245b;

    /* JADX INFO: renamed from: c */
    public final String f60246c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29981j)) {
            return false;
        }
        C29981j c29981j = (C29981j) obj;
        return Intrinsics.areEqual(this.f60244a, c29981j.f60244a) && this.f60245b == c29981j.f60245b && Intrinsics.areEqual(this.f60246c, c29981j.f60246c);
    }

    public final int hashCode() {
        int iM69001a = AbstractC27920h.m69001a(this.f60245b, this.f60244a.hashCode() * 31, 31);
        String str = this.f60246c;
        return iM69001a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "FeatureFlag(name=" + this.f60244a + ", isEnabled=" + this.f60245b + ", value=" + this.f60246c + ")";
    }

    public C29981j(String str, boolean z11, String str2) {
        this.f60244a = str;
        this.f60245b = z11;
        this.f60246c = str2;
    }
}
