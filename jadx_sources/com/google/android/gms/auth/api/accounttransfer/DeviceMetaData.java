package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "DeviceMetaDataCreator")
public class DeviceMetaData extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<DeviceMetaData> CREATOR = new zzy();

    @SafeParcelable.VersionField(m12892id = 1)
    final int zza;

    @SafeParcelable.Field(getter = "isLockScreenSolved", m12889id = 2)
    private final boolean zzb;

    @SafeParcelable.Field(getter = "getMinAgeOfLockScreen", m12889id = 3)
    private final long zzc;

    @SafeParcelable.Field(getter = "isChallengeAllowed", m12889id = 4)
    private final boolean zzd;

    public long getMinAgeOfLockScreen() {
        return this.zzc;
    }

    public boolean isChallengeAllowed() {
        return this.zzd;
    }

    public boolean isLockScreenSolved() {
        return this.zzb;
    }

    @SafeParcelable.Constructor
    public DeviceMetaData(@SafeParcelable.Param(m12890id = 1) int i11, @SafeParcelable.Param(m12890id = 2) boolean z11, @SafeParcelable.Param(m12890id = 3) long j11, @SafeParcelable.Param(m12890id = 4) boolean z12) {
        this.zza = i11;
        this.zzb = z11;
        this.zzc = j11;
        this.zzd = z12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeBoolean(parcel, 2, isLockScreenSolved());
        SafeParcelWriter.writeLong(parcel, 3, getMinAgeOfLockScreen());
        SafeParcelWriter.writeBoolean(parcel, 4, isChallengeAllowed());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
