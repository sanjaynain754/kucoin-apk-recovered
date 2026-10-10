package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.M */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29027M implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C29027M> CREATOR = new C29023L();

    /* JADX INFO: renamed from: a */
    public final C29164n3 f58967a;

    /* JADX INFO: renamed from: b */
    public final String f58968b;

    /* JADX INFO: renamed from: c */
    public final String f58969c;

    /* JADX INFO: renamed from: d */
    public final List f58970d;

    /* JADX INFO: renamed from: e */
    public final Map f58971e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29027M)) {
            return false;
        }
        C29027M c29027m = (C29027M) obj;
        return Intrinsics.areEqual(this.f58967a, c29027m.f58967a) && Intrinsics.areEqual(this.f58968b, c29027m.f58968b) && Intrinsics.areEqual(this.f58969c, c29027m.f58969c) && Intrinsics.areEqual(this.f58970d, c29027m.f58970d) && Intrinsics.areEqual(this.f58971e, c29027m.f58971e);
    }

    public final int hashCode() {
        C29164n3 c29164n3 = this.f58967a;
        int iHashCode = (c29164n3 == null ? 0 : c29164n3.hashCode()) * 31;
        String str = this.f58968b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f58969c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f58970d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Map map = this.f58971e;
        return iHashCode4 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "Result(review=" + this.f58967a + ", country=" + this.f58968b + ", identity=" + this.f58969c + ", imageIds=" + this.f58970d + ", imageResult=" + this.f58971e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        C29164n3 c29164n3 = this.f58967a;
        if (c29164n3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            c29164n3.writeToParcel(parcel, i11);
        }
        parcel.writeString(this.f58968b);
        parcel.writeString(this.f58969c);
        List list = this.f58970d;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                parcel.writeInt(((Number) it.next()).intValue());
            }
        }
        Map map = this.f58971e;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeInt(((Number) entry.getKey()).intValue());
            ((C29164n3) entry.getValue()).writeToParcel(parcel, i11);
        }
    }

    public C29027M(C29164n3 c29164n3, String str, String str2, List list, Map map) {
        this.f58967a = c29164n3;
        this.f58968b = str;
        this.f58969c = str2;
        this.f58970d = list;
        this.f58971e = map;
    }
}
