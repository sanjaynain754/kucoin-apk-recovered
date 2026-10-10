package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fido.zzgx;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "CableAuthenticationDataCreator")
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();

    @SafeParcelable.Field(getter = "getVersion", m12889id = 1)
    private final long zza;

    @NonNull
    @SafeParcelable.Field(getter = "getClientEid", m12889id = 2, type = "byte[]")
    private final zzgx zzb;

    @NonNull
    @SafeParcelable.Field(getter = "getAuthenticatorEid", m12889id = 3, type = "byte[]")
    private final zzgx zzc;

    @NonNull
    @SafeParcelable.Field(getter = "getSessionPreKey", m12889id = 4, type = "byte[]")
    private final zzgx zzd;

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof zzq)) {
            return false;
        }
        zzq zzqVar = (zzq) obj;
        return this.zza == zzqVar.zza && Objects.equal(this.zzb, zzqVar.zzb) && Objects.equal(this.zzc, zzqVar.zzc) && Objects.equal(this.zzd, zzqVar.zzd);
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zza), this.zzb, this.zzc, this.zzd);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        long j11 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, j11);
        SafeParcelWriter.writeByteArray(parcel, 2, this.zzb.zzm(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.zzc.zzm(), false);
        SafeParcelWriter.writeByteArray(parcel, 4, this.zzd.zzm(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzq(@SafeParcelable.Param(m12890id = 1) long j11, @NonNull @SafeParcelable.Param(m12890id = 2) byte[] bArr, @NonNull @SafeParcelable.Param(m12890id = 3) byte[] bArr2, @NonNull @SafeParcelable.Param(m12890id = 4) byte[] bArr3) {
        byte[] bArr4 = (byte[]) Preconditions.checkNotNull(bArr);
        zzgx zzgxVar = zzgx.zzb;
        zzgx zzgxVarZzl = zzgx.zzl(bArr4, 0, bArr4.length);
        byte[] bArr5 = (byte[]) Preconditions.checkNotNull(bArr2);
        zzgx zzgxVarZzl2 = zzgx.zzl(bArr5, 0, bArr5.length);
        byte[] bArr6 = (byte[]) Preconditions.checkNotNull(bArr3);
        zzgx zzgxVarZzl3 = zzgx.zzl(bArr6, 0, bArr6.length);
        this.zza = j11;
        this.zzb = (zzgx) Preconditions.checkNotNull(zzgxVarZzl);
        this.zzc = (zzgx) Preconditions.checkNotNull(zzgxVarZzl2);
        this.zzd = (zzgx) Preconditions.checkNotNull(zzgxVarZzl3);
    }
}
