package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "ActivityRecognitionResultCreator")
@SafeParcelable.Reserved({1000})
public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<ActivityRecognitionResult> CREATOR = new zzk();

    @SafeParcelable.Field(m12889id = 1)
    List<DetectedActivity> zza;

    @SafeParcelable.Field(m12889id = 2)
    long zzb;

    @SafeParcelable.Field(m12889id = 3)
    long zzc;

    @SafeParcelable.Field(m12889id = 4)
    int zzd;

    @Nullable
    @SafeParcelable.Field(m12889id = 5)
    Bundle zze;

    @VisibleForTesting
    public ActivityRecognitionResult(@RecentlyNonNull DetectedActivity detectedActivity, long j11, long j12) {
        this(Collections.singletonList(detectedActivity), j11, j12, 0, null);
    }

    public static boolean hasResult(@Nullable Intent intent) {
        if (intent == null) {
            return false;
        }
        if (intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT")) {
            return true;
        }
        List<ActivityRecognitionResult> listZza = zza(intent);
        return (listZza == null || listZza.isEmpty()) ? false : true;
    }

    private static boolean zzb(@Nullable Bundle bundle, @Nullable Bundle bundle2) {
        int length;
        if (bundle == null) {
            return bundle2 == null;
        }
        if (bundle2 == null || bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj == null) {
                if (obj2 != null) {
                    return false;
                }
            } else if (obj instanceof Bundle) {
                if (!zzb(bundle.getBundle(str), bundle2.getBundle(str))) {
                    return false;
                }
            } else {
                if (obj.getClass().isArray()) {
                    if (obj2 != null && obj2.getClass().isArray() && (length = Array.getLength(obj)) == Array.getLength(obj2)) {
                        for (int i11 = 0; i11 < length; i11++) {
                            if (Objects.equal(Array.get(obj, i11), Array.get(obj2, i11))) {
                            }
                        }
                    }
                    return false;
                }
                if (!obj.equals(obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    @ShowFirstParty
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
            if (this.zzb == activityRecognitionResult.zzb && this.zzc == activityRecognitionResult.zzc && this.zzd == activityRecognitionResult.zzd && Objects.equal(this.zza, activityRecognitionResult.zza) && zzb(this.zze, activityRecognitionResult.zze)) {
                return true;
            }
        }
        return false;
    }

    @RecentlyNullable
    public static List<ActivityRecognitionResult> zza(@RecentlyNonNull Intent intent) {
        if (intent != null && intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST")) {
            return SafeParcelableSerializer.deserializeIterableFromIntentExtra(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST", CREATOR);
        }
        return null;
    }

    public int getActivityConfidence(int i11) {
        for (DetectedActivity detectedActivity : this.zza) {
            if (detectedActivity.getType() == i11) {
                return detectedActivity.getConfidence();
            }
        }
        return 0;
    }

    public long getElapsedRealtimeMillis() {
        return this.zzc;
    }

    @RecentlyNonNull
    public DetectedActivity getMostProbableActivity() {
        return this.zza.get(0);
    }

    @RecentlyNonNull
    public List<DetectedActivity> getProbableActivities() {
        return this.zza;
    }

    public long getTime() {
        return this.zzb;
    }

    @ShowFirstParty
    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zzb), Long.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zza, this.zze);
    }

    @RecentlyNonNull
    public String toString() {
        String strValueOf = String.valueOf(this.zza);
        long j11 = this.zzb;
        long j12 = this.zzc;
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 124);
        sb2.append("ActivityRecognitionResult [probableActivities=");
        sb2.append(strValueOf);
        sb2.append(", timeMillis=");
        sb2.append(j11);
        sb2.append(", elapsedRealtimeMillis=");
        sb2.append(j12);
        sb2.append("]");
        return sb2.toString();
    }

    public ActivityRecognitionResult(@RecentlyNonNull List<DetectedActivity> list, long j11, long j12) {
        this(list, j11, j12, 0, null);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    @RecentlyNullable
    public static ActivityRecognitionResult extractResult(@RecentlyNonNull Intent intent) {
        Bundle extras;
        ActivityRecognitionResult activityRecognitionResult;
        if (!hasResult(intent) || (extras = intent.getExtras()) == null) {
            activityRecognitionResult = null;
        } else {
            Object obj = extras.get("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT");
            if (obj instanceof byte[]) {
                activityRecognitionResult = (ActivityRecognitionResult) SafeParcelableSerializer.deserializeFromBytes((byte[]) obj, CREATOR);
            } else if (!(obj instanceof ActivityRecognitionResult)) {
                activityRecognitionResult = null;
            } else {
                activityRecognitionResult = (ActivityRecognitionResult) obj;
            }
        }
        if (activityRecognitionResult != null) {
            return activityRecognitionResult;
        }
        List<ActivityRecognitionResult> listZza = zza(intent);
        if (listZza == null || listZza.isEmpty()) {
            return null;
        }
        return listZza.get(listZza.size() - 1);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.zza, false);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeLong(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeBundle(parcel, 5, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @ShowFirstParty
    @SafeParcelable.Constructor
    public ActivityRecognitionResult(@RecentlyNonNull @SafeParcelable.Param(m12890id = 1) List<DetectedActivity> list, @SafeParcelable.Param(m12890id = 2) long j11, @SafeParcelable.Param(m12890id = 3) long j12, @SafeParcelable.Param(m12890id = 4) int i11, @Nullable @SafeParcelable.Param(m12890id = 5) Bundle bundle) {
        Preconditions.checkArgument(list != null && list.size() > 0, "Must have at least 1 detected activity");
        Preconditions.checkArgument(j11 > 0 && j12 > 0, "Must set times");
        this.zza = list;
        this.zzb = j11;
        this.zzc = j12;
        this.zzd = i11;
        this.zze = bundle;
    }
}
