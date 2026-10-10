package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zat;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "SignInRequestCreator")
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new zaj();

    @SafeParcelable.VersionField(m12892id = 1)
    final int zaa;

    @SafeParcelable.Field(getter = "getResolveAccountRequest", m12889id = 2)
    final zat zab;

    @SafeParcelable.Constructor
    public zai(@SafeParcelable.Param(m12890id = 1) int i11, @SafeParcelable.Param(m12890id = 2) zat zatVar) {
        this.zaa = i11;
        this.zab = zatVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zab, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
