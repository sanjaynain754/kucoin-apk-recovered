package com.sumsub.sns.internal.features.data.model.common;

import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29136j {

    /* JADX INFO: renamed from: a */
    public final String f59101a;

    /* JADX INFO: renamed from: b */
    public final String f59102b;

    /* JADX INFO: renamed from: c */
    public final String f59103c;

    /* JADX INFO: renamed from: d */
    public final String f59104d;

    /* JADX INFO: renamed from: e */
    public final String f59105e;

    /* JADX INFO: renamed from: f */
    public final String f59106f;

    /* JADX INFO: renamed from: g */
    public final String f59107g;

    /* JADX INFO: renamed from: h */
    public final String f59108h;

    /* JADX INFO: renamed from: i */
    public final String f59109i;

    /* JADX INFO: renamed from: j */
    public final String f59110j;

    /* JADX INFO: renamed from: k */
    public final String f59111k;

    /* JADX INFO: renamed from: l */
    public final String f59112l;

    /* JADX INFO: renamed from: m */
    public final List f59113m;

    /* JADX INFO: renamed from: n */
    public final String f59114n;

    /* JADX INFO: renamed from: o */
    public final String f59115o;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29136j)) {
            return false;
        }
        C29136j c29136j = (C29136j) obj;
        return Intrinsics.areEqual(this.f59101a, c29136j.f59101a) && Intrinsics.areEqual(this.f59102b, c29136j.f59102b) && Intrinsics.areEqual(this.f59103c, c29136j.f59103c) && Intrinsics.areEqual(this.f59104d, c29136j.f59104d) && Intrinsics.areEqual(this.f59105e, c29136j.f59105e) && Intrinsics.areEqual(this.f59106f, c29136j.f59106f) && Intrinsics.areEqual(this.f59107g, c29136j.f59107g) && Intrinsics.areEqual(this.f59108h, c29136j.f59108h) && Intrinsics.areEqual(this.f59109i, c29136j.f59109i) && Intrinsics.areEqual(this.f59110j, c29136j.f59110j) && Intrinsics.areEqual(this.f59111k, c29136j.f59111k) && Intrinsics.areEqual(this.f59112l, c29136j.f59112l) && Intrinsics.areEqual(this.f59113m, c29136j.f59113m) && Intrinsics.areEqual(this.f59114n, c29136j.f59114n) && Intrinsics.areEqual(this.f59115o, c29136j.f59115o);
    }

    public final int hashCode() {
        String str = this.f59101a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59102b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f59103c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f59104d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f59105e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f59106f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f59107g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f59108h;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f59109i;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f59110j;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f59111k;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f59112l;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        List list = this.f59113m;
        int iHashCode13 = (iHashCode12 + (list == null ? 0 : list.hashCode())) * 31;
        String str13 = this.f59114n;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f59115o;
        return iHashCode14 + (str14 != null ? str14.hashCode() : 0);
    }

    public final String toString() {
        return "Info(country=" + this.f59101a + ", taxResidenceCountry=" + this.f59102b + ", firstName=" + this.f59103c + ", lastName=" + this.f59104d + ", middleName=" + this.f59105e + ", legalName=" + this.f59106f + ", gender=" + this.f59107g + ", dob=" + this.f59108h + ", placeOfBirth=" + this.f59109i + ", countryOfBirth=" + this.f59110j + ", stateOfBirth=" + this.f59111k + ", nationality=" + this.f59112l + ", addresses=" + this.f59113m + ", tin=" + this.f59114n + ", phone=" + this.f59115o + ")";
    }

    public C29136j(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, List list, String str13, String str14) {
        this.f59101a = str;
        this.f59102b = str2;
        this.f59103c = str3;
        this.f59104d = str4;
        this.f59105e = str5;
        this.f59106f = str6;
        this.f59107g = str7;
        this.f59108h = str8;
        this.f59109i = str9;
        this.f59110j = str10;
        this.f59111k = str11;
        this.f59112l = str12;
        this.f59113m = list;
        this.f59114n = str13;
        this.f59115o = str14;
    }
}
