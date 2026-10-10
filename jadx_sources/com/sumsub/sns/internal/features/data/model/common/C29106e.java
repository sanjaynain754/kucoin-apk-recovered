package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29106e implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C29106e> CREATOR = new C29100d();

    /* JADX INFO: renamed from: a */
    public final String f59052a;

    /* JADX INFO: renamed from: b */
    public final Double f59053b;

    /* JADX INFO: renamed from: c */
    public final List f59054c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29106e)) {
            return false;
        }
        C29106e c29106e = (C29106e) obj;
        return Intrinsics.areEqual(this.f59052a, c29106e.f59052a) && Intrinsics.areEqual((Object) this.f59053b, (Object) c29106e.f59053b) && Intrinsics.areEqual(this.f59054c, c29106e.f59054c);
    }

    public final int hashCode() {
        String str = this.f59052a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d11 = this.f59053b;
        int iHashCode2 = (iHashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
        List list = this.f59054c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "AllowedTypesSettings(type=" + this.f59052a + ", validMonths=" + this.f59053b + ", allowedSubTypes=" + this.f59054c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f59052a);
        Double d11 = this.f59053b;
        if (d11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d11.doubleValue());
        }
        parcel.writeStringList(this.f59054c);
    }

    public C29106e(String str, Double d11, List list) {
        this.f59052a = str;
        this.f59053b = d11;
        this.f59054c = list;
    }
}
