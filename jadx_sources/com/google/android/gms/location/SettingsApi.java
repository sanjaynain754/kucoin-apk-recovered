package com.google.android.gms.location;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface SettingsApi {
    @RecentlyNonNull
    PendingResult<LocationSettingsResult> checkLocationSettings(@RecentlyNonNull GoogleApiClient googleApiClient, @RecentlyNonNull LocationSettingsRequest locationSettingsRequest);
}
