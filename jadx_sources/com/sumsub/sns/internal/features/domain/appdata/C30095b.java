package com.sumsub.sns.internal.features.domain.appdata;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import java.util.Map;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.appdata.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30095b {

    /* JADX INFO: renamed from: a */
    public final AbstractC29172p f60490a;

    /* JADX INFO: renamed from: b */
    public final C29124h f60491b;

    /* JADX INFO: renamed from: c */
    public final Map f60492c;

    /* JADX INFO: renamed from: d */
    public final Map f60493d;

    /* JADX INFO: renamed from: e */
    public final Map f60494e;

    /* JADX INFO: renamed from: f */
    public final Map f60495f;

    public C30095b(AbstractC29172p abstractC29172p, C29124h c29124h, Map map, Map map2, Map map3, Map map4) {
        this.f60490a = abstractC29172p;
        this.f60491b = c29124h;
        this.f60492c = map;
        this.f60493d = map2;
        this.f60494e = map3;
        this.f60495f = map4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30095b)) {
            return false;
        }
        C30095b c30095b = (C30095b) obj;
        return Intrinsics.areEqual(this.f60490a, c30095b.f60490a) && Intrinsics.areEqual(this.f60491b, c30095b.f60491b) && Intrinsics.areEqual(this.f60492c, c30095b.f60492c) && Intrinsics.areEqual(this.f60493d, c30095b.f60493d) && Intrinsics.areEqual(this.f60494e, c30095b.f60494e) && Intrinsics.areEqual(this.f60495f, c30095b.f60495f);
    }

    public final int hashCode() {
        AbstractC29172p abstractC29172p = this.f60490a;
        int iHashCode = (abstractC29172p == null ? 0 : abstractC29172p.hashCode()) * 31;
        C29124h c29124h = this.f60491b;
        return this.f60495f.hashCode() + ((this.f60494e.hashCode() + ((this.f60493d.hashCode() + ((this.f60492c.hashCode() + ((iHashCode + (c29124h != null ? c29124h.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ApplicantDataResources(applicant=" + this.f60490a + ", appConfig=" + this.f60491b + ", genders=" + this.f60492c + ", countries=" + this.f60493d + ", allCountries=" + this.f60494e + ", countryStates=" + this.f60495f + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C30095b(AbstractC29172p abstractC29172p, C29124h c29124h, Map map, Map map2, int i11) {
        AbstractC29172p abstractC29172p2 = (i11 & 1) != 0 ? null : abstractC29172p;
        C29124h c29124h2 = (i11 & 2) != 0 ? null : c29124h;
        Map mapEmptyMap = (i11 & 4) != 0 ? MapsKt.emptyMap() : map;
        Map mapEmptyMap2 = (i11 & 8) != 0 ? MapsKt.emptyMap() : map2;
        this(abstractC29172p2, c29124h2, mapEmptyMap, mapEmptyMap2, mapEmptyMap2, MapsKt.emptyMap());
    }
}
