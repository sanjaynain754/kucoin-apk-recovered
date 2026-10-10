package com.sumsub.sns.internal.features.data.model.common.remote.response;

import java.util.List;
import kotlinx.serialization.internal.C41790a1;
import kotlinx.serialization.internal.C41813f;
import kotlinx.serialization.internal.C41897w2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import tg0.C44947b;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;
import ug0.C45236a;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.L0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29489L0 {

    @NotNull
    public static final C29486K0 Companion = new C29486K0();

    /* JADX INFO: renamed from: p */
    public static final Lazy[] f59500p = {null, null, null, null, null, null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.response.n2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C29489L0.m69872a();
        }
    }), null, null, null};

    /* JADX INFO: renamed from: a */
    public final String f59501a;

    /* JADX INFO: renamed from: b */
    public final String f59502b;

    /* JADX INFO: renamed from: c */
    public final String f59503c;

    /* JADX INFO: renamed from: d */
    public final String f59504d;

    /* JADX INFO: renamed from: e */
    public final String f59505e;

    /* JADX INFO: renamed from: f */
    public final String f59506f;

    /* JADX INFO: renamed from: g */
    public final String f59507g;

    /* JADX INFO: renamed from: h */
    public final String f59508h;

    /* JADX INFO: renamed from: i */
    public final String f59509i;

    /* JADX INFO: renamed from: j */
    public final String f59510j;

    /* JADX INFO: renamed from: k */
    public final String f59511k;

    /* JADX INFO: renamed from: l */
    public final List f59512l;

    /* JADX INFO: renamed from: m */
    public final String f59513m;

    /* JADX INFO: renamed from: n */
    public final String f59514n;

    /* JADX INFO: renamed from: o */
    public final String f59515o;

    public /* synthetic */ C29489L0(int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, String str12, String str13, String str14) {
        if ((i11 & 1) == 0) {
            this.f59501a = null;
        } else {
            this.f59501a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59502b = null;
        } else {
            this.f59502b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f59503c = null;
        } else {
            this.f59503c = str3;
        }
        if ((i11 & 8) == 0) {
            this.f59504d = null;
        } else {
            this.f59504d = str4;
        }
        if ((i11 & 16) == 0) {
            this.f59505e = null;
        } else {
            this.f59505e = str5;
        }
        if ((i11 & 32) == 0) {
            this.f59506f = null;
        } else {
            this.f59506f = str6;
        }
        if ((i11 & 64) == 0) {
            this.f59507g = null;
        } else {
            this.f59507g = str7;
        }
        if ((i11 & 128) == 0) {
            this.f59508h = null;
        } else {
            this.f59508h = str8;
        }
        if ((i11 & 256) == 0) {
            this.f59509i = null;
        } else {
            this.f59509i = str9;
        }
        if ((i11 & 512) == 0) {
            this.f59510j = null;
        } else {
            this.f59510j = str10;
        }
        if ((i11 & 1024) == 0) {
            this.f59511k = null;
        } else {
            this.f59511k = str11;
        }
        if ((i11 & 2048) == 0) {
            this.f59512l = null;
        } else {
            this.f59512l = list;
        }
        if ((i11 & 4096) == 0) {
            this.f59513m = null;
        } else {
            this.f59513m = str12;
        }
        if ((i11 & 8192) == 0) {
            this.f59514n = null;
        } else {
            this.f59514n = str13;
        }
        if ((i11 & 16384) == 0) {
            this.f59515o = null;
        } else {
            this.f59515o = str14;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29489L0)) {
            return false;
        }
        C29489L0 c29489l0 = (C29489L0) obj;
        return Intrinsics.areEqual(this.f59501a, c29489l0.f59501a) && Intrinsics.areEqual(this.f59502b, c29489l0.f59502b) && Intrinsics.areEqual(this.f59503c, c29489l0.f59503c) && Intrinsics.areEqual(this.f59504d, c29489l0.f59504d) && Intrinsics.areEqual(this.f59505e, c29489l0.f59505e) && Intrinsics.areEqual(this.f59506f, c29489l0.f59506f) && Intrinsics.areEqual(this.f59507g, c29489l0.f59507g) && Intrinsics.areEqual(this.f59508h, c29489l0.f59508h) && Intrinsics.areEqual(this.f59509i, c29489l0.f59509i) && Intrinsics.areEqual(this.f59510j, c29489l0.f59510j) && Intrinsics.areEqual(this.f59511k, c29489l0.f59511k) && Intrinsics.areEqual(this.f59512l, c29489l0.f59512l) && Intrinsics.areEqual(this.f59513m, c29489l0.f59513m) && Intrinsics.areEqual(this.f59514n, c29489l0.f59514n) && Intrinsics.areEqual(this.f59515o, c29489l0.f59515o);
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m69872a() {
        return new C41813f(new C41790a1(C41897w2.f92051a, C45236a.m99969u(new C44947b(Reflection.getOrCreateKotlinClass(Object.class), null, new InterfaceC44951d[0]))));
    }

    public final int hashCode() {
        String str = this.f59501a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59502b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f59503c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f59504d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f59505e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f59506f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f59507g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f59508h;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f59509i;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f59510j;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f59511k;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        List list = this.f59512l;
        int iHashCode12 = (iHashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        String str12 = this.f59513m;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f59514n;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f59515o;
        return iHashCode14 + (str14 != null ? str14.hashCode() : 0);
    }

    public final String toString() {
        return "Info(country=" + this.f59501a + ", firstName=" + this.f59502b + ", lastName=" + this.f59503c + ", middleName=" + this.f59504d + ", legalName=" + this.f59505e + ", gender=" + this.f59506f + ", dob=" + this.f59507g + ", placeOfBirth=" + this.f59508h + ", countryOfBirth=" + this.f59509i + ", stateOfBirth=" + this.f59510j + ", nationality=" + this.f59511k + ", addresses=" + this.f59512l + ", tin=" + this.f59513m + ", taxResidenceCountry=" + this.f59514n + ", phone=" + this.f59515o + ")";
    }
}
