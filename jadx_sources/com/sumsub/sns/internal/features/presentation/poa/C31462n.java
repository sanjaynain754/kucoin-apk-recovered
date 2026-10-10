package com.sumsub.sns.internal.features.presentation.poa;

import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.poa.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31462n implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final CharSequence f63791a;

    /* JADX INFO: renamed from: b */
    public final String f63792b;

    /* JADX INFO: renamed from: c */
    public final List f63793c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f63794d;

    /* JADX INFO: renamed from: e */
    public final String f63795e;

    /* JADX INFO: renamed from: f */
    public final List f63796f;

    /* JADX INFO: renamed from: g */
    public final CharSequence f63797g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31462n)) {
            return false;
        }
        C31462n c31462n = (C31462n) obj;
        return Intrinsics.areEqual(this.f63791a, c31462n.f63791a) && Intrinsics.areEqual(this.f63792b, c31462n.f63792b) && Intrinsics.areEqual(this.f63793c, c31462n.f63793c) && Intrinsics.areEqual(this.f63794d, c31462n.f63794d) && Intrinsics.areEqual(this.f63795e, c31462n.f63795e) && Intrinsics.areEqual(this.f63796f, c31462n.f63796f) && Intrinsics.areEqual(this.f63797g, c31462n.f63797g);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f63791a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        String str = this.f63792b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f63793c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        CharSequence charSequence2 = this.f63794d;
        int iHashCode4 = (iHashCode3 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        String str2 = this.f63795e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list2 = this.f63796f;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        CharSequence charSequence3 = this.f63797g;
        return iHashCode6 + (charSequence3 != null ? charSequence3.hashCode() : 0);
    }

    public final String toString() {
        CharSequence charSequence = this.f63791a;
        String str = this.f63792b;
        List list = this.f63793c;
        CharSequence charSequence2 = this.f63794d;
        return "ShowMoreExamplesEvent(weAcceptTitle=" + ((Object) charSequence) + ", weAcceptIcon=" + str + ", weAcceptItems=" + list + ", weDontAcceptTitle=" + ((Object) charSequence2) + ", weDontAcceptIcon=" + this.f63795e + ", weDontAcceptItems=" + this.f63796f + ", closeButton=" + ((Object) this.f63797g) + ")";
    }

    public C31462n(CharSequence charSequence, String str, List list, CharSequence charSequence2, String str2, List list2, CharSequence charSequence3) {
        this.f63791a = charSequence;
        this.f63792b = str;
        this.f63793c = list;
        this.f63794d = charSequence2;
        this.f63795e = str2;
        this.f63796f = list2;
        this.f63797g = charSequence3;
    }
}
