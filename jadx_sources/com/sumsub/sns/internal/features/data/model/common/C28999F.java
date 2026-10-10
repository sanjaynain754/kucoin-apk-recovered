package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.features.data.model.common.remote.response.ConfirmationType;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.F */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28999F implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C28999F> CREATOR = new C28995E();

    /* JADX INFO: renamed from: a */
    public final String f58940a;

    /* JADX INFO: renamed from: b */
    public final String f58941b;

    /* JADX INFO: renamed from: c */
    public final ConfirmationType f58942c;

    /* JADX INFO: renamed from: d */
    public final List f58943d;

    /* JADX INFO: renamed from: e */
    public final String f58944e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28999F)) {
            return false;
        }
        C28999F c28999f = (C28999F) obj;
        return Intrinsics.areEqual(this.f58940a, c28999f.f58940a) && Intrinsics.areEqual(this.f58941b, c28999f.f58941b) && this.f58942c == c28999f.f58942c && Intrinsics.areEqual(this.f58943d, c28999f.f58943d) && Intrinsics.areEqual(this.f58944e, c28999f.f58944e);
    }

    public final int hashCode() {
        String str = this.f58940a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f58941b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ConfirmationType confirmationType = this.f58942c;
        int iHashCode3 = (iHashCode2 + (confirmationType == null ? 0 : confirmationType.hashCode())) * 31;
        List list = this.f58943d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.f58944e;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "ApplicantDataSource(sourceId=" + this.f58940a + ", docType=" + this.f58941b + ", confirmationType=" + this.f58942c + ", fields=" + this.f58943d + ", idDocSetType=" + this.f58944e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f58940a);
        parcel.writeString(this.f58941b);
        ConfirmationType confirmationType = this.f58942c;
        if (confirmationType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(confirmationType.name());
        }
        List list = this.f58943d;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C29719y) it.next()).writeToParcel(parcel, i11);
            }
        }
        parcel.writeString(this.f58944e);
    }

    public C28999F(String str, String str2, ConfirmationType confirmationType, List list, String str3) {
        this.f58940a = str;
        this.f58941b = str2;
        this.f58942c = confirmationType;
        this.f58943d = list;
        this.f58944e = str3;
    }
}
