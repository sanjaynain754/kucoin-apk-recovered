package com.sumsub.sns.internal.features.data.model.geo;

import java.util.List;
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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.geo.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29794d {

    @NotNull
    public static final C29793c Companion = new C29793c();

    /* JADX INFO: renamed from: d */
    public static final Lazy[] f59863d;

    /* JADX INFO: renamed from: a */
    public final List f59864a;

    /* JADX INFO: renamed from: b */
    public final Map f59865b;

    /* JADX INFO: renamed from: c */
    public final Long f59866c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29794d)) {
            return false;
        }
        C29794d c29794d = (C29794d) obj;
        return Intrinsics.areEqual(this.f59864a, c29794d.f59864a) && Intrinsics.areEqual(this.f59865b, c29794d.f59865b) && Intrinsics.areEqual(this.f59866c, c29794d.f59866c);
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f59863d = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.geo.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29794d.m69926a();
            }
        }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.geo.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29794d.m69927b();
            }
        }), null};
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m69926a() {
        return new C41813f(C41897w2.f92051a);
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ InterfaceC44951d m69927b() {
        return new C41790a1(C41897w2.f92051a, new C44947b(Reflection.getOrCreateKotlinClass(Object.class), null, new InterfaceC44951d[0]));
    }

    public final int hashCode() {
        List list = this.f59864a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Map map = this.f59865b;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Long l11 = this.f59866c;
        return iHashCode2 + (l11 != null ? l11.hashCode() : 0);
    }

    public final String toString() {
        return "GpsLocationCheckResponse(violations=" + this.f59864a + ", address=" + this.f59865b + ", timeToResendInSec=" + this.f59866c + ")";
    }

    public /* synthetic */ C29794d(int i11, List list, Map map, Long l11) {
        if ((i11 & 1) == 0) {
            this.f59864a = null;
        } else {
            this.f59864a = list;
        }
        if ((i11 & 2) == 0) {
            this.f59865b = null;
        } else {
            this.f59865b = map;
        }
        if ((i11 & 4) == 0) {
            this.f59866c = null;
        } else {
            this.f59866c = l11;
        }
    }
}
