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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29573l {

    @NotNull
    public static final C29569k Companion = new C29569k();

    /* JADX INFO: renamed from: d */
    public static final Lazy[] f59596d = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.response.v2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C29573l.m69886a();
        }
    })};

    /* JADX INFO: renamed from: a */
    public final String f59597a;

    /* JADX INFO: renamed from: b */
    public final Double f59598b;

    /* JADX INFO: renamed from: c */
    public final List f59599c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29573l)) {
            return false;
        }
        C29573l c29573l = (C29573l) obj;
        return Intrinsics.areEqual(this.f59597a, c29573l.f59597a) && Intrinsics.areEqual((Object) this.f59598b, (Object) c29573l.f59598b) && Intrinsics.areEqual(this.f59599c, c29573l.f59599c);
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m69886a() {
        return new C41813f(C41897w2.f92051a);
    }

    public final int hashCode() {
        String str = this.f59597a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d11 = this.f59598b;
        int iHashCode2 = (iHashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
        List list = this.f59599c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "AllowedTypesSettingsRemote(type=" + this.f59597a + ", validMonths=" + this.f59598b + ", allowedSubTypes=" + this.f59599c + ")";
    }

    public /* synthetic */ C29573l(int i11, String str, Double d11, List list) {
        if ((i11 & 1) == 0) {
            this.f59597a = null;
        } else {
            this.f59597a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59598b = null;
        } else {
            this.f59598b = d11;
        }
        if ((i11 & 4) == 0) {
            this.f59599c = null;
        } else {
            this.f59599c = list;
        }
    }
}
