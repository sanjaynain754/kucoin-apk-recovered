package com.google.android.gms.location;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
@Deprecated
public final class LocationStatusCodes {
    public static final int ERROR = 1;
    public static final int GEOFENCE_NOT_AVAILABLE = 1000;
    public static final int GEOFENCE_TOO_MANY_GEOFENCES = 1001;
    public static final int GEOFENCE_TOO_MANY_PENDING_INTENTS = 1002;
    public static final int SUCCESS = 0;

    public static int zza(int i11) {
        if ((i11 < 0 || i11 > 1) && (i11 < 1000 || i11 >= 1006)) {
            return 1;
        }
        return i11;
    }

    @RecentlyNonNull
    public static Status zzb(int i11) {
        if (i11 == 1) {
            i11 = 13;
        }
        return new Status(i11);
    }

    private LocationStatusCodes() {
    }
}
