package com.sumsub.sns.internal.features.data.model.common.remote;

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
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.N */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29252N {

    @NotNull
    public static final C29247M Companion = new C29247M();

    /* JADX INFO: renamed from: c */
    public static final Lazy[] f59242c = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.v4
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C29252N.m69816a();
        }
    }), null};

    /* JADX INFO: renamed from: a */
    public final Map f59243a;

    /* JADX INFO: renamed from: b */
    public final Boolean f59244b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29252N)) {
            return false;
        }
        C29252N c29252n = (C29252N) obj;
        return Intrinsics.areEqual(this.f59243a, c29252n.f59243a) && Intrinsics.areEqual(this.f59244b, c29252n.f59244b);
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m69816a() {
        return new C41790a1(C41897w2.f92051a, new C41813f(C29253N0.f59245a));
    }

    public final int hashCode() {
        Map map = this.f59243a;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Boolean bool = this.f59244b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "EKycConfig(supportedSources=" + this.f59243a + ", skipFixedCountrySelect=" + this.f59244b + ")";
    }

    public /* synthetic */ C29252N(int i11, Map map, Boolean bool) {
        if ((i11 & 1) == 0) {
            this.f59243a = null;
        } else {
            this.f59243a = map;
        }
        if ((i11 & 2) == 0) {
            this.f59244b = null;
        } else {
            this.f59244b = bool;
        }
    }
}
