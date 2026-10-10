package com.sumsub.sns.internal.features.data.model.sumsubid;

import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.C41790a1;
import kotlinx.serialization.internal.C41813f;
import kotlinx.serialization.internal.C41891v0;
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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.sumsubid.u */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29880u {

    @NotNull
    public static final C29879t Companion = new C29879t();

    /* JADX INFO: renamed from: f */
    public static final Lazy[] f59961f;

    /* JADX INFO: renamed from: a */
    public final String f59962a;

    /* JADX INFO: renamed from: b */
    public final List f59963b;

    /* JADX INFO: renamed from: c */
    public final Map f59964c;

    /* JADX INFO: renamed from: d */
    public final C29883x f59965d;

    /* JADX INFO: renamed from: e */
    public final List f59966e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29880u)) {
            return false;
        }
        C29880u c29880u = (C29880u) obj;
        return Intrinsics.areEqual(this.f59962a, c29880u.f59962a) && Intrinsics.areEqual(this.f59963b, c29880u.f59963b) && Intrinsics.areEqual(this.f59964c, c29880u.f59964c) && Intrinsics.areEqual(this.f59965d, c29880u.f59965d) && Intrinsics.areEqual(this.f59966e, c29880u.f59966e);
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f59961f = new Lazy[]{null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.sumsubid.c0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29880u.m69933a();
            }
        }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.sumsubid.d0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29880u.m69934b();
            }
        }), null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.sumsubid.e0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29880u.m69935c();
            }
        })};
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m69933a() {
        return new C41813f(C41891v0.f92041a);
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ InterfaceC44951d m69934b() {
        return new C41790a1(C41897w2.f92051a, new C44947b(Reflection.getOrCreateKotlinClass(Object.class), null, new InterfaceC44951d[0]));
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ InterfaceC44951d m69935c() {
        return new C41813f(C41897w2.f92051a);
    }

    public final int hashCode() {
        String str = this.f59962a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f59963b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Map map = this.f59964c;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        C29883x c29883x = this.f59965d;
        int iHashCode4 = (iHashCode3 + (c29883x == null ? 0 : c29883x.hashCode())) * 31;
        List list2 = this.f59966e;
        return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "SNSSumsubIdDocByStep(docId=" + this.f59962a + ", imageIds=" + this.f59963b + ", info=" + this.f59964c + ", idDoc=" + this.f59965d + ", detectedLanguages=" + this.f59966e + ")";
    }

    public /* synthetic */ C29880u(int i11, String str, List list, Map map, C29883x c29883x, List list2) {
        if ((i11 & 1) == 0) {
            this.f59962a = null;
        } else {
            this.f59962a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59963b = null;
        } else {
            this.f59963b = list;
        }
        if ((i11 & 4) == 0) {
            this.f59964c = null;
        } else {
            this.f59964c = map;
        }
        if ((i11 & 8) == 0) {
            this.f59965d = null;
        } else {
            this.f59965d = c29883x;
        }
        if ((i11 & 16) == 0) {
            this.f59966e = null;
        } else {
            this.f59966e = list2;
        }
    }
}
