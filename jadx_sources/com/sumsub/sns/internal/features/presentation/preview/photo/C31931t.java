package com.sumsub.sns.internal.features.presentation.preview.photo;

import com.sumsub.sentry.android.AbstractC27920h;
import com.sumsub.sns.internal.features.presentation.preview.AbstractC31512e;
import java.util.ArrayList;
import java.util.List;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.t */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31931t extends AbstractC31512e {

    /* JADX INFO: renamed from: a */
    public final List f64909a;

    /* JADX INFO: renamed from: b */
    public final C31932u f64910b;

    /* JADX INFO: renamed from: c */
    public final boolean f64911c;

    /* JADX INFO: renamed from: d */
    public final boolean f64912d;

    /* JADX INFO: renamed from: e */
    public final C31916p f64913e;

    public /* synthetic */ C31931t(ArrayList arrayList, boolean z11, C31916p c31916p, int i11) {
        this((i11 & 1) != 0 ? CollectionsKt.emptyList() : arrayList, null, (i11 & 4) != 0 ? false : z11, false, (i11 & 16) != 0 ? null : c31916p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31931t)) {
            return false;
        }
        C31931t c31931t = (C31931t) obj;
        return Intrinsics.areEqual(this.f64909a, c31931t.f64909a) && Intrinsics.areEqual(this.f64910b, c31931t.f64910b) && this.f64911c == c31931t.f64911c && this.f64912d == c31931t.f64912d && Intrinsics.areEqual(this.f64913e, c31931t.f64913e);
    }

    /* JADX INFO: renamed from: a */
    public static C31931t m70949a(C31931t c31931t, ArrayList arrayList, C31932u c31932u, boolean z11, boolean z12, C31916p c31916p, int i11) {
        List list = arrayList;
        if ((i11 & 1) != 0) {
            list = c31931t.f64909a;
        }
        List list2 = list;
        if ((i11 & 2) != 0) {
            c31932u = c31931t.f64910b;
        }
        C31932u c31932u2 = c31932u;
        if ((i11 & 4) != 0) {
            z11 = c31931t.f64911c;
        }
        boolean z13 = z11;
        if ((i11 & 8) != 0) {
            z12 = c31931t.f64912d;
        }
        boolean z14 = z12;
        if ((i11 & 16) != 0) {
            c31916p = c31931t.f64913e;
        }
        c31931t.getClass();
        return new C31931t(list2, c31932u2, z13, z14, c31916p);
    }

    public final int hashCode() {
        int iHashCode = this.f64909a.hashCode() * 31;
        C31932u c31932u = this.f64910b;
        int iM69001a = AbstractC27920h.m69001a(this.f64912d, AbstractC27920h.m69001a(this.f64911c, (iHashCode + (c31932u == null ? 0 : c31932u.hashCode())) * 31, 31), 31);
        C31916p c31916p = this.f64913e;
        return iM69001a + (c31916p != null ? c31916p.hashCode() : 0);
    }

    public final String toString() {
        return "SNSPreviewPhotoDocumentViewState(documents=" + this.f64909a + ", warning=" + this.f64910b + ", rotationAvailable=" + this.f64911c + ", showContent=" + this.f64912d + ", content=" + this.f64913e + ")";
    }

    public C31931t(List list, C31932u c31932u, boolean z11, boolean z12, C31916p c31916p) {
        this.f64909a = list;
        this.f64910b = c31932u;
        this.f64911c = z11;
        this.f64912d = z12;
        this.f64913e = c31916p;
    }
}
