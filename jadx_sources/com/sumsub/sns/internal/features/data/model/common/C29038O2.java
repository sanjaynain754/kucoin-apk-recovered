package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.O2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29038O2 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C29038O2> CREATOR = new C29034N2();

    /* JADX INFO: renamed from: a */
    public final C29046Q2 f58978a;

    /* JADX INFO: renamed from: b */
    public final Map f58979b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29038O2)) {
            return false;
        }
        C29038O2 c29038o2 = (C29038O2) obj;
        return Intrinsics.areEqual(this.f58978a, c29038o2.f58978a) && Intrinsics.areEqual(this.f58979b, c29038o2.f58979b);
    }

    public final int hashCode() {
        C29046Q2 c29046q2 = this.f58978a;
        int iHashCode = (c29046q2 == null ? 0 : c29046q2.hashCode()) * 31;
        Map map = this.f58979b;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "PoaPreset(settings=" + this.f58978a + ", settingsByCountry=" + this.f58979b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        C29046Q2 c29046q2 = this.f58978a;
        if (c29046q2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            c29046q2.writeToParcel(parcel, i11);
        }
        Map map = this.f58979b;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            ((C29046Q2) entry.getValue()).writeToParcel(parcel, i11);
        }
    }

    public C29038O2(C29046Q2 c29046q2, LinkedHashMap linkedHashMap) {
        this.f58978a = c29046q2;
        this.f58979b = linkedHashMap;
    }
}
