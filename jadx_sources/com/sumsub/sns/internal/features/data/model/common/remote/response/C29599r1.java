package com.sumsub.sns.internal.features.data.model.common.remote.response;

import com.sumsub.sns.internal.features.data.model.common.C29182r;
import com.sumsub.sns.internal.features.data.model.common.C29704v;
import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import java.util.List;
import kotlinx.serialization.internal.C41813f;
import kotlinx.serialization.internal.C41897w2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.r1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29599r1 {

    @NotNull
    public static final C29499P0 Companion = new C29499P0();

    /* JADX INFO: renamed from: r */
    public static final Lazy[] f59619r;

    /* JADX INFO: renamed from: a */
    public final String f59620a;

    /* JADX INFO: renamed from: b */
    public final List f59621b;

    /* JADX INFO: renamed from: c */
    public final List f59622c;

    /* JADX INFO: renamed from: d */
    public final String f59623d;

    /* JADX INFO: renamed from: e */
    public final List f59624e;

    /* JADX INFO: renamed from: f */
    public final List f59625f;

    /* JADX INFO: renamed from: g */
    public final String f59626g;

    /* JADX INFO: renamed from: h */
    public final String f59627h;

    /* JADX INFO: renamed from: i */
    public final String f59628i;

    /* JADX INFO: renamed from: j */
    public final String f59629j;

    /* JADX INFO: renamed from: k */
    public final Boolean f59630k;

    /* JADX INFO: renamed from: l */
    public final String f59631l;

    /* JADX INFO: renamed from: m */
    public final Boolean f59632m;

    /* JADX INFO: renamed from: n */
    public final C29510V0 f59633n;

    /* JADX INFO: renamed from: o */
    public final C29516Y0 f59634o;

    /* JADX INFO: renamed from: p */
    public final C29504S0 f59635p;

    /* JADX INFO: renamed from: q */
    public final C29595q1 f59636q;

    public /* synthetic */ C29599r1(int i11, String str, List list, List list2, String str2, List list3, List list4, String str3, String str4, String str5, String str6, Boolean bool, String str7, Boolean bool2, C29510V0 c29510v0, C29516Y0 c29516y0, C29504S0 c29504s0, C29595q1 c29595q1) {
        if ((i11 & 1) == 0) {
            this.f59620a = null;
        } else {
            this.f59620a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59621b = null;
        } else {
            this.f59621b = list;
        }
        if ((i11 & 4) == 0) {
            this.f59622c = null;
        } else {
            this.f59622c = list2;
        }
        if ((i11 & 8) == 0) {
            this.f59623d = null;
        } else {
            this.f59623d = str2;
        }
        if ((i11 & 16) == 0) {
            this.f59624e = null;
        } else {
            this.f59624e = list3;
        }
        if ((i11 & 32) == 0) {
            this.f59625f = null;
        } else {
            this.f59625f = list4;
        }
        if ((i11 & 64) == 0) {
            this.f59626g = null;
        } else {
            this.f59626g = str3;
        }
        if ((i11 & 128) == 0) {
            this.f59627h = null;
        } else {
            this.f59627h = str4;
        }
        if ((i11 & 256) == 0) {
            this.f59628i = null;
        } else {
            this.f59628i = str5;
        }
        if ((i11 & 512) == 0) {
            this.f59629j = null;
        } else {
            this.f59629j = str6;
        }
        if ((i11 & 1024) == 0) {
            this.f59630k = null;
        } else {
            this.f59630k = bool;
        }
        if ((i11 & 2048) == 0) {
            this.f59631l = null;
        } else {
            this.f59631l = str7;
        }
        if ((i11 & 4096) == 0) {
            this.f59632m = null;
        } else {
            this.f59632m = bool2;
        }
        if ((i11 & 8192) == 0) {
            this.f59633n = null;
        } else {
            this.f59633n = c29510v0;
        }
        if ((i11 & 16384) == 0) {
            this.f59634o = null;
        } else {
            this.f59634o = c29516y0;
        }
        if ((32768 & i11) == 0) {
            this.f59635p = null;
        } else {
            this.f59635p = c29504s0;
        }
        if ((i11 & 65536) == 0) {
            this.f59636q = null;
        } else {
            this.f59636q = c29595q1;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29599r1)) {
            return false;
        }
        C29599r1 c29599r1 = (C29599r1) obj;
        return Intrinsics.areEqual(this.f59620a, c29599r1.f59620a) && Intrinsics.areEqual(this.f59621b, c29599r1.f59621b) && Intrinsics.areEqual(this.f59622c, c29599r1.f59622c) && Intrinsics.areEqual(this.f59623d, c29599r1.f59623d) && Intrinsics.areEqual(this.f59624e, c29599r1.f59624e) && Intrinsics.areEqual(this.f59625f, c29599r1.f59625f) && Intrinsics.areEqual(this.f59626g, c29599r1.f59626g) && Intrinsics.areEqual(this.f59627h, c29599r1.f59627h) && Intrinsics.areEqual(this.f59628i, c29599r1.f59628i) && Intrinsics.areEqual(this.f59629j, c29599r1.f59629j) && Intrinsics.areEqual(this.f59630k, c29599r1.f59630k) && Intrinsics.areEqual(this.f59631l, c29599r1.f59631l) && Intrinsics.areEqual(this.f59632m, c29599r1.f59632m) && Intrinsics.areEqual(this.f59633n, c29599r1.f59633n) && Intrinsics.areEqual(this.f59634o, c29599r1.f59634o) && Intrinsics.areEqual(this.f59635p, c29599r1.f59635p) && Intrinsics.areEqual(this.f59636q, c29599r1.f59636q);
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f59619r = new Lazy[]{null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.response.w2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29599r1.m69887a();
            }
        }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.response.x2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29599r1.m69888b();
            }
        }), null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.response.y2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29599r1.m69889c();
            }
        }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.response.z2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29599r1.m69890d();
            }
        }), null, null, null, null, null, null, null, null, null, null, null};
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m69887a() {
        return new C41813f(C41897w2.f92051a);
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ InterfaceC44951d m69888b() {
        return new C41813f(IdentitySide.Companion.serializer());
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ InterfaceC44951d m69889c() {
        return new C41813f(C29704v.f59768a);
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ InterfaceC44951d m69890d() {
        return new C41813f(C29182r.f59180a);
    }

    public final int hashCode() {
        String str = this.f59620a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f59621b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f59622c;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.f59623d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list3 = this.f59624e;
        int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.f59625f;
        int iHashCode6 = (iHashCode5 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str3 = this.f59626g;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f59627h;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f59628i;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f59629j;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.f59630k;
        int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str7 = this.f59631l;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool2 = this.f59632m;
        int iHashCode13 = (iHashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        C29510V0 c29510v0 = this.f59633n;
        int iHashCode14 = (iHashCode13 + (c29510v0 == null ? 0 : c29510v0.hashCode())) * 31;
        C29516Y0 c29516y0 = this.f59634o;
        int iHashCode15 = (iHashCode14 + (c29516y0 == null ? 0 : c29516y0.hashCode())) * 31;
        C29504S0 c29504s0 = this.f59635p;
        int iHashCode16 = (iHashCode15 + (c29504s0 == null ? 0 : c29504s0.hashCode())) * 31;
        C29595q1 c29595q1 = this.f59636q;
        return iHashCode16 + (c29595q1 != null ? c29595q1.hashCode() : 0);
    }

    public final String toString() {
        return "DocSetsItem(idDocSetType=" + this.f59620a + ", types=" + this.f59621b + ", sides=" + this.f59622c + ", videoRequired=" + this.f59623d + ", fields=" + this.f59624e + ", customFields=" + this.f59625f + ", questionnaireId=" + this.f59626g + ", questionnaireDefId=" + this.f59627h + ", captureMode=" + this.f59628i + ", uploaderMode=" + this.f59629j + ", restrictCountries=" + this.f59630k + ", poaStepSettingsId=" + this.f59631l + ", skipAllowed=" + this.f59632m + ", nfcVerificationSettings=" + this.f59633n + ", phoneVerificationSettings=" + this.f59634o + ", emailVerificationSettings=" + this.f59635p + ", paymentSourceSettings=" + this.f59636q + ")";
    }
}
