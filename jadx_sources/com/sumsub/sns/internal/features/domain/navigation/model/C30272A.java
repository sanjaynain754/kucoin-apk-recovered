package com.sumsub.sns.internal.features.domain.navigation.model;

import java.util.Map;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.navigation.model.A */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30272A {

    /* JADX INFO: renamed from: a */
    public final Map f60860a;

    /* JADX INFO: renamed from: b */
    public final Map f60861b;

    /* JADX INFO: renamed from: c */
    public final Boolean f60862c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30272A)) {
            return false;
        }
        C30272A c30272a = (C30272A) obj;
        return Intrinsics.areEqual(this.f60860a, c30272a.f60860a) && Intrinsics.areEqual(this.f60861b, c30272a.f60861b) && Intrinsics.areEqual(this.f60862c, c30272a.f60862c);
    }

    public final int hashCode() {
        Map map = this.f60860a;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map map2 = this.f60861b;
        int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        Boolean bool = this.f60862c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "SdkParams(documentsByCountries=" + this.f60860a + ", tinCountryInfo=" + this.f60861b + ", passiveLiveness=" + this.f60862c + ")";
    }

    public C30272A(Map map, Map map2, Boolean bool) {
        this.f60860a = map;
        this.f60861b = map2;
        this.f60862c = bool;
    }
}
