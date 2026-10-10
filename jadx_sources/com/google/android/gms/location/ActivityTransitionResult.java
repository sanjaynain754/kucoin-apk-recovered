package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "ActivityTransitionResultCreator")
@SafeParcelable.Reserved({1000})
public class ActivityTransitionResult extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<ActivityTransitionResult> CREATOR = new zzp();

    @SafeParcelable.Field(getter = "getTransitionEvents", m12889id = 1)
    private final List<ActivityTransitionEvent> zza;

    @Nullable
    @SafeParcelable.Field(getter = "getExtras", m12889id = 2)
    private Bundle zzb;

    public ActivityTransitionResult(@RecentlyNonNull @SafeParcelable.Param(m12890id = 1) List<ActivityTransitionEvent> list) {
        this.zzb = null;
        Preconditions.checkNotNull(list, "transitionEvents list can't be null.");
        if (!list.isEmpty()) {
            for (int i11 = 1; i11 < list.size(); i11++) {
                Preconditions.checkArgument(list.get(i11).getElapsedRealTimeNanos() >= list.get(i11 + (-1)).getElapsedRealTimeNanos());
            }
        }
        this.zza = Collections.unmodifiableList(list);
    }

    public static boolean hasResult(@Nullable Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT");
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((ActivityTransitionResult) obj).zza);
    }

    @RecentlyNonNull
    public List<ActivityTransitionEvent> getTransitionEvents() {
        return this.zza;
    }

    public int hashCode() {
        return this.zza.hashCode();
    }

    @RecentlyNullable
    public static ActivityTransitionResult extractResult(@RecentlyNonNull Intent intent) {
        if (!hasResult(intent)) {
            return null;
        }
        return (ActivityTransitionResult) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT", CREATOR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i11) {
        Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, getTransitionEvents(), false);
        SafeParcelWriter.writeBundle(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @ShowFirstParty
    @SafeParcelable.Constructor
    public ActivityTransitionResult(@RecentlyNonNull @SafeParcelable.Param(m12890id = 1) List<ActivityTransitionEvent> list, @Nullable @SafeParcelable.Param(m12890id = 2) Bundle bundle) {
        this(list);
        this.zzb = bundle;
    }
}
