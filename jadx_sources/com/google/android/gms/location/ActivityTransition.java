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
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "ActivityTransitionCreator")
@SafeParcelable.Reserved({1000})
public class ActivityTransition extends AbstractSafeParcelable {
    public static final int ACTIVITY_TRANSITION_ENTER = 0;
    public static final int ACTIVITY_TRANSITION_EXIT = 1;

    @RecentlyNonNull
    public static final Parcelable.Creator<ActivityTransition> CREATOR = new zzl();

    @SafeParcelable.Field(getter = "getActivityType", m12889id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getTransitionType", m12889id = 2)
    private final int zzb;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    public static class Builder {
        private int zza = -1;
        private int zzb = -1;

        @RecentlyNonNull
        public ActivityTransition build() {
            Preconditions.checkState(this.zza != -1, "Activity type not set.");
            Preconditions.checkState(this.zzb != -1, "Activity transition type not set.");
            return new ActivityTransition(this.zza, this.zzb);
        }

        @RecentlyNonNull
        public Builder setActivityType(int i11) {
            this.zza = i11;
            return this;
        }

        @RecentlyNonNull
        public Builder setActivityTransition(int i11) {
            ActivityTransition.zza(i11);
            this.zzb = i11;
            return this;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface SupportedActivityTransition {
    }

    public static void zza(int i11) {
        boolean z11 = false;
        if (i11 >= 0 && i11 <= 1) {
            z11 = true;
        }
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("Transition type ");
        sb2.append(i11);
        sb2.append(" is not valid.");
        Preconditions.checkArgument(z11, sb2.toString());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransition)) {
            return false;
        }
        ActivityTransition activityTransition = (ActivityTransition) obj;
        return this.zza == activityTransition.zza && this.zzb == activityTransition.zzb;
    }

    public int getActivityType() {
        return this.zza;
    }

    public int getTransitionType() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb));
    }

    @RecentlyNonNull
    public String toString() {
        int i11 = this.zza;
        int i12 = this.zzb;
        StringBuilder sb2 = new StringBuilder(75);
        sb2.append("ActivityTransition [mActivityType=");
        sb2.append(i11);
        sb2.append(", mTransitionType=");
        sb2.append(i12);
        sb2.append(']');
        return sb2.toString();
    }

    @SafeParcelable.Constructor
    public ActivityTransition(@SafeParcelable.Param(m12890id = 1) int i11, @SafeParcelable.Param(m12890id = 2) int i12) {
        this.zza = i11;
        this.zzb = i12;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i11) {
        Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getActivityType());
        SafeParcelWriter.writeInt(parcel, 2, getTransitionType());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
