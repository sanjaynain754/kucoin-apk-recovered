package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes45.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "FieldMapPairCreator")
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new zak();

    @SafeParcelable.VersionField(m12892id = 1)
    final int zaa;

    @SafeParcelable.Field(m12889id = 2)
    final String zab;

    @SafeParcelable.Field(m12889id = 3)
    final FastJsonResponse.Field zac;

    @SafeParcelable.Constructor
    public zam(@SafeParcelable.Param(m12890id = 1) int i11, @SafeParcelable.Param(m12890id = 2) String str, @SafeParcelable.Param(m12890id = 3) FastJsonResponse.Field field) {
        this.zaa = i11;
        this.zab = str;
        this.zac = field;
    }

    public zam(String str, FastJsonResponse.Field field) {
        this.zaa = 1;
        this.zab = str;
        this.zac = field;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int i12 = this.zaa;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i12);
        SafeParcelWriter.writeString(parcel, 2, this.zab, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zac, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
