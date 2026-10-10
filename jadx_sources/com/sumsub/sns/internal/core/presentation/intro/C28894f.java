package com.sumsub.sns.internal.core.presentation.intro;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.intro.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28894f {

    /* JADX INFO: renamed from: a */
    public final String f58743a;

    /* JADX INFO: renamed from: b */
    public final String f58744b;

    /* JADX INFO: renamed from: c */
    public final C28891c f58745c;

    /* JADX INFO: renamed from: d */
    public final C28891c f58746d;

    /* JADX INFO: renamed from: e */
    public final C28891c f58747e;

    /* JADX INFO: renamed from: f */
    public final String f58748f;

    /* JADX INFO: renamed from: g */
    public final String f58749g;

    /* JADX INFO: renamed from: h */
    public final String f58750h;

    /* JADX INFO: renamed from: i */
    public final String f58751i;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28894f)) {
            return false;
        }
        C28894f c28894f = (C28894f) obj;
        return Intrinsics.areEqual(this.f58743a, c28894f.f58743a) && Intrinsics.areEqual(this.f58744b, c28894f.f58744b) && Intrinsics.areEqual(this.f58745c, c28894f.f58745c) && Intrinsics.areEqual(this.f58746d, c28894f.f58746d) && Intrinsics.areEqual(this.f58747e, c28894f.f58747e) && Intrinsics.areEqual(this.f58748f, c28894f.f58748f) && Intrinsics.areEqual(this.f58749g, c28894f.f58749g) && Intrinsics.areEqual(this.f58750h, c28894f.f58750h) && Intrinsics.areEqual(this.f58751i, c28894f.f58751i);
    }

    public final int hashCode() {
        String str = this.f58743a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f58744b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        C28891c c28891c = this.f58745c;
        int iHashCode3 = (iHashCode2 + (c28891c == null ? 0 : c28891c.hashCode())) * 31;
        C28891c c28891c2 = this.f58746d;
        int iHashCode4 = (iHashCode3 + (c28891c2 == null ? 0 : c28891c2.hashCode())) * 31;
        C28891c c28891c3 = this.f58747e;
        int iHashCode5 = (iHashCode4 + (c28891c3 == null ? 0 : c28891c3.hashCode())) * 31;
        String str3 = this.f58748f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f58749g;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f58750h;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f58751i;
        return iHashCode8 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        return "SNSIntroScreenInfo(title=" + this.f58743a + ", subTitle=" + this.f58744b + ", singleIntro=" + this.f58745c + ", doIntro=" + this.f58746d + ", doNotIntro=" + this.f58747e + ", image=" + this.f58748f + ", header=" + this.f58749g + ", text=" + this.f58750h + ", buttonText=" + this.f58751i + ")";
    }

    public C28894f(String str, String str2, C28891c c28891c, C28891c c28891c2, C28891c c28891c3, String str3, String str4, String str5, String str6) {
        this.f58743a = str;
        this.f58744b = str2;
        this.f58745c = c28891c;
        this.f58746d = c28891c2;
        this.f58747e = c28891c3;
        this.f58748f = str3;
        this.f58749g = str4;
        this.f58750h = str5;
        this.f58751i = str6;
    }
}
