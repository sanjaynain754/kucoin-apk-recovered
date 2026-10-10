package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "SendDataRequestCreator")
public final class zzaz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaz> CREATOR = new zzba();

    @SafeParcelable.VersionField(m12892id = 1)
    final int zza;

    @SafeParcelable.Field(m12889id = 2)
    public final String zzb;

    @SafeParcelable.Field(m12889id = 3)
    public final byte[] zzc;

    @SafeParcelable.Constructor
    public zzaz(@SafeParcelable.Param(m12890id = 1) int i11, @SafeParcelable.Param(m12890id = 2) String str, @SafeParcelable.Param(m12890id = 3) byte[] bArr) {
        this.zza = 1;
        this.zzb = (String) Preconditions.checkNotNull(str);
        this.zzc = (byte[]) Preconditions.checkNotNull(bArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzaz(String str, byte[] bArr) {
        this(1, str, bArr);
    }
}
