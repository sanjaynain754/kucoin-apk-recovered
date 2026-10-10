package com.sumsub.sns.internal.features.data.model.common.remote.response;

import java.util.Map;
import kotlinx.serialization.internal.C41790a1;
import kotlinx.serialization.internal.C41897w2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.Y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29515Y {

    @NotNull
    public static final C29513X Companion = new C29513X();

    /* JADX INFO: renamed from: c */
    public static final Lazy[] f59534c = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.response.q2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C29515Y.m69880a();
        }
    })};

    /* JADX INFO: renamed from: a */
    public final C29509V f59535a;

    /* JADX INFO: renamed from: b */
    public final Map f59536b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29515Y)) {
            return false;
        }
        C29515Y c29515y = (C29515Y) obj;
        return Intrinsics.areEqual(this.f59535a, c29515y.f59535a) && Intrinsics.areEqual(this.f59536b, c29515y.f59536b);
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m69880a() {
        return new C41790a1(C41897w2.f92051a, C29505T.f59525a);
    }

    public final int hashCode() {
        C29509V c29509v = this.f59535a;
        int iHashCode = (c29509v == null ? 0 : c29509v.hashCode()) * 31;
        Map map = this.f59536b;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "PoaStepSettingsResponse(settings=" + this.f59535a + ", changedSettingsByCountry=" + this.f59536b + ")";
    }

    public /* synthetic */ C29515Y(int i11, C29509V c29509v, Map map) {
        if ((i11 & 1) == 0) {
            this.f59535a = null;
        } else {
            this.f59535a = c29509v;
        }
        if ((i11 & 2) == 0) {
            this.f59536b = null;
        } else {
            this.f59536b = map;
        }
    }
}
