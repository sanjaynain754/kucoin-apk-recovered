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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.c0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29530c0 {

    @NotNull
    public static final C29525b0 Companion = new C29525b0();

    /* JADX INFO: renamed from: e */
    public static final Lazy[] f59543e = {null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.response.r2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C29530c0.m69882a();
        }
    })};

    /* JADX INFO: renamed from: a */
    public final Boolean f59544a;

    /* JADX INFO: renamed from: b */
    public final Boolean f59545b;

    /* JADX INFO: renamed from: c */
    public final Double f59546c;

    /* JADX INFO: renamed from: d */
    public final List f59547d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29530c0)) {
            return false;
        }
        C29530c0 c29530c0 = (C29530c0) obj;
        return Intrinsics.areEqual(this.f59544a, c29530c0.f59544a) && Intrinsics.areEqual(this.f59545b, c29530c0.f59545b) && Intrinsics.areEqual((Object) this.f59546c, (Object) c29530c0.f59546c) && Intrinsics.areEqual(this.f59547d, c29530c0.f59547d);
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m69882a() {
        return new C41813f(C41897w2.f92051a);
    }

    public final int hashCode() {
        Boolean bool = this.f59544a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f59545b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Double d11 = this.f59546c;
        int iHashCode3 = (iHashCode2 + (d11 == null ? 0 : d11.hashCode())) * 31;
        List list = this.f59547d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "PoiAsPoaSettingsRemote(acceptPoiAsPoa=" + this.f59544a + ", acceptSamePoiAsPoa=" + this.f59545b + ", validMonths=" + this.f59546c + ", allowedTypes=" + this.f59547d + ")";
    }

    public /* synthetic */ C29530c0(int i11, Boolean bool, Boolean bool2, Double d11, List list) {
        if ((i11 & 1) == 0) {
            this.f59544a = null;
        } else {
            this.f59544a = bool;
        }
        if ((i11 & 2) == 0) {
            this.f59545b = null;
        } else {
            this.f59545b = bool2;
        }
        if ((i11 & 4) == 0) {
            this.f59546c = null;
        } else {
            this.f59546c = d11;
        }
        if ((i11 & 8) == 0) {
            this.f59547d = null;
        } else {
            this.f59547d = list;
        }
    }
}
