package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zav;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "SignInResponseCreator")
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new zal();

    @SafeParcelable.VersionField(m12892id = 1)
    final int zaa;

    @SafeParcelable.Field(getter = "getConnectionResult", m12889id = 2)
    private final ConnectionResult zab;

    @Nullable
    @SafeParcelable.Field(getter = "getResolveAccountResponse", m12889id = 3)
    private final zav zac;

    public final ConnectionResult zaa() {
        return this.zab;
    }

    @Nullable
    public final zav zab() {
        return this.zac;
    }

    @SafeParcelable.Constructor
    public zak(@SafeParcelable.Param(m12890id = 1) int i11, @SafeParcelable.Param(m12890id = 2) ConnectionResult connectionResult, @Nullable @SafeParcelable.Param(m12890id = 3) zav zavVar) {
        this.zaa = i11;
        this.zab = connectionResult;
        this.zac = zavVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zab, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zac, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
