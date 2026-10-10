package com.sumsub.sns.internal.features.data.model.common.remote;

import com.sumsub.sns.core.data.model.FlowActionType;
import com.sumsub.sns.core.data.model.FlowType;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29586o0;
import java.util.Map;
import kotlinx.serialization.internal.C41790a1;
import kotlinx.serialization.internal.C41801c2;
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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.S0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29277S0 {

    @NotNull
    public static final C29272R0 Companion = new C29272R0();

    /* JADX INFO: renamed from: y */
    public static final Lazy[] f59268y;

    /* JADX INFO: renamed from: a */
    public final Map f59269a;

    /* JADX INFO: renamed from: b */
    public final String f59270b;

    /* JADX INFO: renamed from: c */
    public final String f59271c;

    /* JADX INFO: renamed from: d */
    public final FlowType f59272d;

    /* JADX INFO: renamed from: e */
    public final String f59273e;

    /* JADX INFO: renamed from: f */
    public final String f59274f;

    /* JADX INFO: renamed from: g */
    public final FlowActionType f59275g;

    /* JADX INFO: renamed from: h */
    public final String f59276h;

    /* JADX INFO: renamed from: i */
    public final String f59277i;

    /* JADX INFO: renamed from: j */
    public final Map f59278j;

    /* JADX INFO: renamed from: k */
    public final Map f59279k;

    /* JADX INFO: renamed from: l */
    public final Map f59280l;

    /* JADX INFO: renamed from: m */
    public final Map f59281m;

    /* JADX INFO: renamed from: n */
    public final Map f59282n;

    /* JADX INFO: renamed from: o */
    public final C29252N f59283o;

    /* JADX INFO: renamed from: p */
    public final String f59284p;

    /* JADX INFO: renamed from: q */
    public final String f59285q;

    /* JADX INFO: renamed from: r */
    public final C29261O3 f59286r;

    /* JADX INFO: renamed from: s */
    public final C29449r0 f59287s;

    /* JADX INFO: renamed from: t */
    public final C29586o0 f59288t;

    /* JADX INFO: renamed from: u */
    public final C29385i4 f59289u;

    /* JADX INFO: renamed from: v */
    public final Map f59290v;

    /* JADX INFO: renamed from: w */
    public final Map f59291w;

    /* JADX INFO: renamed from: x */
    public final String f59292x;

    public /* synthetic */ C29277S0(int i11, Map map, String str, String str2, FlowType flowType, String str3, String str4, FlowActionType flowActionType, String str5, String str6, Map map2, Map map3, Map map4, Map map5, Map map6, C29252N c29252n, String str7, String str8, C29261O3 c29261o3, C29449r0 c29449r0, C29586o0 c29586o0, C29385i4 c29385i4, Map map7, Map map8, String str9) {
        if (512 != (i11 & 512)) {
            C41801c2.m91514a(i11, 512, C29268Q0.f59260a.getDescriptor());
        }
        if ((i11 & 1) == 0) {
            this.f59269a = null;
        } else {
            this.f59269a = map;
        }
        if ((i11 & 2) == 0) {
            this.f59270b = null;
        } else {
            this.f59270b = str;
        }
        if ((i11 & 4) == 0) {
            this.f59271c = null;
        } else {
            this.f59271c = str2;
        }
        if ((i11 & 8) == 0) {
            this.f59272d = null;
        } else {
            this.f59272d = flowType;
        }
        if ((i11 & 16) == 0) {
            this.f59273e = null;
        } else {
            this.f59273e = str3;
        }
        if ((i11 & 32) == 0) {
            this.f59274f = null;
        } else {
            this.f59274f = str4;
        }
        if ((i11 & 64) == 0) {
            this.f59275g = null;
        } else {
            this.f59275g = flowActionType;
        }
        if ((i11 & 128) == 0) {
            this.f59276h = null;
        } else {
            this.f59276h = str5;
        }
        if ((i11 & 256) == 0) {
            this.f59277i = null;
        } else {
            this.f59277i = str6;
        }
        this.f59278j = map2;
        if ((i11 & 1024) == 0) {
            this.f59279k = null;
        } else {
            this.f59279k = map3;
        }
        if ((i11 & 2048) == 0) {
            this.f59280l = null;
        } else {
            this.f59280l = map4;
        }
        if ((i11 & 4096) == 0) {
            this.f59281m = null;
        } else {
            this.f59281m = map5;
        }
        if ((i11 & 8192) == 0) {
            this.f59282n = null;
        } else {
            this.f59282n = map6;
        }
        if ((i11 & 16384) == 0) {
            this.f59283o = null;
        } else {
            this.f59283o = c29252n;
        }
        if ((32768 & i11) == 0) {
            this.f59284p = null;
        } else {
            this.f59284p = str7;
        }
        if ((65536 & i11) == 0) {
            this.f59285q = null;
        } else {
            this.f59285q = str8;
        }
        if ((131072 & i11) == 0) {
            this.f59286r = null;
        } else {
            this.f59286r = c29261o3;
        }
        if ((262144 & i11) == 0) {
            this.f59287s = null;
        } else {
            this.f59287s = c29449r0;
        }
        if ((524288 & i11) == 0) {
            this.f59288t = null;
        } else {
            this.f59288t = c29586o0;
        }
        if ((1048576 & i11) == 0) {
            this.f59289u = null;
        } else {
            this.f59289u = c29385i4;
        }
        if ((2097152 & i11) == 0) {
            this.f59290v = null;
        } else {
            this.f59290v = map7;
        }
        if ((4194304 & i11) == 0) {
            this.f59291w = null;
        } else {
            this.f59291w = map8;
        }
        if ((i11 & 8388608) == 0) {
            this.f59292x = null;
        } else {
            this.f59292x = str9;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29277S0)) {
            return false;
        }
        C29277S0 c29277s0 = (C29277S0) obj;
        return Intrinsics.areEqual(this.f59269a, c29277s0.f59269a) && Intrinsics.areEqual(this.f59270b, c29277s0.f59270b) && Intrinsics.areEqual(this.f59271c, c29277s0.f59271c) && this.f59272d == c29277s0.f59272d && Intrinsics.areEqual(this.f59273e, c29277s0.f59273e) && Intrinsics.areEqual(this.f59274f, c29277s0.f59274f) && Intrinsics.areEqual(this.f59275g, c29277s0.f59275g) && Intrinsics.areEqual(this.f59276h, c29277s0.f59276h) && Intrinsics.areEqual(this.f59277i, c29277s0.f59277i) && Intrinsics.areEqual(this.f59278j, c29277s0.f59278j) && Intrinsics.areEqual(this.f59279k, c29277s0.f59279k) && Intrinsics.areEqual(this.f59280l, c29277s0.f59280l) && Intrinsics.areEqual(this.f59281m, c29277s0.f59281m) && Intrinsics.areEqual(this.f59282n, c29277s0.f59282n) && Intrinsics.areEqual(this.f59283o, c29277s0.f59283o) && Intrinsics.areEqual(this.f59284p, c29277s0.f59284p) && Intrinsics.areEqual(this.f59285q, c29277s0.f59285q) && Intrinsics.areEqual(this.f59286r, c29277s0.f59286r) && Intrinsics.areEqual(this.f59287s, c29277s0.f59287s) && Intrinsics.areEqual(this.f59288t, c29277s0.f59288t) && Intrinsics.areEqual(this.f59289u, c29277s0.f59289u) && Intrinsics.areEqual(this.f59290v, c29277s0.f59290v) && Intrinsics.areEqual(this.f59291w, c29277s0.f59291w) && Intrinsics.areEqual(this.f59292x, c29277s0.f59292x);
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f59268y = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.b5
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29277S0.m69822a();
            }
        }), null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.c5
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FlowType.INSTANCE.serializer();
            }
        }), null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.d5
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29277S0.m69824c();
            }
        }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.e5
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29277S0.m69825d();
            }
        }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.f5
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29277S0.m69826e();
            }
        }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.g5
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29277S0.m69827f();
            }
        }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.h5
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29277S0.m69828g();
            }
        }), null, null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.i5
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29277S0.m69829h();
            }
        }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.j5
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29277S0.m69830i();
            }
        }), null};
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m69822a() {
        return new C41790a1(C41897w2.f92051a, new C44947b(Reflection.getOrCreateKotlinClass(Object.class), null, new InterfaceC44951d[0]));
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ InterfaceC44951d m69824c() {
        return new C41790a1(new C44947b(Reflection.getOrCreateKotlinClass(Object.class), null, new InterfaceC44951d[0]), new C44947b(Reflection.getOrCreateKotlinClass(Object.class), null, new InterfaceC44951d[0]));
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ InterfaceC44951d m69825d() {
        return new C41790a1(C41897w2.f92051a, new C44947b(Reflection.getOrCreateKotlinClass(Object.class), null, new InterfaceC44951d[0]));
    }

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ InterfaceC44951d m69826e() {
        return new C41790a1(C41897w2.f92051a, C29381i0.f59392a);
    }

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ InterfaceC44951d m69827f() {
        return new C41790a1(C41897w2.f92051a, new C44947b(Reflection.getOrCreateKotlinClass(Object.class), null, new InterfaceC44951d[0]));
    }

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ InterfaceC44951d m69828g() {
        C41897w2 c41897w2 = C41897w2.f92051a;
        return new C41790a1(c41897w2, c41897w2);
    }

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ InterfaceC44951d m69829h() {
        return new C41790a1(new C44947b(Reflection.getOrCreateKotlinClass(Object.class), null, new InterfaceC44951d[0]), new C44947b(Reflection.getOrCreateKotlinClass(Object.class), null, new InterfaceC44951d[0]));
    }

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ InterfaceC44951d m69830i() {
        return new C41790a1(new C44947b(Reflection.getOrCreateKotlinClass(Object.class), null, new InterfaceC44951d[0]), new C44947b(Reflection.getOrCreateKotlinClass(Object.class), null, new InterfaceC44951d[0]));
    }

    public final int hashCode() {
        Map map = this.f59269a;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        String str = this.f59270b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f59271c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        FlowType flowType = this.f59272d;
        int iHashCode4 = (iHashCode3 + (flowType == null ? 0 : flowType.hashCode())) * 31;
        String str3 = this.f59273e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f59274f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        FlowActionType flowActionType = this.f59275g;
        int iHashCode7 = (iHashCode6 + (flowActionType == null ? 0 : flowActionType.hashCode())) * 31;
        String str5 = this.f59276h;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f59277i;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Map map2 = this.f59278j;
        int iHashCode10 = (iHashCode9 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map map3 = this.f59279k;
        int iHashCode11 = (iHashCode10 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map map4 = this.f59280l;
        int iHashCode12 = (iHashCode11 + (map4 == null ? 0 : map4.hashCode())) * 31;
        Map map5 = this.f59281m;
        int iHashCode13 = (iHashCode12 + (map5 == null ? 0 : map5.hashCode())) * 31;
        Map map6 = this.f59282n;
        int iHashCode14 = (iHashCode13 + (map6 == null ? 0 : map6.hashCode())) * 31;
        C29252N c29252n = this.f59283o;
        int iHashCode15 = (iHashCode14 + (c29252n == null ? 0 : c29252n.hashCode())) * 31;
        String str7 = this.f59284p;
        int iHashCode16 = (iHashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f59285q;
        int iHashCode17 = (iHashCode16 + (str8 == null ? 0 : str8.hashCode())) * 31;
        C29261O3 c29261o3 = this.f59286r;
        int iHashCode18 = (iHashCode17 + (c29261o3 == null ? 0 : c29261o3.hashCode())) * 31;
        C29449r0 c29449r0 = this.f59287s;
        int iHashCode19 = (iHashCode18 + (c29449r0 == null ? 0 : c29449r0.hashCode())) * 31;
        C29586o0 c29586o0 = this.f59288t;
        int iHashCode20 = (iHashCode19 + (c29586o0 == null ? 0 : c29586o0.hashCode())) * 31;
        C29385i4 c29385i4 = this.f59289u;
        int iHashCode21 = (iHashCode20 + (c29385i4 == null ? 0 : c29385i4.hashCode())) * 31;
        Map map7 = this.f59290v;
        int iHashCode22 = (iHashCode21 + (map7 == null ? 0 : map7.hashCode())) * 31;
        Map map8 = this.f59291w;
        int iHashCode23 = (iHashCode22 + (map8 == null ? 0 : map8.hashCode())) * 31;
        String str9 = this.f59292x;
        return iHashCode23 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        return "RemoteConfig(uiConf=" + this.f59269a + ", applicantId=" + this.f59270b + ", flowName=" + this.f59271c + ", flowType=" + this.f59272d + ", idDocSetType=" + this.f59273e + ", actionId=" + this.f59274f + ", actionType=" + this.f59275g + ", faceLivenessLic=" + this.f59276h + ", facemapPublicKey=" + this.f59277i + ", sdkDict=" + this.f59278j + ", documentsByCountries=" + this.f59279k + ", phoneCountryCodeWithMasks=" + this.f59280l + ", tinCountryInfo=" + this.f59281m + ", initMetadata=" + this.f59282n + ", eKycConfig=" + this.f59283o + ", verificationUrl=" + this.f59284p + ", accessToken=" + this.f59285q + ", sumsubIdConfig=" + this.f59286r + ", nfcConfiguration=" + this.f59287s + ", restriction=" + this.f59288t + ", videoIdentConfig=" + this.f59289u + ", staticSdkDict=" + this.f59290v + ", staticI18n=" + this.f59291w + ", staticBaseUrl=" + this.f59292x + ")";
    }
}
