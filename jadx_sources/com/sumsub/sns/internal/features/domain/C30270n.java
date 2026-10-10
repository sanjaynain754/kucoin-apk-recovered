package com.sumsub.sns.internal.features.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.features.data.model.common.remote.C29405l0;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30270n implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C30270n> CREATOR = new C30222k();

    /* JADX INFO: renamed from: a */
    public final Map f60854a;

    /* JADX INFO: renamed from: b */
    public final Map f60855b;

    /* JADX INFO: renamed from: c */
    public final Map f60856c;

    /* JADX INFO: renamed from: d */
    public final Map f60857d;

    /* JADX INFO: renamed from: e */
    public final String f60858e;

    /* JADX INFO: renamed from: f */
    public final C30226m f60859f;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30270n)) {
            return false;
        }
        C30270n c30270n = (C30270n) obj;
        return Intrinsics.areEqual(this.f60854a, c30270n.f60854a) && Intrinsics.areEqual(this.f60855b, c30270n.f60855b) && Intrinsics.areEqual(this.f60856c, c30270n.f60856c) && Intrinsics.areEqual(this.f60857d, c30270n.f60857d) && Intrinsics.areEqual(this.f60858e, c30270n.f60858e) && Intrinsics.areEqual(this.f60859f, c30270n.f60859f);
    }

    public final int hashCode() {
        int iHashCode = (this.f60857d.hashCode() + ((this.f60856c.hashCode() + ((this.f60855b.hashCode() + (this.f60854a.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.f60858e;
        return this.f60859f.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "CountryResultData(countries=" + this.f60854a + ", phoneMasks=" + this.f60855b + ", countriesMap=" + this.f60856c + ", includedCountries=" + this.f60857d + ", currentCountryKey=" + this.f60858e + ", userCountryData=" + this.f60859f + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        Map map = this.f60854a;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        Map map2 = this.f60855b;
        parcel.writeInt(map2.size());
        for (Map.Entry entry2 : map2.entrySet()) {
            parcel.writeString((String) entry2.getKey());
            C29405l0 c29405l0 = (C29405l0) entry2.getValue();
            parcel.writeString(c29405l0.f59409a);
            parcel.writeStringList(c29405l0.f59410b);
        }
        Map map3 = this.f60856c;
        parcel.writeInt(map3.size());
        for (Map.Entry entry3 : map3.entrySet()) {
            parcel.writeString((String) entry3.getKey());
            parcel.writeString((String) entry3.getValue());
        }
        Map map4 = this.f60857d;
        parcel.writeInt(map4.size());
        for (Map.Entry entry4 : map4.entrySet()) {
            parcel.writeString((String) entry4.getKey());
            parcel.writeString((String) entry4.getValue());
        }
        parcel.writeString(this.f60858e);
        C30226m c30226m = this.f60859f;
        parcel.writeString(c30226m.f60756a);
        parcel.writeString(c30226m.f60757b);
        parcel.writeString(c30226m.f60758c);
    }

    public C30270n(Map map, Map map2, Map map3, Map map4, String str, C30226m c30226m) {
        this.f60854a = map;
        this.f60855b = map2;
        this.f60856c = map3;
        this.f60857d = map4;
        this.f60858e = str;
        this.f60859f = c30226m;
    }
}
