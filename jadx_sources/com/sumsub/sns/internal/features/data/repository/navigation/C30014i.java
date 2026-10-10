package com.sumsub.sns.internal.features.data.repository.navigation;

import com.sumsub.sns.internal.features.data.model.common.remote.C29252N;
import java.util.Map;
import kotlinx.serialization.internal.C41790a1;
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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.navigation.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C30014i {

    @NotNull
    public static final C30013h Companion = new C30013h();

    /* JADX INFO: renamed from: e */
    public static final Lazy[] f60294e;

    /* JADX INFO: renamed from: a */
    public final Map f60295a;

    /* JADX INFO: renamed from: b */
    public final Map f60296b;

    /* JADX INFO: renamed from: c */
    public final C29252N f60297c;

    /* JADX INFO: renamed from: d */
    public final Boolean f60298d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30014i)) {
            return false;
        }
        C30014i c30014i = (C30014i) obj;
        return Intrinsics.areEqual(this.f60295a, c30014i.f60295a) && Intrinsics.areEqual(this.f60296b, c30014i.f60296b) && Intrinsics.areEqual(this.f60297c, c30014i.f60297c) && Intrinsics.areEqual(this.f60298d, c30014i.f60298d);
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f60294e = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.repository.navigation.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30014i.m70066a();
            }
        }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.repository.navigation.b0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30014i.m70067b();
            }
        }), null, null};
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m70066a() {
        return new C41790a1(C41897w2.f92051a, new C44947b(Reflection.getOrCreateKotlinClass(Object.class), null, new InterfaceC44951d[0]));
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ InterfaceC44951d m70067b() {
        return new C41790a1(C41897w2.f92051a, new C44947b(Reflection.getOrCreateKotlinClass(Object.class), null, new InterfaceC44951d[0]));
    }

    public final int hashCode() {
        Map map = this.f60295a;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map map2 = this.f60296b;
        int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        C29252N c29252n = this.f60297c;
        int iHashCode3 = (iHashCode2 + (c29252n == null ? 0 : c29252n.hashCode())) * 31;
        Boolean bool = this.f60298d;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "SdkParamsDto(documentsByCountries=" + this.f60295a + ", tinCountryInfo=" + this.f60296b + ", eKycConfig=" + this.f60297c + ", passiveLiveness=" + this.f60298d + ")";
    }

    public /* synthetic */ C30014i(int i11, Map map, Map map2, C29252N c29252n, Boolean bool) {
        if ((i11 & 1) == 0) {
            this.f60295a = null;
        } else {
            this.f60295a = map;
        }
        if ((i11 & 2) == 0) {
            this.f60296b = null;
        } else {
            this.f60296b = map2;
        }
        if ((i11 & 4) == 0) {
            this.f60297c = null;
        } else {
            this.f60297c = c29252n;
        }
        if ((i11 & 8) == 0) {
            this.f60298d = null;
        } else {
            this.f60298d = bool;
        }
    }
}
