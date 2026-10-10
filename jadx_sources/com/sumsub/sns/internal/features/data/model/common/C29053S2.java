package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.S2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29053S2 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C29053S2> CREATOR = new C29049R2();

    /* JADX INFO: renamed from: a */
    public final Boolean f58990a;

    /* JADX INFO: renamed from: b */
    public final Boolean f58991b;

    /* JADX INFO: renamed from: c */
    public final Double f58992c;

    /* JADX INFO: renamed from: d */
    public final List f58993d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29053S2)) {
            return false;
        }
        C29053S2 c29053s2 = (C29053S2) obj;
        return Intrinsics.areEqual(this.f58990a, c29053s2.f58990a) && Intrinsics.areEqual(this.f58991b, c29053s2.f58991b) && Intrinsics.areEqual((Object) this.f58992c, (Object) c29053s2.f58992c) && Intrinsics.areEqual(this.f58993d, c29053s2.f58993d);
    }

    public final int hashCode() {
        Boolean bool = this.f58990a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f58991b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Double d11 = this.f58992c;
        int iHashCode3 = (iHashCode2 + (d11 == null ? 0 : d11.hashCode())) * 31;
        List list = this.f58993d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "PoiAsPoaSettings(acceptPoiAsPoa=" + this.f58990a + ", acceptSamePoiAsPoa=" + this.f58991b + ", validMonths=" + this.f58992c + ", allowedTypes=" + this.f58993d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        Boolean bool = this.f58990a;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.f58991b;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Double d11 = this.f58992c;
        if (d11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d11.doubleValue());
        }
        List list = this.f58993d;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            parcel.writeString(((C29070X) it.next()).f59014a);
        }
    }

    public C29053S2(Boolean bool, Boolean bool2, Double d11, ArrayList arrayList) {
        this.f58990a = bool;
        this.f58991b = bool2;
        this.f58992c = d11;
        this.f58993d = arrayList;
    }
}
