package com.sumsub.sns.internal.features.data.model.sumsubid;

import java.util.Map;
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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.sumsubid.y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29884y {

    @NotNull
    public static final C29877r Companion = new C29877r();

    /* JADX INFO: renamed from: c */
    public static final Lazy[] f59983c;

    /* JADX INFO: renamed from: a */
    public final Map f59984a;

    /* JADX INFO: renamed from: b */
    public final Map f59985b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29884y)) {
            return false;
        }
        C29884y c29884y = (C29884y) obj;
        return Intrinsics.areEqual(this.f59984a, c29884y.f59984a) && Intrinsics.areEqual(this.f59985b, c29884y.f59985b);
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f59983c = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.sumsubid.g0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29884y.m69937a();
            }
        }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.sumsubid.h0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29884y.m69938b();
            }
        })};
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m69937a() {
        return new C41790a1(C41897w2.f92051a, new C44947b(Reflection.getOrCreateKotlinClass(Object.class), null, new InterfaceC44951d[0]));
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ InterfaceC44951d m69938b() {
        return new C41790a1(C41897w2.f92051a, new C41813f(C29878s.f59960a));
    }

    public final int hashCode() {
        Map map = this.f59984a;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map map2 = this.f59985b;
        return iHashCode + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        return "SNSSumsubIdDocsResponse(info=" + this.f59984a + ", docsByStep=" + this.f59985b + ")";
    }

    public /* synthetic */ C29884y(int i11, Map map, Map map2) {
        if ((i11 & 1) == 0) {
            this.f59984a = null;
        } else {
            this.f59984a = map;
        }
        if ((i11 & 2) == 0) {
            this.f59985b = null;
        } else {
            this.f59985b = map2;
        }
    }
}
