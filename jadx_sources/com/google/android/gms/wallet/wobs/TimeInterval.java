package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-wallet@@19.3.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "TimeIntervalCreator")
@SafeParcelable.Reserved({1})
public final class TimeInterval extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<TimeInterval> CREATOR = new zzl();

    @SafeParcelable.Field(m12889id = 2)
    long zza;

    @SafeParcelable.Field(m12889id = 3)
    long zzb;

    public TimeInterval() {
    }

    @SafeParcelable.Constructor
    public TimeInterval(@SafeParcelable.Param(m12890id = 2) long j11, @SafeParcelable.Param(m12890id = 3) long j12) {
        this.zza = j11;
        this.zzb = j12;
    }

    public long getEndTimestamp() {
        return this.zzb;
    }

    public long getStartTimestamp() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 2, this.zza);
        SafeParcelWriter.writeLong(parcel, 3, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
