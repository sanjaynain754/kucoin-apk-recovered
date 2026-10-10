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
@SafeParcelable.Class(creator = "SleepClassifyEventCreator")
public class SleepClassifyEvent extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<SleepClassifyEvent> CREATOR = new zzbu();

    @SafeParcelable.Field(getter = "getTimestampSec", m12889id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getConfidence", m12889id = 2)
    private final int zzb;

    @SafeParcelable.Field(getter = "getMotion", m12889id = 3)
    private final int zzc;

    @SafeParcelable.Field(getter = "getLight", m12889id = 4)
    private final int zzd;

    @SafeParcelable.Field(getter = "getNoise", m12889id = 5)
    private final int zze;

    @SafeParcelable.Field(getter = "getLightDiff", m12889id = 6)
    private final int zzf;

    @SafeParcelable.Field(getter = "getNightOrDay", m12889id = 7)
    private final int zzg;

    @SafeParcelable.Field(getter = "getConfidenceOverwrittenByAlarmClockTrigger", m12889id = 8)
    private final boolean zzh;

    @SafeParcelable.Field(getter = "getPresenceConfidence", m12889id = 9)
    private final int zzi;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepClassifyEvent)) {
            return false;
        }
        SleepClassifyEvent sleepClassifyEvent = (SleepClassifyEvent) obj;
        return this.zza == sleepClassifyEvent.zza && this.zzb == sleepClassifyEvent.zzb;
    }

    public static boolean hasEvents(@Nullable Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_CLASSIFY_RESULT");
    }

    public int getConfidence() {
        return this.zzb;
    }

    public int getLight() {
        return this.zzd;
    }

    public int getMotion() {
        return this.zzc;
    }

    public long getTimestampMillis() {
        return ((long) this.zza) * 1000;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb));
    }

    @RecentlyNonNull
    public String toString() {
        int i11 = this.zza;
        int i12 = this.zzb;
        int i13 = this.zzc;
        int i14 = this.zzd;
        StringBuilder sb2 = new StringBuilder(65);
        sb2.append(i11);
        sb2.append(" Conf:");
        sb2.append(i12);
        sb2.append(" Motion:");
        sb2.append(i13);
        sb2.append(" Light:");
        sb2.append(i14);
        return sb2.toString();
    }

    @ShowFirstParty
    @SafeParcelable.Constructor
    public SleepClassifyEvent(@SafeParcelable.Param(m12890id = 1) int i11, @SafeParcelable.Param(m12890id = 2) int i12, @SafeParcelable.Param(m12890id = 3) int i13, @SafeParcelable.Param(m12890id = 4) int i14, @SafeParcelable.Param(m12890id = 5) int i15, @SafeParcelable.Param(m12890id = 6) int i16, @SafeParcelable.Param(m12890id = 7) int i17, @SafeParcelable.Param(m12890id = 8) boolean z11, @SafeParcelable.Param(m12890id = 9) int i18) {
        this.zza = i11;
        this.zzb = i12;
        this.zzc = i13;
        this.zzd = i14;
        this.zze = i15;
        this.zzf = i16;
        this.zzg = i17;
        this.zzh = z11;
        this.zzi = i18;
    }

    @RecentlyNonNull
    public static List<SleepClassifyEvent> extractEvents(@RecentlyNonNull Intent intent) {
        Preconditions.checkNotNull(intent);
        if (!hasEvents(intent)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.internal.EXTRA_SLEEP_CLASSIFY_RESULT");
        if (arrayList == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            byte[] bArr = (byte[]) arrayList.get(i11);
            Preconditions.checkNotNull(bArr);
            arrayList2.add((SleepClassifyEvent) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR));
        }
        return Collections.unmodifiableList(arrayList2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i11) {
        Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, getConfidence());
        SafeParcelWriter.writeInt(parcel, 3, getMotion());
        SafeParcelWriter.writeInt(parcel, 4, getLight());
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeInt(parcel, 6, this.zzf);
        SafeParcelWriter.writeInt(parcel, 7, this.zzg);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzh);
        SafeParcelWriter.writeInt(parcel, 9, this.zzi);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
