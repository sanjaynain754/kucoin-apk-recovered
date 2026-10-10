package com.sumsub.sns.internal.features.data.model.common.remote.response;

import java.util.List;
import kotlinx.serialization.internal.C41813f;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.V */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29509V {

    @NotNull
    public static final C29507U Companion = new C29507U();

    /* JADX INFO: renamed from: d */
    public static final Lazy[] f59527d = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.response.p2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C29509V.m69879a();
        }
    }), null};

    /* JADX INFO: renamed from: a */
    public final C29530c0 f59528a;

    /* JADX INFO: renamed from: b */
    public final List f59529b;

    /* JADX INFO: renamed from: c */
    public final Boolean f59530c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29509V)) {
            return false;
        }
        C29509V c29509v = (C29509V) obj;
        return Intrinsics.areEqual(this.f59528a, c29509v.f59528a) && Intrinsics.areEqual(this.f59529b, c29509v.f59529b) && Intrinsics.areEqual(this.f59530c, c29509v.f59530c);
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m69879a() {
        return new C41813f(C29564j.f59584a);
    }

    public final int hashCode() {
        C29530c0 c29530c0 = this.f59528a;
        int iHashCode = (c29530c0 == null ? 0 : c29530c0.hashCode()) * 31;
        List list = this.f59529b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.f59530c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "PoaStepSettingsRemote(poiAsPoaSettings=" + this.f59528a + ", allowedTypesSettings=" + this.f59529b + ", acceptMultiplePages=" + this.f59530c + ")";
    }

    public /* synthetic */ C29509V(int i11, C29530c0 c29530c0, List list, Boolean bool) {
        if ((i11 & 1) == 0) {
            this.f59528a = null;
        } else {
            this.f59528a = c29530c0;
        }
        if ((i11 & 2) == 0) {
            this.f59529b = null;
        } else {
            this.f59529b = list;
        }
        if ((i11 & 4) == 0) {
            this.f59530c = null;
        } else {
            this.f59530c = bool;
        }
    }
}
