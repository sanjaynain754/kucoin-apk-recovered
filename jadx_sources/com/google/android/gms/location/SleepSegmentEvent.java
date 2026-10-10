package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "SleepSegmentEventCreator")
@SafeParcelable.Reserved({1000})
public class SleepSegmentEvent extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<SleepSegmentEvent> CREATOR = new zzbv();
    public static final int STATUS_MISSING_DATA = 1;
    public static final int STATUS_NOT_DETECTED = 2;
    public static final int STATUS_SUCCESSFUL = 0;

    @SafeParcelable.Field(getter = "getStartTimeMillis", m12889id = 1)
    private final long zza;

    @SafeParcelable.Field(getter = "getEndTimeMillis", m12889id = 2)
    private final long zzb;

    @SafeParcelable.Field(getter = "getStatus", m12889id = 3)
    private final int zzc;

    @SafeParcelable.Field(getter = "getMissingDataDurationMinutes", m12889id = 4)
    private final int zzd;

    @SafeParcelable.Field(getter = "getNinetiethPctConfidence", m12889id = 5)
    private final int zze;

    public static boolean hasEvents(@Nullable Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_RESULT");
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof SleepSegmentEvent) {
            SleepSegmentEvent sleepSegmentEvent = (SleepSegmentEvent) obj;
            if (this.zza == sleepSegmentEvent.getStartTimeMillis() && this.zzb == sleepSegmentEvent.getEndTimeMillis() && this.zzc == sleepSegmentEvent.getStatus() && this.zzd == sleepSegmentEvent.zzd && this.zze == sleepSegmentEvent.zze) {
                return true;
            }
        }
        return false;
    }

    public long getEndTimeMillis() {
        return this.zzb;
    }

    public long getSegmentDurationMillis() {
        return this.zzb - this.zza;
    }

    public long getStartTimeMillis() {
        return this.zza;
    }

    public int getStatus() {
        return this.zzc;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zza), Long.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }

    @RecentlyNonNull
    public String toString() {
        long j11 = this.zza;
        long j12 = this.zzb;
        int i11 = this.zzc;
        StringBuilder sb2 = new StringBuilder(84);
        sb2.append("startMillis=");
        sb2.append(j11);
        sb2.append(", endMillis=");
        sb2.append(j12);
        sb2.append(", status=");
        sb2.append(i11);
        return sb2.toString();
    }

    @ShowFirstParty
    @SafeParcelable.Constructor
    public SleepSegmentEvent(@SafeParcelable.Param(m12890id = 1) long j11, @SafeParcelable.Param(m12890id = 2) long j12, @SafeParcelable.Param(m12890id = 3) int i11, @SafeParcelable.Param(m12890id = 4) int i12, @SafeParcelable.Param(m12890id = 5) int i13) {
        boolean z11;
        if (j11 <= j12) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkArgument(z11, "endTimeMillis must be greater than or equal to startTimeMillis");
        this.zza = j11;
        this.zzb = j12;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
    }

    @RecentlyNonNull
    public static List<SleepSegmentEvent> extractEvents(@RecentlyNonNull Intent intent) {
        Preconditions.checkNotNull(intent);
        if (!hasEvents(intent)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_RESULT");
        if (arrayList == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            byte[] bArr = (byte[]) arrayList.get(i11);
            Preconditions.checkNotNull(bArr);
            arrayList2.add((SleepSegmentEvent) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR));
        }
        return Collections.unmodifiableList(arrayList2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i11) {
        Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, getStartTimeMillis());
        SafeParcelWriter.writeLong(parcel, 2, getEndTimeMillis());
        SafeParcelWriter.writeInt(parcel, 3, getStatus());
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
