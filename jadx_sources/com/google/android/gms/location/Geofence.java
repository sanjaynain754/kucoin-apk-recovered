package com.google.android.gms.location;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
@VisibleForTesting
public interface Geofence {
    public static final int GEOFENCE_TRANSITION_DWELL = 4;
    public static final int GEOFENCE_TRANSITION_ENTER = 1;
    public static final int GEOFENCE_TRANSITION_EXIT = 2;
    public static final long NEVER_EXPIRE = -1;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    @VisibleForTesting
    public static final class Builder {
        private double zze;
        private double zzf;
        private float zzg;
        private String zza = null;

        @TransitionTypes
        private int zzb = 0;
        private long zzc = Long.MIN_VALUE;
        private short zzd = -1;
        private int zzh = 0;
        private int zzi = -1;

        @RecentlyNonNull
        public Geofence build() {
            String str = this.zza;
            if (str == null) {
                throw new IllegalArgumentException("Request ID not set.");
            }
            int i11 = this.zzb;
            if (i11 == 0) {
                throw new IllegalArgumentException("Transitions types not set.");
            }
            if ((i11 & 4) != 0 && this.zzi < 0) {
                throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
            }
            long j11 = this.zzc;
            if (j11 == Long.MIN_VALUE) {
                throw new IllegalArgumentException("Expiration not set.");
            }
            if (this.zzd == -1) {
                throw new IllegalArgumentException("Geofence region not set.");
            }
            int i12 = this.zzh;
            if (i12 >= 0) {
                return new com.google.android.gms.internal.location.zzbe(str, i11, (short) 1, this.zze, this.zzf, this.zzg, j11, i12, this.zzi);
            }
            throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
        }

        @RecentlyNonNull
        public Builder setExpirationDuration(long j11) {
            if (j11 < 0) {
                this.zzc = -1L;
                return this;
            }
            this.zzc = DefaultClock.getInstance().elapsedRealtime() + j11;
            return this;
        }

        @RecentlyNonNull
        public Builder setLoiteringDelay(int i11) {
            this.zzi = i11;
            return this;
        }

        @RecentlyNonNull
        public Builder setNotificationResponsiveness(@IntRange(from = 0) int i11) {
            this.zzh = i11;
            return this;
        }

        @RecentlyNonNull
        public Builder setRequestId(@RecentlyNonNull String str) {
            this.zza = (String) Preconditions.checkNotNull(str, "Request ID can't be set to null");
            return this;
        }

        @RecentlyNonNull
        public Builder setTransitionTypes(@TransitionTypes int i11) {
            this.zzb = i11;
            return this;
        }

        @RecentlyNonNull
        public Builder setCircularRegion(@FloatRange(from = -90.0d, m1552to = 90.0d) double d11, @FloatRange(from = -180.0d, m1552to = 180.0d) double d12, @FloatRange(from = 0.0d, fromInclusive = false) float f11) {
            boolean z11;
            boolean z12;
            boolean z13 = false;
            if (d11 >= -90.0d && d11 <= 90.0d) {
                z11 = true;
            } else {
                z11 = false;
            }
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("Invalid latitude: ");
            sb2.append(d11);
            Preconditions.checkArgument(z11, sb2.toString());
            if (d12 >= -180.0d && d12 <= 180.0d) {
                z12 = true;
            } else {
                z12 = false;
            }
            StringBuilder sb3 = new StringBuilder(43);
            sb3.append("Invalid longitude: ");
            sb3.append(d12);
            Preconditions.checkArgument(z12, sb3.toString());
            if (f11 > 0.0f) {
                z13 = true;
            }
            StringBuilder sb4 = new StringBuilder(31);
            sb4.append("Invalid radius: ");
            sb4.append(f11);
            Preconditions.checkArgument(z13, sb4.toString());
            this.zzd = (short) 1;
            this.zze = d11;
            this.zzf = d12;
            this.zzg = f11;
            return this;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    public @interface GeofenceTransition {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    public @interface TransitionTypes {
    }

    @RecentlyNonNull
    String getRequestId();
}
