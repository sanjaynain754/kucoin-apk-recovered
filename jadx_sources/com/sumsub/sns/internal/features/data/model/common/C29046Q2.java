package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.Q2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29046Q2 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C29046Q2> CREATOR = new C29042P2();

    /* JADX INFO: renamed from: a */
    public final C29053S2 f58982a;

    /* JADX INFO: renamed from: b */
    public final List f58983b;

    /* JADX INFO: renamed from: c */
    public final Boolean f58984c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29046Q2)) {
            return false;
        }
        C29046Q2 c29046q2 = (C29046Q2) obj;
        return Intrinsics.areEqual(this.f58982a, c29046q2.f58982a) && Intrinsics.areEqual(this.f58983b, c29046q2.f58983b) && Intrinsics.areEqual(this.f58984c, c29046q2.f58984c);
    }

    public final int hashCode() {
        C29053S2 c29053s2 = this.f58982a;
        int iHashCode = (c29053s2 == null ? 0 : c29053s2.hashCode()) * 31;
        List list = this.f58983b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.f58984c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "PoaStepSettings(poiAsPoaSettings=" + this.f58982a + ", allowedTypesSettings=" + this.f58983b + ", acceptMultiplePages=" + this.f58984c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        C29053S2 c29053s2 = this.f58982a;
        if (c29053s2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            c29053s2.writeToParcel(parcel, i11);
        }
        List list = this.f58983b;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C29106e) it.next()).writeToParcel(parcel, i11);
            }
        }
        Boolean bool = this.f58984c;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public C29046Q2(C29053S2 c29053s2, ArrayList arrayList, Boolean bool) {
        this.f58982a = c29053s2;
        this.f58983b = arrayList;
        this.f58984c = bool;
    }
}
