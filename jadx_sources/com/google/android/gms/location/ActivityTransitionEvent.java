package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.tencent.bugly.proguard.C33627eb;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "ActivityTransitionEventCreator")
@SafeParcelable.Reserved({1000})
public class ActivityTransitionEvent extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<ActivityTransitionEvent> CREATOR = new zzm();

    @SafeParcelable.Field(getter = "getActivityType", m12889id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getTransitionType", m12889id = 2)
    private final int zzb;

    @SafeParcelable.Field(getter = "getElapsedRealTimeNanos", m12889id = 3)
    private final long zzc;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransitionEvent)) {
            return false;
        }
        ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
        return this.zza == activityTransitionEvent.zza && this.zzb == activityTransitionEvent.zzb && this.zzc == activityTransitionEvent.zzc;
    }

    public int getActivityType() {
        return this.zza;
    }

    public long getElapsedRealTimeNanos() {
        return this.zzc;
    }

    public int getTransitionType() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Long.valueOf(this.zzc));
    }

    @RecentlyNonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i11 = this.zza;
        StringBuilder sb3 = new StringBuilder(24);
        sb3.append("ActivityType ");
        sb3.append(i11);
        sb2.append(sb3.toString());
        sb2.append(C33627eb.f69716f);
        int i12 = this.zzb;
        StringBuilder sb4 = new StringBuilder(26);
        sb4.append("TransitionType ");
        sb4.append(i12);
        sb2.append(sb4.toString());
        sb2.append(C33627eb.f69716f);
        long j11 = this.zzc;
        StringBuilder sb5 = new StringBuilder(41);
        sb5.append("ElapsedRealTimeNanos ");
        sb5.append(j11);
        sb2.append(sb5.toString());
        return sb2.toString();
    }

    @SafeParcelable.Constructor
    public ActivityTransitionEvent(@SafeParcelable.Param(m12890id = 1) int i11, @SafeParcelable.Param(m12890id = 2) int i12, @SafeParcelable.Param(m12890id = 3) long j11) {
        ActivityTransition.zza(i12);
        this.zza = i11;
        this.zzb = i12;
        this.zzc = j11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i11) {
        Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getActivityType());
        SafeParcelWriter.writeInt(parcel, 2, getTransitionType());
        SafeParcelWriter.writeLong(parcel, 3, getElapsedRealTimeNanos());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
