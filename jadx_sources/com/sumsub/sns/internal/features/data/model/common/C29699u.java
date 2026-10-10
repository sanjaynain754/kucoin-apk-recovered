package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import kotlinx.serialization.internal.C41801c2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.u */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29699u extends AbstractC28990D implements Parcelable {

    /* JADX INFO: renamed from: b */
    public final String f59761b;

    /* JADX INFO: renamed from: c */
    public final String f59762c;

    /* JADX INFO: renamed from: d */
    public final Boolean f59763d;

    @NotNull
    public static final C29689s Companion = new C29689s();

    @NotNull
    public static final Parcelable.Creator<C29699u> CREATOR = new C29694t();

    public /* synthetic */ C29699u(int i11, String str, String str2, Boolean bool) {
        if (7 != (i11 & 7)) {
            C41801c2.m91514a(i11, 7, C29182r.f59180a.getDescriptor());
        }
        this.f59761b = str;
        this.f59762c = str2;
        this.f59763d = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29699u)) {
            return false;
        }
        C29699u c29699u = (C29699u) obj;
        return Intrinsics.areEqual(this.f59761b, c29699u.f59761b) && Intrinsics.areEqual(this.f59762c, c29699u.f59762c) && Intrinsics.areEqual(this.f59763d, c29699u.f59763d);
    }

    public C29699u(String str, String str2, Boolean bool) {
        super(0);
        this.f59761b = str;
        this.f59762c = str2;
        this.f59763d = bool;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC28990D
    /* JADX INFO: renamed from: c */
    public final String mo69727c() {
        String str = this.f59761b;
        return str == null ? "" : str;
    }

    public final int hashCode() {
        String str = this.f59761b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59762c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f59763d;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "CustomField(name=" + this.f59761b + ", displayName=" + this.f59762c + ", isRequired=" + this.f59763d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f59761b);
        parcel.writeString(this.f59762c);
        Boolean bool = this.f59763d;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }
}
