package com.sumsub.sns.internal.features.data.model.common;

import com.sumsub.sentry.android.AbstractC27920h;
import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29160n {

    /* JADX INFO: renamed from: a */
    public final List f59151a;

    /* JADX INFO: renamed from: b */
    public final boolean f59152b;

    /* JADX INFO: renamed from: c */
    public final List f59153c;

    /* JADX INFO: renamed from: d */
    public final List f59154d;

    /* JADX INFO: renamed from: e */
    public final List f59155e;

    /* JADX INFO: renamed from: f */
    public final List f59156f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29160n)) {
            return false;
        }
        C29160n c29160n = (C29160n) obj;
        return Intrinsics.areEqual(this.f59151a, c29160n.f59151a) && this.f59152b == c29160n.f59152b && Intrinsics.areEqual(this.f59153c, c29160n.f59153c) && Intrinsics.areEqual(this.f59154d, c29160n.f59154d) && Intrinsics.areEqual(this.f59155e, c29160n.f59155e) && Intrinsics.areEqual(this.f59156f, c29160n.f59156f);
    }

    public final int hashCode() {
        int iM69001a = AbstractC27920h.m69001a(this.f59152b, this.f59151a.hashCode() * 31, 31);
        List list = this.f59153c;
        int iHashCode = (iM69001a + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f59154d;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f59155e;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.f59156f;
        return iHashCode3 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        return "RequiredIdDocs(docSets=" + this.f59151a + ", videoIdent=" + this.f59152b + ", videoIdentUploadTypes=" + this.f59153c + ", stepsOutsideVideoId=" + this.f59154d + ", includedCountries=" + this.f59155e + ", excludedCountries=" + this.f59156f + ")";
    }

    public C29160n(List list, boolean z11, List list2, List list3, List list4, List list5) {
        this.f59151a = list;
        this.f59152b = z11;
        this.f59153c = list2;
        this.f59154d = list3;
        this.f59155e = list4;
        this.f59156f = list5;
    }
}
