package com.sumsub.sns.internal.features.presentation.preview.applicantdata;

import com.sumsub.sns.internal.features.presentation.preview.AbstractC31512e;
import java.util.ArrayList;
import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.applicantdata.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31494l extends AbstractC31512e {

    /* JADX INFO: renamed from: a */
    public final List f63892a;

    /* JADX INFO: renamed from: b */
    public final List f63893b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f63894c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f63895d;

    /* JADX INFO: renamed from: e */
    public final CharSequence f63896e;

    /* JADX INFO: renamed from: f */
    public final boolean f63897f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31494l)) {
            return false;
        }
        C31494l c31494l = (C31494l) obj;
        return Intrinsics.areEqual(this.f63892a, c31494l.f63892a) && Intrinsics.areEqual(this.f63893b, c31494l.f63893b) && Intrinsics.areEqual(this.f63894c, c31494l.f63894c) && Intrinsics.areEqual(this.f63895d, c31494l.f63895d) && Intrinsics.areEqual(this.f63896e, c31494l.f63896e) && this.f63897f == c31494l.f63897f;
    }

    /* JADX INFO: renamed from: a */
    public static C31494l m70756a(C31494l c31494l, List list, ArrayList arrayList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z11, int i11) {
        if ((i11 & 1) != 0) {
            list = c31494l.f63892a;
        }
        List list2 = list;
        List list3 = arrayList;
        if ((i11 & 2) != 0) {
            list3 = c31494l.f63893b;
        }
        List list4 = list3;
        if ((i11 & 4) != 0) {
            charSequence = c31494l.f63894c;
        }
        CharSequence charSequence4 = charSequence;
        if ((i11 & 8) != 0) {
            charSequence2 = c31494l.f63895d;
        }
        CharSequence charSequence5 = charSequence2;
        if ((i11 & 16) != 0) {
            charSequence3 = c31494l.f63896e;
        }
        CharSequence charSequence6 = charSequence3;
        if ((i11 & 32) != 0) {
            z11 = c31494l.f63897f;
        }
        c31494l.getClass();
        return new C31494l(list2, list4, charSequence4, charSequence5, charSequence6, z11);
    }

    public final int hashCode() {
        int iHashCode = (this.f63893b.hashCode() + (this.f63892a.hashCode() * 31)) * 31;
        CharSequence charSequence = this.f63894c;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.f63895d;
        int iHashCode3 = (iHashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f63896e;
        return Boolean.hashCode(this.f63897f) + ((iHashCode3 + (charSequence3 != null ? charSequence3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        List list = this.f63892a;
        List list2 = this.f63893b;
        CharSequence charSequence = this.f63894c;
        CharSequence charSequence2 = this.f63895d;
        CharSequence charSequence3 = this.f63896e;
        return "ViewState(errors=" + list + ", formItems=" + list2 + ", title=" + ((Object) charSequence) + ", subtitle=" + ((Object) charSequence2) + ", buttonContinue=" + ((Object) charSequence3) + ", showContent=" + this.f63897f + ")";
    }

    public C31494l(List list, List list2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z11) {
        this.f63892a = list;
        this.f63893b = list2;
        this.f63894c = charSequence;
        this.f63895d = charSequence2;
        this.f63896e = charSequence3;
        this.f63897f = z11;
    }
}
