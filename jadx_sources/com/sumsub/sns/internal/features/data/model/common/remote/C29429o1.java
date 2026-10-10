package com.sumsub.sns.internal.features.data.model.common.remote;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.o1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29429o1 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final String f59429a;

    /* JADX INFO: renamed from: b */
    public final String f59430b;

    /* JADX INFO: renamed from: c */
    public final String f59431c;

    @NotNull
    public static final C29414m1 Companion = new C29414m1();

    @NotNull
    public static final Parcelable.Creator<C29429o1> CREATOR = new C29422n1();

    public /* synthetic */ C29429o1(int i11, String str, String str2, String str3) {
        if ((i11 & 1) == 0) {
            this.f59429a = null;
        } else {
            this.f59429a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59430b = null;
        } else {
            this.f59430b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f59431c = null;
        } else {
            this.f59431c = str3;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29429o1)) {
            return false;
        }
        C29429o1 c29429o1 = (C29429o1) obj;
        return Intrinsics.areEqual(this.f59429a, c29429o1.f59429a) && Intrinsics.areEqual(this.f59430b, c29429o1.f59430b) && Intrinsics.areEqual(this.f59431c, c29429o1.f59431c);
    }

    public C29429o1(String str, String str2, String str3) {
        this.f59429a = str;
        this.f59430b = str2;
        this.f59431c = str3;
    }

    public final int hashCode() {
        String str = this.f59429a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59430b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f59431c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "RequestCode(targetType=" + this.f59429a + ", identifierType=" + this.f59430b + ", identifier=" + this.f59431c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f59429a);
        parcel.writeString(this.f59430b);
        parcel.writeString(this.f59431c);
    }
}
