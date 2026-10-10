package com.sumsub.sns.internal.features.data.model.common.remote.response;

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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.s1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29603s1 {

    @NotNull
    public static final C29495N0 Companion = new C29495N0();

    /* JADX INFO: renamed from: g */
    public static final Lazy[] f59657g;

    /* JADX INFO: renamed from: a */
    public final List f59658a;

    /* JADX INFO: renamed from: b */
    public final Boolean f59659b;

    /* JADX INFO: renamed from: c */
    public final List f59660c;

    /* JADX INFO: renamed from: d */
    public final List f59661d;

    /* JADX INFO: renamed from: e */
    public final List f59662e;

    /* JADX INFO: renamed from: f */
    public final List f59663f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29603s1)) {
            return false;
        }
        C29603s1 c29603s1 = (C29603s1) obj;
        return Intrinsics.areEqual(this.f59658a, c29603s1.f59658a) && Intrinsics.areEqual(this.f59659b, c29603s1.f59659b) && Intrinsics.areEqual(this.f59660c, c29603s1.f59660c) && Intrinsics.areEqual(this.f59661d, c29603s1.f59661d) && Intrinsics.areEqual(this.f59662e, c29603s1.f59662e) && Intrinsics.areEqual(this.f59663f, c29603s1.f59663f);
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f59657g = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.response.d3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29603s1.m69894a();
            }
        }), null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.response.e3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29603s1.m69895b();
            }
        }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.response.f3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29603s1.m69896c();
            }
        }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.response.g3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29603s1.m69897d();
            }
        }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.response.h3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29603s1.m69898e();
            }
        })};
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m69894a() {
        return new C41813f(C29497O0.f59521a);
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ InterfaceC44951d m69895b() {
        return new C41813f(C41897w2.f92051a);
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ InterfaceC44951d m69896c() {
        return new C41813f(C41897w2.f92051a);
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ InterfaceC44951d m69897d() {
        return new C41813f(C41897w2.f92051a);
    }

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ InterfaceC44951d m69898e() {
        return new C41813f(C41897w2.f92051a);
    }

    public final int hashCode() {
        List list = this.f59658a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.f59659b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List list2 = this.f59660c;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f59661d;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.f59662e;
        int iHashCode5 = (iHashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.f59663f;
        return iHashCode5 + (list5 != null ? list5.hashCode() : 0);
    }

    public final String toString() {
        return "RequiredIdDocs(docSets=" + this.f59658a + ", videoIdent=" + this.f59659b + ", videoIdentUploadTypes=" + this.f59660c + ", stepsOutsideVideoId=" + this.f59661d + ", includedCountries=" + this.f59662e + ", excludedCountries=" + this.f59663f + ")";
    }

    public /* synthetic */ C29603s1(int i11, List list, Boolean bool, List list2, List list3, List list4, List list5) {
        if ((i11 & 1) == 0) {
            this.f59658a = null;
        } else {
            this.f59658a = list;
        }
        if ((i11 & 2) == 0) {
            this.f59659b = Boolean.FALSE;
        } else {
            this.f59659b = bool;
        }
        if ((i11 & 4) == 0) {
            this.f59660c = null;
        } else {
            this.f59660c = list2;
        }
        if ((i11 & 8) == 0) {
            this.f59661d = null;
        } else {
            this.f59661d = list3;
        }
        if ((i11 & 16) == 0) {
            this.f59662e = null;
        } else {
            this.f59662e = list4;
        }
        if ((i11 & 32) == 0) {
            this.f59663f = null;
        } else {
            this.f59663f = list5;
        }
    }
}
